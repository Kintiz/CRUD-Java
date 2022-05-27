package objetos;
public class Pessoa {

    private String nome;
    private String cargo;
    private int idade;
    
    public Pessoa (String nome,String cargo, int idade){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int setIdade() {
        return idade;
    }
    public String setCargo() {
        return cargo;
    }
    public String setNome() {
        return nome;
    }
    @Override
    public String toString(){
        return "-Nome: "+nome+"\n-Cargo: "+cargo+"\n-Idade: "+idade;
    }

}
