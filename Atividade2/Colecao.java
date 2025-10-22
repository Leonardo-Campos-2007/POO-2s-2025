public class Colecao implements ItemEmprestavel{

    private String proprietario;
    private Integer quantidadeitens;


    public Colecao(String proprietario, Integer quantidadeitens) {
        this.proprietario = proprietario;
        this.quantidadeitens = quantidadeitens;
    }


    public String getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getQuantidadeitens() {
        return this.quantidadeitens;
    }

    public void setQuantidadeitens(Integer quantidadeitens) {
        this.quantidadeitens = quantidadeitens;
    }

    @Override

    public void descricao(){

            System.out.println("Proprietario: " + this.proprietario);
            System.out.println("Quantidade de Itens: " + this.quantidadeitens );
    }
    
}
