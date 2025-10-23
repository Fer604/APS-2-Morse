import java.util.Scanner;

public class Main {
    public static void menu(ArvoreBinare arvore,Scanner scan){
        System.out.println("---MENU---");
        System.out.println("1. Inserir");
        System.out.println("2. Buscar");
        System.out.println("3. Remover");
        System.out.println("0. Sair");
        int opcao = scan.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Digite o caracter:");
                char caracter = scan.next().charAt(0);
                System.out.println("Digite o codigo:");
                String codigo = scan.next();
                arvore.inserir(codigo,caracter);
                break;
            
            case 2:
                System.out.println("Digite o codigo:");
                String codigo2 = scan.next();
                arvore.buscar(codigo2);
                break;
            
            case 3:
                System.out.println("Digite o codigo:");
                String codigo3 = scan.next();
                arvore.remover(codigo3);
                break;
            
            default:
                return;
        }
        menu(arvore,scan);
    }
    public static void main(String[] args) {
        //teste
        ArvoreBinare arvore = new ArvoreBinare();

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
        arvore.inserir(".----", '1');
        arvore.inserir("..---", '2');
        arvore.inserir("...--", '3');
        arvore.inserir("....-", '4');
        arvore.inserir(".....", '5');
        arvore.inserir("-....", '6');
        arvore.inserir("--...", '7');
        arvore.inserir("---..", '8');
        arvore.inserir("----.", '9');
        arvore.inserir("-----", '0');
        arvore.exibir(arvore.getRaiz(), 0);

        Scanner scan = new Scanner(System.in);
        menu(arvore,scan);

    }

}