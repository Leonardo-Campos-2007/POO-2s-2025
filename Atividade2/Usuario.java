public class Usuario extends Pessoa {


    Integer matricula;

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
        
    }
    
}
