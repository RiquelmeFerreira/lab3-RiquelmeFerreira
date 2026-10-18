package Lab3;

import java.util.Scanner;

public class FIlmNow {
    private Filme[] filmes = new Filme[100];
    private Filme[] hotList = new Filme[10];

    public String adicionarFlme(){
        Scanner sc = new Scanner(System.in);
        System.out.print("posição> ");
        int posicao = sc.nextInt();

        System.out.print("nome> ");
        String nome = sc.nextLine();

        System.out.print("Lançamento> ");
        int ano = sc.nextInt();
        sc.nextLine();

        System.out.print("Local> ");
        String local = sc.nextLine();
        filmes[posicao] = new Filme(nome, ano, local);

        return "FILME ADICIONADO";
    }

    public String detalharFilme(){
        return "";
    }

    public String mostrarTodos(){
        return "";
    }

    public String adicionarHot(Filme[] filme, int posHot){
        return "";
    }

    public String exibirHotList(Filme[] filme, int posHot){
        return "";
    }

    public void removerHot(int[] posicao){

    }
}
