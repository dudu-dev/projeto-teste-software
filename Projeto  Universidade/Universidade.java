
public class Universidade extends Instituição {

    private int numeroAlunos;
    private Estudante aluno;
    private String departamentos;

    public int getNumeroAlunos() {
        return numeroAlunos;
    }
    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }

    public String getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String departamentos) {
        this.departamentos = departamentos;
    }

    public Estudante getAluno() {
        return aluno;
    }

    public void setAluno(Estudante aluno) {
        this.aluno = aluno;
    }


}