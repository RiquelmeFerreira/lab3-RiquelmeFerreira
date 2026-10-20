package Lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("(A)Adicionar filme\n(M)Mostrar todos\n(D)Detalhar filme\n(S)Sair\n");
            System.out.println();
            System.out.print("opção> ");
            String opcao = sc.nextLine();

            if (opcao.equals("S")) {
                break;

            } else if (!opcao.equals("A") && !opcao.equals("M") && !opcao.equals("D") && !opcao.equals("S")) {
                System.out.println("OPÇÃO INVÁLIDA!\n");

            } else if (opcao.equals("A")) {
                FilmNow s1 = new FilmNow();
                System.out.print(s1.adicionarFilme());

            } else if (opcao.equals("D")){
                FilmNow s2 = new FilmNow();
                System.out.print(s2.detalharFilme());

            } else if (opcao.equals("M")){
                FilmNow s3 = new FilmNow();
                System.out.println(s3.mostrarTodos());
            }

        }
    }
}
