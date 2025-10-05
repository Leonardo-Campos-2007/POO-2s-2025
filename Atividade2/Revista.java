public class Revista extends Material {

    String autor;
    int edicao;

    public Revista(String titulo, int ano, int edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    public String getAutor() {
        return autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void descricao(){
        
    }
    
}
