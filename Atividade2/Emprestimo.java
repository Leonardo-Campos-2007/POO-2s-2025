public class Emprestimo {

    private Pessoa pessoa;
    private Material material;
    private String dataEmprestimo;
    private String dataDevolução;

    public Emprestimo(Pessoa pessoa, Material material, String dataEmprestimo, String dataDevolução){

        this.pessoa = pessoa;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolução = dataDevolução;

    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolução() {
        return dataDevolução;
    }

    public void setDataDevolução(String dataDevolução) {
        this.dataDevolução = dataDevolução;
    }
    
    void exibirDetalhes(){

        System.out.println("Detalhes do Empréstimo:");
        System.out.println("Data de Empréstimo: " + getDataEmprestimo());
        System.out.println("Data de Devolução: " + getDataDevolução());
        System.out.println("Informações da Pessoa:");
        pessoa.exibirInfo();
        System.out.println("Informações do Material:");
        material.descricao();
        

    }

    
}
