import java.util.ArrayList;

public class Profissionais extends Profissional {   
    private static ArrayList<Profissionais> profissional; 

    private Profissionais(ArrayList<Profissionais> profissional){
        profissional = new ArrayList<>();
    }

    public static final ArrayList<Profissionais> getInstancia(){
        return profissional;
    }

    public static void cadastrarProfissionais(ArrayList<Profissionais> profissional) {
        profissional.add(0, null);
    }

    public static void editarProfissionais(int id, String errouNome, String novaExperiencia) {
        for (Profissionais profissional : profissional) {
            if (profissional.getId() == id) {
                profissional.setNome(errouNome);
                profissional.setExperiencia(novaExperiencia);                
            }
        }
    }

    public static Profissional pesquisarProfissionais(int id) {
        for (Profissional profissional : profissional) {
            if (profissional.getId() == id) {
                return profissional;
            }
        }
        return null;
    }

    public static void excluirProfissionais(int id) {
        profissional.removeIf(profissional -> profissional.getId() == id);
    }
}


