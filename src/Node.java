public class Node {
    private String info;
    private Node esquerda;
    private Node direita;

    public Node(String info) {
        this.info = info;
        this.esquerda = null;
        this.direita = null;
    }
    public void setInfo(String info){
        this.info = info;
    }
    public void setEsquerda(Node esquerda){
        this.esquerda = esquerda;
    }
    public void setDireita(Node direita){
        this.direita = direita;
    }
    public String getInfo(){
        return info;
    }
    public Node getEsquerda(){
        return esquerda;
    }
    public Node getDireita(){
        return direita;
    }
}

