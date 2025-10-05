public class Usuario extends Pessoa {


    private Integer matricula;

    public Usuario(String nome, String email, Integer matricula){

        super(nome, email);
        this.matricula = matricula;

    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo(){

        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matricula: " + getMatricula());
        
    }
    
}
