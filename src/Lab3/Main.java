package Lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        FilmNow s1 = new FilmNow();

        while(true) {
            System.out.print("(A)Adicionar filme\n(M)Mostrar todos\n(D)Detalhar filme" +
                    "\n(E)Exibir HotList\n(H)Atribuir Hot\n(R)Remover Hot\n(S)Sair\n");
            System.out.println();
            System.out.print("opção> ");
            String opcao = sc.nextLine();

            if (opcao.equals("S")) {
                break;

            } else if (!opcao.equals("A") && !opcao.equals("M") && !opcao.equals("D") && !opcao.equals("S")) {
                System.out.println("OPÇÃO INVÁLIDA!\n\n");

            } else if (opcao.equals("A")) {
                //FilmNow s1 = new FilmNow();
                System.out.print(s1.adicionarFilme());

            } else if (opcao.equals("D")){
                //FilmNow s2 = new FilmNow();
                System.out.print(s1.detalharFilme());

            } else if (opcao.equals("M")){
                //FilmNow s3 = new FilmNow();
                System.out.println(s1.mostrarTodos());

            } else if (opcao.equals("H")){
                System.out.println(s1.atribuirHot());

            } else if (opcao.equals("E")){
                System.out.println(s1.exibirHotList());

            }


        }
    }
}
