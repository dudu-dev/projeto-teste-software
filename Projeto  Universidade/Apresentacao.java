import java.sql.Time;

public class Apresentacao {
    private Time horaApresentacao;
    private Trabalho trabalho;
    private Sessaotecnica sessaoTecnica;

    public Time getHoraApresentacao() {
        return horaApresentacao;
    }

    public void setHoraApresentacao(Time horaApresentacao) {
        this.horaApresentacao = horaApresentacao;
    }


    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    public Sessaotecnica getSessaoTecnica() {
        return sessaoTecnica;
    }
    
    public void setSessaoTecnica(Sessaotecnica sessaoTecnica) {
        this.sessaoTecnica = sessaoTecnica;
    }
}
