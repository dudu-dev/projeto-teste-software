import java.util.ArrayList;

public class App {
    public static void main(String []args){
        
        ArrayList<Profissionais> profissional1 = Profissionais.getInstancia(); 
        Profissionais.cadastrarProfissionais(profissional1);
        Profissionais.editarProfissionais(1, "Dudu", "anos");
        Profissionais.pesquisarProfissionais(1);
        Profissionais.excluirProfissionais(1);    
    }
}
