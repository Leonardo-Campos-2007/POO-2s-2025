public class Livro extends Material {

    String edicao;
    String autor;

    public Livro(String titulo, int ano, String autor) {

        super(titulo, ano);
        this.autor = autor;

    }


    public String getAutor() {
        return autor;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    @Override
    public void descricao() {

    }

}
