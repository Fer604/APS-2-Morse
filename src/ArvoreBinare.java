public class ArvoreBinare {
    private Node raiz;

    public ArvoreBinare() {
        raiz = new Node(' ');
    }

    public Node getRaiz() {
        return raiz;
    }

    public void inserir(String codigo, char caracter) {
        Node atual = raiz;

        for (int i = 0; i < codigo.length(); i++) {
            char simbolo = codigo.charAt(i);

            if (simbolo == '.') {
                if (atual.getEsquerda() == null)
                    atual.setEsquerda(new Node(' '));
                atual = atual.getEsquerda();

            } else if (simbolo == '-') {
                if (atual.getDireita() == null)
                    atual.setDireita(new Node(' '));
                atual = atual.getDireita();
            }
        }
        atual.setInfo(caracter);
    }

    public void exibir(Node no, int nivel) {
        if (no != null) {
            for (int i = 0; i < nivel; i++)
                System.out.print("--");

            System.out.println(no.getCaracter());

            exibir(no.getEsquerda(), nivel + 1);
            exibir(no.getDireita(), nivel + 1);
        }
    }

    public char buscar(String codigo) {
        Node atual = raiz;

        for (int i = 0; i < codigo.length(); i++) {
            char simbolo = codigo.charAt(i);

            if (simbolo == '.')
                atual = atual.getEsquerda();

            else if (simbolo == '-')
                atual = atual.getDireita();

            if (atual == null) {
                System.out.println("Codigo nao encontrado: " + codigo);
                return '?';
            }
        }
        char encontrado = atual.getCaracter();

        if (encontrado == ' ')
            System.out.println("Codigo existe mas nao possui caracter associado: " + codigo);
        else
            System.out.println("Caracter encontrado: " + encontrado + " para codigo: " + codigo);

        return encontrado;
    }

    public void remover(String codigo) {
        Node atual = raiz;

        for (int i = 0; i < codigo.length(); i++) {

            char simbolo = codigo.charAt(i);
            if (simbolo == '.') {
                if (atual.getEsquerda() == null) {
                    System.out.println("Codigo nao encontrado para remover: " + codigo);
                    return;
                }
                atual = atual.getEsquerda();

            } else if (simbolo == '-') {
                if (atual.getDireita() == null) {
                    System.out.println("Codigo nao encontrado para remover: " + codigo);
                    return;
                }
                atual = atual.getDireita();

            } else {
                System.out.println("Simbolo invalido no codigo: " + simbolo);
                return;
            }
        }
        atual.setInfo(' ');
        System.out.println("Removido caracter associado ao codigo: " + codigo);
    }

    public String getMorseEquivalente(char caracter) {

        if (caracter == ' ')
            return null;

        String resultado = getMorseEquivalenteRec(raiz, caracter, "");

        if (resultado == null)
            System.out.println("Caracter nao encontrado na arvore: " + caracter);
        else
            System.out.println("Codigo morse para " + caracter + " = " + resultado);
        return resultado;
    }

    private String getMorseEquivalenteRec(Node no, char target, String caminho) {

        if (no == null)
            return null;

        if (Character.toUpperCase(no.getCaracter()) == Character.toUpperCase(target))
            return caminho;
        
        String left = getMorseEquivalenteRec(no.getEsquerda(), target, caminho + ".");
        if (left != null)
            return left;

        String right = getMorseEquivalenteRec(no.getDireita(), target, caminho + "-");
        if (right != null)
            return right;

        return null;
    }
}
