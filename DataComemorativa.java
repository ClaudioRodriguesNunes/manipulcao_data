public class DataComemorativa {
    private String nome;
    private String data_comemorativa;
    private boolean feriado, mundial;

    public DataComemorativa(String n, String dc, boolean f, boolean m) {
        this.nome = n;
        this.data_comemorativa = dc;
        this.feriado = f;
        this.mundial = m;
    }

    public String getNome() {
        return nome;
    }

    public String getData_comemorativa() {
        return data_comemorativa;
    }

    public boolean isFeriado() {
        return feriado;
    }

    public boolean isMundial() {
        return mundial;
    }
}
