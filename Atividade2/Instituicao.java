
public class Instituicao implements TomadorEmprestimo{

    private String nome;
    private String cpnj;
    private String cidade;

    public Instituicao(String nome, String cpnj, String cidade) {
        this.nome = nome;
        this.cpnj = cpnj;
        this.cidade = cidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpnj() {
        return this.cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

   @Override

    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPNJ: " + this.cpnj);
        System.out.println("Cidade: " + this.cidade);
    }

}
