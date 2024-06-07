public class Profissional extends Pessoa {
    private int id;
    private String nome;
    private Empresa empresa;
    private String experiencia;
    private Minicurso minicurso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public Minicurso getMinicurso() {
        return minicurso;
    }

    public void setMinicurso(Minicurso minicurso) {
        this.minicurso = minicurso;
    }

}