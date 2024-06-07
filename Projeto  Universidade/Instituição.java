
public abstract class Instituição {

    private int cnpj;
    private String nome;
    private Pessoa pessoa;

    public int getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}