
public class Main {
    public static void main(String[] args) {
        //teste
        ArvreBinare arvore = new ArvreBinare();
        arvore.inserir("...", 'S');
        arvore.inserir("---", 'O');
        arvore.inserir("... --- ...", ' ');
        arvore.exibir(arvore.getRaiz(), 0);
    }
}