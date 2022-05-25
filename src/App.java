import java.util.Scanner;

import interfaces.TelasAcao;
import interfaces.TelaIngles;
import interfaces.TelaEspanhol;
import interfaces.TelaPortugues;

public class App {

    public static void telaInicial(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Selecione uma tela inicial 1(English) 2(Spanish) 3(Português-BR)");
        int opcao=scan.nextInt();
        if(opcao==1){
            TelaIngles tl1 =new TelaIngles();
            TelasAcao program =new TelasAcao();
            program.tela(tl1);
            program.mensagem(tl1);
            program.crud(tl1);
            program.informacoes(tl1);
        }else if(opcao==2){
            TelaEspanhol tl1 =new TelaEspanhol();
            TelasAcao program =new TelasAcao();
            program.tela(tl1);
            program.mensagem(tl1);
            program.crud(tl1);
            program.informacoes(tl1);
        }else if(opcao==3){
            TelaPortugues tl1 =new TelaPortugues();
            TelasAcao program =new TelasAcao();
            program.tela(tl1);
            program.mensagem(tl1);
            program.crud(tl1);
            program.informacoes(tl1);
        }else{
            System.out.println("Número não encontrado");
        }
    }

    public static void main(String[] args) throws Exception {
        telaInicial();
        //crud();
        //informacoes();
    }
}

