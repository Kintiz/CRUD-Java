package objetos;

public class PessoaDono extends Pessoa {

    public PessoaDono(String nome,String cargo, int idade, String cnpj, Float valor) {
        super(nome, cargo, idade);
        this.cnpj=cnpj;
        this.valor=valor;
    }

    private String cnpj;
    private Float valor;

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Float getValor() {
        return valor;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
    public String setCnpj() {
        return cnpj;
    }
    public Float setValor() {
        return valor;
    }
    @Override
    public String toString(){
        return(super.toString()+"|Cnpj: "+cnpj+"|Valor: "+valor);
    }
}
