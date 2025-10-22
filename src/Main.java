import java.util.Scanner;

public class Main {
    public static void menu(ArvreBinare arvre,Scanner scan){
        System.out.println("---MENU---");
        System.out.println("1. Inserir");
        System.out.println("2. Buscar");
        System.out.println("3. Sair");
        int opcao = scan.nextInt();
        switch(opcao){
            case 1:
                System.out.println("Digite o caracter:");
                char caracter = scan.next().charAt(0);
                System.out.println("Digite o codigo:");
                String codigo = scan.next();
                arvre.inserir(codigo,caracter);
                break;
            case 2:
        }


    }
    public static void main(String[] args) {
        //teste
        ArvreBinare arvore = new ArvreBinare();


        arvore.inserir(".-", 'A');
        arvore.inserir("-...", 'B');
        arvore.inserir("-.-.", 'C');
        arvore.inserir("-..", 'D');
        arvore.inserir(".", 'E');
        arvore.inserir("..-.", 'F');
        arvore.inserir("--.", 'G');
        arvore.inserir("....", 'H');
        arvore.inserir("..", 'I');
        arvore.inserir(".---", 'J');
        arvore.inserir("-.-", 'K');
        arvore.inserir(".-..", 'L');
        arvore.inserir("--", 'M');
        arvore.inserir("-.", 'N');
        arvore.inserir("---", 'O');
        arvore.inserir(".--.", 'P');
        arvore.inserir("--.-", 'Q');
        arvore.inserir(".-.", 'R');
        arvore.inserir("...", 'S');
        arvore.inserir("-", 'T');
        arvore.inserir("..-", 'U');
        arvore.inserir("...-", 'V');
        arvore.inserir(".--", 'W');
        arvore.inserir("-..-", 'X');
        arvore.inserir("-.--", 'Y');
        arvore.inserir("--..", 'Z');


        Scanner scan = new Scanner(System.in);
        menu(arvore,scan);

    }

}