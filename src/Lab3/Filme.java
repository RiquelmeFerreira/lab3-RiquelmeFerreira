package Lab3;

public class Filme {
    public String nome;
    private int lancamento;
    private String local;
    private int posicao;
    private boolean hot;

    public Filme(String nome, int lancamento, String local) {
        this.nome = nome;
        this.lancamento = lancamento;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public int getLancamento() {
        return lancamento;
    }

    public String getLocal() {
        return local;
    }

    public boolean getHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public boolean equals(int ano) {
        return true;
    }

    @Override
    public String toString() {
        return nome + ", " + lancamento + ", " + local;
    }
}
