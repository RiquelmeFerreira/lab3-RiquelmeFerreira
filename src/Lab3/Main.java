package Lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("(A)Adicionar filme\n(M)Mostrar todos\n(D)Detalhar filme\n(S)Sair\n");
            System.out.print("opção> ");
            String opcao = sc.nextLine();

            if (opcao == "S") {
                break;
            } else if (opcao != "A" && opcao != "M" && opcao != "D" && opcao != "S") {
                System.out.println("OPÇÃO INVÁLIDA!\n");
            }
        }
    }
}
