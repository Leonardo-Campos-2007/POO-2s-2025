public class Revista extends Material {

    private String autor;
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
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
    public void descricao() {

        System.out.println("Título: " + getTitulo());
        System.out.println("Ano: " + getAnoPublicacao());
        System.out.println("Edição: " + getEdicao());

    }

}
