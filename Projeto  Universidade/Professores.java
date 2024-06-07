import java.util.ArrayList;

public class Professores extends Professor {

    private static ArrayList<Professores> professores;

    private Professores(ArrayList<Professores> professores){
        professores = new ArrayList<>();
    }

    public static final ArrayList<Professores> getInstancia(){
        return professores;
    }

    public static void cadastrarProfessores(Professores professor) {
        professores.add(professor);
    }

    public static void editarProfessores(int id, String errouNome, String novaTitulacao, Universidade novaUni, String novaDisciplina) {
        for (Professor professor : professores) {
            if (professor.getId() == id) {
                professor.setNome(errouNome);
                professor.setTitulaçao(novaTitulacao);
                professor.setUni(novaUni);
                professor.setDisciplina(novaDisciplina);
            }
        }
    }

    public static Professor pesquisarProfessores(int id) {
        for (Professor professor : professores) {
            if (professor.getId() == id) {
                return professor;
            }
        }
        return null;
    }

    public static void excluirProfessores(int id) {
        professores.removeIf(professor -> professor.getId() == id);
    }
}

    

