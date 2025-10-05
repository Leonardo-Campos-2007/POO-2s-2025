public class Livro extends Material {

    
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {

        super(titulo, anoPublicacao);
        this.autor = autor;

    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void descricao() {

        System.out.println("Título: " + getTitulo());
        System.out.println("Ano: " + getAnoPublicacao());
        System.out.println("Autor: " + getAutor());
        

    }

}
