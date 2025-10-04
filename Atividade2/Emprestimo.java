public class Emprestimo {

    Pessoa pessoa;
    Material material;
    String dataEmprestimo;
    String dataDevolução;

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

    }

    
}
