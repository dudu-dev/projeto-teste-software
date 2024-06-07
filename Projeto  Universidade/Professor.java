
public class Professor extends Pessoa {

    private String nome;
    private int id;
    private String titulacao;
    private Trabalho trabalho;
    private Sessaotecnica sessaotecnica;
    private Universidade uni;
    private String disciplina;

    public Universidade getUni() {
        return uni;
    }

    public void setUni(Universidade uni) {
        this.uni = uni;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    public Sessaotecnica getSessaotecnica() {
        return sessaotecnica;
    }

    public void setSessaotecnica(Sessaotecnica sessaotecnica) {
        this.sessaotecnica = sessaotecnica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulaçao(String titulacao) {
        this.titulacao = titulacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}