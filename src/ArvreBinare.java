public class ArvreBinare {
    private Node raiz;
    public ArvreBinare() {
        this.raiz = null;
    }

    public Node getRaiz() {//serve pra poder chamar as funções recursivas sem ter que fazer isso nessa classe
        return raiz;
    }

    public void inserir(char info) {//recursão é para os fracos
        Boolean cheguemoNoFim = false;
        Node no =  new Node(info);
        if (raiz == null) {
            raiz = no;
        }
        else {
            Node atual = raiz;
            while (!cheguemoNoFim) {
                if (atual.getInfo() < info) {
                    if (atual.getDireita() == null) {
                        atual.setDireita(no);
                        cheguemoNoFim = true;}
                    else{
                        atual =  atual.getDireita();
                    }
                }
                if(atual.getInfo() > info){
                    if (atual.getEsquerda() == null) {
                        atual.setEsquerda(no);
                        cheguemoNoFim = true;}
                    else{
                        atual =  atual.getEsquerda();
                    }
                }
                if(atual.getInfo() ==info){
                    break;
                    //não tenho ctz se é isso que é pra fazer com elemento igual no exemplo dado nehum dos elemento repetidos
                    //foram imprimidos então é como se eles não existissem
                }

            }
        }
    }
    public void preOrdem(Node no){//eu sou fraco :(
        if (no != null) {
            System.out.print(no.getInfo()+"->");
            preOrdem(no.getEsquerda());
            preOrdem(no.getDireita());

        }
//        Node atual = raiz;
//        System.out.println("Pre Ordem");
//        System.out.println(raiz.getInfo());
//        while(raiz.getEsquerda() != null){
//            System.out.println(raiz.getEsquerda().getInfo());
//            atual = atual.getEsquerda();
//        }
    }
    public void inOrdem(Node no){
        if (no != null) {
            inOrdem(no.getEsquerda());
            System.out.print(no.getInfo()+"->");
            inOrdem(no.getDireita());
        }
    }
    public void posOrdem(Node no){
        if (no != null) {
            posOrdem(no.getEsquerda());
            posOrdem(no.getDireita());
            System.out.print(no.getInfo()+"->");
        }

    }





}
