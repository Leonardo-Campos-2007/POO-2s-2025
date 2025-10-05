public class Funcionario extends Pessoa {

   private String cargo;

    public Funcionario(String nome, String email, String cargo){
        super(nome, email);
        this.cargo = cargo;

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    @Override
   public void exibirInfo(){

        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Cargo: " + getCargo());

    }
    
}
