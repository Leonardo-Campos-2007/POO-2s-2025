public class Emprestimo {

    private TomadorEmprestimo tomadorEmprestimo;
    private ItemEmprestavel itemEmprestavel;
    private String dataEmprestimo;
    private String dataDevolução;


    public Emprestimo(TomadorEmprestimo tomadorEmprestimo, ItemEmprestavel material, String dataEmprestimo, String dataDevolução) {
        this.tomadorEmprestimo = tomadorEmprestimo;
        this.itemEmprestavel = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolução = dataDevolução;
    }


    public TomadorEmprestimo getTomadorEmprestimo() {
        return this.tomadorEmprestimo;
    }

    public void setTomadorEmprestimo(TomadorEmprestimo tomadorEmprestimo) {
        this.tomadorEmprestimo = tomadorEmprestimo;
    }

    public ItemEmprestavel getItemEmprestavel() {
        return this.itemEmprestavel;
    }

    public void setItemEmprestavel(ItemEmprestavel itemEmprestavel) {
        this.itemEmprestavel = itemEmprestavel;
    }

    public String getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolução() {
        return this.dataDevolução;
    }

    public void setDataDevolução(String dataDevolução) {
        this.dataDevolução = dataDevolução;
    }


    
    
    
    void exibirDetalhes(){

        System.out.println("Detalhes do Empréstimo:");
        System.out.println("Data de Empréstimo: " + this.getDataEmprestimo());
        System.out.println("Data de Devolução: " + this.getDataDevolução());
        System.out.println("Informações da Instituição:");
        this.tomadorEmprestimo.exibirInfo();
        System.out.println("Informações do Material:");
        this.itemEmprestavel.descricao();
        

    }

    
}
