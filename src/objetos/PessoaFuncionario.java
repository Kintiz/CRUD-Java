package objetos;
public class PessoaFuncionario extends Pessoa{

    public PessoaFuncionario(String nome, String cargo, int idade, String cpf, Float salario) {
        super(nome, cargo, idade);
        this.cpf=cpf;
        this.salario=salario;
    }

    private String cpf;
    private double salario;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String setCpf() {
        return cpf;
    }
    public Double setSalario() {
        return salario;
    }
}
