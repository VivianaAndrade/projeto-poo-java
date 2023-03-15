import javax.lang.model.util.ElementScanner6;

public class Funcionario {
   
    //Atributosdaclasse
    private String matricula;
    private String nome;
    private String cargo;
    private double salario;

    //Construtor da classe (padrão)
    public Funcionario () {
    //implicito - mesmo se não criar ele existe na classe.
    } 
    
    //Metodos setter: incluir dados no objeto.
    public void setMatricula(String matricula) {
        this.matricula = matricula; 
    //recebe o valor e guardar no atributo matricula.
    }
    public void setNome(String nome) {
        this.nome= nome; 
    }
    public void setCargo(String cargo) {
        this.cargo= cargo; 
    }
    public void setSalario(double salario) {
        this.salario= salario;
    }

    //Metodos getter (tira o valor armazenado no objeto)

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void reajustarSalario(){
        if(this.cargo.equalsIgnoreCase("gerente")){
            this.salario = this.salario * 1.10; //aumenta em 10%
        }else if (this.cargo.equalsIgnoreCase("vendedor")){
            this.salario = this.salario * 1.05; //aumenta em 5%
    }else{
        this.salario = this.salario * 1.01; //aumenta em 1%
    }
  }
}