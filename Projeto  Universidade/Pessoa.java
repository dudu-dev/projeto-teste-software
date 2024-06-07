public abstract class Pessoa {

    private String nome;
    private String endereco;
    private Sessaotecnica sessaotecnica;
    private Minicurso minicurso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    

    public Sessaotecnica getSessaotecnica() {
        return sessaotecnica;
    }

    public void setSessaotecnica(Sessaotecnica sessaotecnica) {
        this.sessaotecnica = sessaotecnica;
    }

    public Minicurso getMinicurso() {
        return minicurso;
    }

    public void setMinicurso(Minicurso minicurso) {
        this.minicurso = minicurso;
    }

}