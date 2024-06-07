import java.util.ArrayList;

public class Estudantes extends Estudante {

    private static ArrayList<Estudantes> estudantes;

    private Estudantes(ArrayList<Estudantes> estudantes){
        estudantes = new ArrayList<>();
    }

    public static final ArrayList<Estudantes> getInstancia(){
        return estudantes;
    }

    public static void cadastrarEstudantes(Estudantes estudante) {
        estudantes.add(estudante);
    }

    public static void editarEstudantes(int id, String novoNome, String novoCurso, Universidade novaUni, String novoTrabalho) {
        for (Estudante estudante : estudantes) {
            if (estudante.getId() == id) {
                estudante.setNome(novoNome);
                estudante.setCurso(novoCurso);
                estudante.setUni(novaUni);
                estudante.setTrabalho(novoTrabalho);
            }
        }
    }

    public static Estudante pesquisarEstudantes(int id) {
        for (Estudante estudante : estudantes) {
            if (estudante.getId() == id) {
                return estudante;
            }
        }
        return null;
    }

    public static void excluirEstudantes(int id) {
        estudantes.removeIf(estudante -> estudante.getId() == id);
    }
}


