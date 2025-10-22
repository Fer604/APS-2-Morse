public class Node {
    private char info;
    private Node esquerda;
    private Node direita;

    public Node(char info) {
        this.info = info;
        this.esquerda = null;
        this.direita = null;
    }
    public void setInfo(char info){
        this.info = info;
    }
    public void setEsquerda(Node esquerda){
        this.esquerda = esquerda;
    }
    public void setDireita(Node direita){
        this.direita = direita;
    }
    public char getCaracter(){
        return info;
    }
    public Node getEsquerda(){
        return esquerda;
    }
    public Node getDireita(){
        return direita;
    }
}

