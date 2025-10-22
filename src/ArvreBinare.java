public class ArvreBinare {
    private Node raiz;
    public ArvreBinare() {
        raiz = new Node(' ');
    }

    public Node getRaiz() {//serve pra poder chamar as funções recursivas sem ter que fazer isso nessa classe
        return raiz;
    }

    public void inserir(String codigo, char caracter) {
        Node atual = raiz;
        for (int i = 0; i < codigo.length(); i++) {
            char simbolo = codigo.charAt(i);
            if (simbolo == '.') {
                if (atual.getEsquerda() == null) atual.setEsquerda(new Node(' '));
                atual = atual.getEsquerda();
            } else if (simbolo == '-') {
                if (atual.getDireita() == null) atual.setDireita(new Node(' '));
                atual = atual.getDireita();
            }
        }
        atual.setInfo(caracter);
    }
    public void exibir(Node no, int nivel) {
        if (no != null) {
            for (int i = 0; i < nivel; i++) System.out.print("--");
            System.out.println(no.getCaracter());
            exibir(no.getEsquerda(), nivel + 1);
            exibir(no.getDireita(), nivel + 1);
        }
    }
//    public void preOrdem(Node no){//eu sou fraco :(
//        if (no != null) {
//            System.out.print(no.getCaracter()+"->");
//            preOrdem(no.getEsquerda());
//            preOrdem(no.getDireita());
//
//        }
//        Node atual = raiz;
//        System.out.println("Pre Ordem");
//        System.out.println(raiz.getInfo());
//        while(raiz.getEsquerda() != null){
//            System.out.println(raiz.getEsquerda().getInfo());
//            atual = atual.getEsquerda();
//        }
//    }
//    public void inOrdem(Node no){
//        if (no != null) {
//            inOrdem(no.getEsquerda());
//            System.out.print(no.getInfo()+"->");
//            inOrdem(no.getDireita());
//        }
//    }
//    public void posOrdem(Node no){
//        if (no != null) {
//            posOrdem(no.getEsquerda());
//            posOrdem(no.getDireita());
//            System.out.print(no.getInfo()+"->");
//        }
//
//    }

}
