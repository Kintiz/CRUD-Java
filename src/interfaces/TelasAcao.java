package interfaces;
public class TelasAcao {

    public void tela(Telas telas){
        System.out.println("");
        telas.tela();
    }
    public void mensagem(Telas telas){
        System.out.println("");
        telas.mensagem();
    }
    public void menu(Telas telas){
        telas.menu();
    }
    public void crud(Telas telas){
        System.out.println("");
        telas.crud();
    }
    public void informacoes(Telas telas){
        System.out.println("");
        telas.informacoes();
    }
    public void print(Telas telas){
        System.out.println("");
        telas.print();
    }
}
