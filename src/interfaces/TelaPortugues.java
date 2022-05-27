package interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import objetos.PessoaDono;
import objetos.PessoaFuncionario;
import polimorfismo.InformacoesDoDesenvolvedor;
import polimorfismo.InformacoesDoDesenvolvimento;

public class TelaPortugues implements Telas{

    @Override
    public void tela() {
        System.out.println("****************************************");
        System.out.println("*                                      *");
        System.out.println("*             Bem-Vindo                *");
        System.out.println("*                                      *");
        System.out.println("****************************************");
        
    }

    @Override
    public void mensagem() {
        System.out.println("Bem vindo a selva!");
        System.out.println("Agora vamos ver um CRUD(CRIAR, LER, ATUALIZAR E DELETAR)");
        System.out.println("Este CRUD foi feito em Java");

    }

    @Override
    public String menu(){
        Scanner scan=new Scanner(System.in);
        String opcao=scan.nextLine();
        return opcao;
    }
    
    @Override
    public void print(){
        System.out.println("********************");
        System.out.println("Digite um numero:");
        System.out.println("1- registrar:");
        System.out.println("2- listar:");
        System.out.println("3- atualizar:");
        System.out.println("4- deletar:");
        System.out.println("5- sair:");
        System.out.println("********************");
    }
        
    @Override
    public void crud(){

        Collection<PessoaDono> dono=new ArrayList<>();
        Collection<PessoaFuncionario> funcionario=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        int fim=0;

        do{
            print();
            switch(menu()){

                case"1":
                    System.out.println("Você é dono(1) ou funcionario(2)?");
                    int funcao=scan.nextInt();

                    if(funcao==1){

                        System.out.println("Registrar:");
                        System.out.println("Digite o nome:");
                        scan.nextLine();
                        String nome=scan.nextLine();
                        System.out.println("Digite seu cargo:");
                        String cargo=scan.nextLine();
                        System.out.println("Digite sua idade:");
                        int idade=scan.nextInt();
                        System.out.println("Digite seu Cnpj:");
                        scan.nextLine();
                        String cnpj=scan.nextLine();
                        System.out.println("Digite o valor da sua empresa:");
                        float valor=scan.nextFloat();

                        PessoaDono donos=new PessoaDono(nome, cargo, idade, cnpj, valor);
                        dono.add(donos);

                    }else if (funcao==2){
                        System.out.println("Registrar:");
                        System.out.println("Digite o nome:");
                        scan.nextLine();
                        String nome=scan.nextLine();
                        System.out.println("Digite o cargo:");
                        String cargo=scan.nextLine();
                        System.out.println("Digite o idade:");
                        int idade=scan.nextInt();
                        System.out.println("Digite o seu cpf:");
                        scan.nextLine();
                        String cpf=scan.nextLine();
                        System.out.println("Digite o seu salario:");
                        float salario=scan.nextFloat();

                        PessoaFuncionario funcionarios=new PessoaFuncionario(nome, cargo, idade, cpf, salario);
                        funcionario.add(funcionarios);

                    }else {
                        System.out.println("Função não encontrada");
                    }
                    fim =1;
                        System.out.println("********************");
                        System.out.println("Registro Finalizado!");
                break;

                case"2":

                    System.out.println("Deseja imprimir a lista de donos(1) ou funcionario(2)?");
                    int funcao1=scan.nextInt(); 

                    if(funcao1==1){
                        System.out.println("Donos:");
                        System.out.println("");
                        Iterator<PessoaDono> i=dono.iterator();

                        while(i.hasNext()){
                            PessoaDono temp=i.next();
                            System.out.println(temp.toString());
                        }
                        System.out.println("");
                        System.out.println("********************");

                    } else if(funcao1==2){

                        System.out.println("Funcionarios");
                        System.out.println("");

                        Iterator<PessoaFuncionario> n=funcionario.iterator();
                        while(n.hasNext()){
                            PessoaFuncionario temp=n.next();
                            System.out.println(temp.toString());
                        }
                        System.out.println("");
                        System.out.println("********************");

                    } else {
                        System.out.println("Função não encontrada");
                    }
                    
                    System.out.println("Visualização completa");
                    fim=2;
                    break;
                case"3":
                    System.out.println("Você deseja atualizar um dono(1) ou funcionario(2)?");
                    int funcao2=scan.nextInt();
                    boolean positivo=false;
                    String cnpjj, cpff;

                    if(funcao2==1){

                        System.out.println("Informe o cnpj do dono a ser atualizado:");
                        scan.nextLine();
                        cnpjj=scan.nextLine();

                        Collection<PessoaDono> lista=new ArrayList<>();
                        Iterator<PessoaDono> i=dono.iterator();

                        while(i.hasNext()){
                            PessoaDono temp=i.next();

                          if(temp.getCnpj().equals(cnpjj)){

                            System.out.println("Atualizar:");
                            System.out.println("Digite o nome:");
                            String nome=scan.nextLine();
                            System.out.println("Digite seu cargo:");
                            String cargo=scan.nextLine();
                            System.out.println("Digite sua idade:");
                            int idade=scan.nextInt();
                            System.out.println("Digite seu Cnpj:");
                            scan.nextLine();
                            String cnpj=scan.nextLine();
                            System.out.println("Digite o valor da sua empresa:");
                            float valor=scan.nextFloat();
    
                            PessoaDono dados=new PessoaDono(nome, cargo, idade, cnpj, valor);
                            lista.add(dados);
                            positivo=true;
                            
                            } else{
                                lista.add(temp);
                            }
                            dono=lista;
                            
                            System.out.println("");
                            System.out.println("Alteração realizada com sucesso");
                        }

                        if(!positivo){
                            System.out.println("Cnpj não existe");
                        }
                        
                    } else if(funcao2==2){

                        System.out.println("Informe o cpf do funcionario a ser atualizado:");
                        scan.nextLine();
                        cpff=scan.nextLine();

                        Collection<PessoaFuncionario> lista1=new ArrayList<>();
                        Iterator<PessoaFuncionario> n=funcionario.iterator();

                        while(n.hasNext()){
                            PessoaFuncionario temp=n.next();

                          if(temp.getCpf().equals(cpff)){

                            System.out.println("Atualizar:");
                            System.out.println("Digite o nome:");
                            String nome=scan.nextLine();
                            System.out.println("Digite seu cargo:");
                            String cargo=scan.nextLine();
                            System.out.println("Digite sua idade:");
                            int idade=scan.nextInt();
                            System.out.println("Digite seu cpf:");
                            scan.nextLine();
                            String cpf=scan.nextLine();
                            System.out.println("Digite o seu salario:");
                            float salario=scan.nextFloat();
    
                            PessoaFuncionario dados=new PessoaFuncionario(nome, cargo, idade, cpf, salario);
                            lista1.add(dados);
                            positivo=true;
                            
                            System.out.println("");
                            System.out.println("Alteração realizada com sucesso");
                            
                            } else{
                                lista1.add(temp);
                            }
                            funcionario=lista1;
                        }

                        if(!positivo){
                            System.out.println("Cpf não existe");
                        }
                    }
                    
                    fim=3;
                    break;
                case"4":
                    boolean positivo1=false;
                    String cnpjj1, cpff1;
                    System.out.println("Você deseja deletar um dono(1) ou funcionario(2)?");
                    int funcao3=scan.nextInt();
                    if(funcao3==1){
                        System.out.println("Qual o Cnpj do dono que você deseja deletar?");
                        cnpjj1=scan.nextLine();
                        cnpjj1=scan.nextLine();

                        Iterator<PessoaDono> i=dono.iterator();

                        while(i.hasNext()){
                            PessoaDono temp=i.next();

                            if(temp.getCnpj().equals(cnpjj1)){
                                i.remove();
                                positivo1=true;
                                System.out.println("Pessoa Deletada!");
                            }
                        }
                        if(!positivo1){
                            System.out.println("Cnpj não existe");
                        }

                    } else if(funcao3==2){

                        System.out.println("Qual o cpf do funcionario que você deseja deletar?");
                        cpff1=scan.nextLine();
                        scan.nextLine();

                        Iterator<PessoaFuncionario> n=funcionario.iterator();

                        while(n.hasNext()){
                            PessoaFuncionario temp=n.next();

                            if(temp.getCpf().equals(cpff1)){
                                n.remove();
                                positivo1=true;
                                System.out.println("Pessoa Deletada!");
                            }
                        }
                        if(!positivo1){
                            System.out.println("Cpf não existe");
                        }
                        
                    } else{
                        System.out.println("Função não encontrada");
                    }

                    
                    fim=4;
                    break;
                case"5":
                
                    fim=5;
                    break;
                default:
                    System.out.println("Digite outro numero");
            }
        } while(fim<5);
        System.out.println("Obrigado por utilizar o programa!");
    
    }

    @Override
    public void informacoes(){

        Scanner scan=new Scanner(System.in);
        String opcao;

        do{
            System.out.println("Deseja ver algumas Informações a mais?");
            opcao=scan.nextLine();
                if(opcao.equals("sim")){
                    System.out.println("Deseja ver as informações do desenvolvedor ou do sistema?");
                    String opcao1=scan.nextLine();
                    if(opcao1.equals("desenvolvedor")){
                        InformacoesDoDesenvolvedor idd=new InformacoesDoDesenvolvedor();
                        idd.mostrarInformacoes(); 

                    }else if(opcao1.equals("sistema")){
                        InformacoesDoDesenvolvimento idd=new InformacoesDoDesenvolvimento();
                        idd.mostrarInformacoes();
                        idd.mostrarDados();
                    }

                }else{
                    System.out.println("Obrigado!");
                }
        }while(opcao.equals("sim")==true);
   
    }
}