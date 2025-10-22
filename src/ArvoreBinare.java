public class ArvoreBinare {
    private Node raiz;

    public ArvoreBinare() {
        raiz = new Node(' ');
    }

    public Node getRaiz() {// serve pra poder chamar as funções recursivas sem ter que fazer isso nessa
                           // classe
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

            if (atual == null)
                return '?'; // não encontrado
        }
        return atual.getCaracter();
    }

    public void remover(String codigo) {
        Node atual = raiz;
        for (int i = 0; i < codigo.length(); i++) {
            char simbolo = codigo.charAt(i);
            if (simbolo == '.')
                atual = atual.getEsquerda();
            else if (simbolo == '-')
                atual = atual.getDireita();
        }
        atual.setInfo(' ');
    }

    // public void preOrdem(Node no){//eu sou fraco :(
    // if (no != null) {
    // System.out.print(no.getCaracter()+"->");
    // preOrdem(no.getEsquerda());
    // preOrdem(no.getDireita());
    //
    // }
    // Node atual = raiz;
    // System.out.println("Pre Ordem");
    // System.out.println(raiz.getInfo());
    // while(raiz.getEsquerda() != null){
    // System.out.println(raiz.getEsquerda().getInfo());
    // atual = atual.getEsquerda();
    // }
    // }
    public String getMorseEquivalente(char caracter) {
        return "oi";
    }
    // public void posOrdem(Node no){
    // if (no != null) {
    // posOrdem(no.getEsquerda());
    // posOrdem(no.getDireita());
    // System.out.print(no.getInfo()+"->");
    // }
    //
    // }

}
