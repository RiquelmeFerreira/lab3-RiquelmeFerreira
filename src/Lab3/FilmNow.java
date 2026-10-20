package Lab3;

import java.util.Scanner;

public class FilmNow {
    private Filme[] filmes = new Filme[100];
    private Filme[] hotList = new Filme[10];

    Scanner sc = new Scanner(System.in);

    public String adicionarFilme() {
        //Scanner sc = new Scanner(System.in);
        System.out.print("posição> ");
        int posicao = sc.nextInt();

        if (posicao < 1 || posicao > 100) {
            return "POSIÇÃO INVÁLIDA\n";
        } else {
            System.out.print("nome> ");
            // int posicao = Integer.parseInt(sc.nextLine());
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Lançamento> ");
            int ano = sc.nextInt();

            System.out.print("Local> ");
            sc.nextLine();
            String local = sc.nextLine();


            if (nome.equals("") || local.equals("")) {
                return "FILME INVALIDO\n\n";
            }
            for (int i = 0; i < filmes.length; i++) {
                if (filmes[i] != null && filmes[i].getNome().equals(nome) && filmes[i].getLancamento() == ano) {
                    return "FILME JA ADICIONADO";
                }
            }
            filmes[posicao-1] = new Filme(nome, ano, local);
            return "FILME ADICIONADO\n\n";
        }
    }

    public String detalharFilme () {
        Scanner sc = new Scanner(System.in);
        System.out.print("posição> ");
        int pos = sc.nextInt();

        if (pos < 1 || pos > filmes.length || filmes[pos-1] == null){
            return "POSIÇÃO INVÁLIDA\n\n";
        }
        return "\n" + filmes[pos-1].getNome() + ", " + filmes[pos-1].getLancamento() +
                "\n" + filmes[pos-1].getLocal()+"\n\n";
    }

    public String mostrarTodos() {
        String saida = "";
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] != null) {
                saida += (i+1) + " - " + filmes[i].getNome() + "\n";
            }
        }
        return saida;
    }

    public String atribuirHot (){
        System.out.print("Filme> ");
        int filme = sc.nextInt();
        System.out.print("Posicao> ");
        int posHot = sc.nextInt();

        if (posHot >= 1 || posHot <= 10){
            return "ADICIONADO À HOTLIST NA POSIÇÃO " + posHot + "!";
        }
        return "";
    }

    public String exibirHotList (){
        String saida = "";
        for (int i = 0; i < hotList.length; i++){
            if (hotList[i] != null){
                saida += (i+1) + hotList[i].getNome() + ", " + hotList[i].getLancamento();
            }
            return saida;
        }
        return "";
    }
    public void removerHot (){

    }
}


