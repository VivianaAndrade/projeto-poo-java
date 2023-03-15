import javax.swing.JOptionPane;

public class ControleFuncionarios {
    public static void main(String[] args) {

         //O objeto armazena dados de varios tipos
        //nomedaclasse+nomeobjetocriado

        Funcionario funcionario;

        //Instancia um objeto(funcionario) da classe Funcionario
        funcionario = new Funcionario(); 
        /*new gera uma área da memória vazia para o objeto criado,
        chamando o construtor da classe Funcionario*/

        funcionario.setMatricula(JOptionPane.showInputDialog("Matricula:"));
        funcionario.setNome(JOptionPane.showInputDialog("Nome:"));
        funcionario.setCargo(JOptionPane.showInputDialog("Cargo:"));
        funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario:")));
    
        //exibir dados cadastrados no objeto
        JOptionPane.showMessageDialog(null, "matricula"+ funcionario.getMatricula());
        JOptionPane.showMessageDialog(null, "nome"+ funcionario.getNome());
        JOptionPane.showMessageDialog(null, "cargo"+ funcionario.getCargo());
        JOptionPane.showMessageDialog(null, "salario"+ funcionario.getSalario());

        funcionario.reajustarSalario();
        JOptionPane.showMessageDialog(null, "Salario reajustado:"+ funcionario.getSalario());
    }
}
