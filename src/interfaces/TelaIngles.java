package interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import objetos.PessoaDono;
import objetos.PessoaFuncionario;
import polimorfismo.InformacoesDoDesenvolvedor;
import polimorfismo.InformacoesDoDesenvolvimento;

public class TelaIngles implements Telas{

    @Override
    public void tela() {
        System.out.println("****************************************");
        System.out.println("*                                      *");
        System.out.println("*              Welcome                 *");
        System.out.println("*                                      *");
        System.out.println("****************************************");
        
    }

    @Override
    public void mensagem() {
        System.out.println("Welcome to the Jungle ");
        System.out.println("Now let's see the CRUD(CREATE, READ, UPDATE AND DELETE)");
        System.out.println("This CRUD has been maked on JAVA");
    }
    
    @Override
    public String menu(){

        Scanner scan=new Scanner(System.in);
        String opcao;
        opcao=scan.nextLine();
        return opcao;

    }
    
    @Override
    public void print(){
        System.out.println("Enter a number:");
        System.out.println("1- Register:");
        System.out.println("2- List:");
        System.out.println("3- Update:");
        System.out.println("4- Delete:");
        System.out.println("5- Exit:");
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
                    System.out.println("You are the owner(1) or employee(2)?");
                    int funcao=scan.nextInt();

                    if(funcao==1){

                        System.out.println("Register:");
                        System.out.println("Enter your name:");
                        scan.nextLine();
                        String nome=scan.nextLine();
                        System.out.println("Enter your profession:");
                        String cargo=scan.nextLine();
                        System.out.println("Enter your age:");
                        int idade=scan.nextInt();
                        System.out.println("Enter your Cnpj:");
                        scan.nextLine();
                        String cnpj=scan.nextLine();
                        System.out.println("Enter your company value:");
                        float valor=scan.nextFloat();

                        PessoaDono donos=new PessoaDono(nome, cargo, idade, cnpj, valor);
                        dono.add(donos);

                        System.out.println("********************");
                        System.out.println("Success!");

                    }else if (funcao==2){
                        System.out.println("Register:");
                        System.out.println("Enter your name:");
                        scan.nextLine();
                        String nome=scan.nextLine();
                        System.out.println("Enter your profession:");
                        String cargo=scan.nextLine();
                        System.out.println("Enter your age:");
                        int idade=scan.nextInt();
                        System.out.println("Enter yout Cpf:");
                        scan.nextLine();
                        String cpf=scan.nextLine();
                        System.out.println("Enter your salary:");
                        float salario=scan.nextFloat();

                        PessoaFuncionario funcionarios=new PessoaFuncionario(nome, cargo, idade, cpf, salario);
                        funcionario.add(funcionarios);

                        System.out.println("********************");
                        System.out.println("Success!");

                    }else {
                        System.out.println("Function not found");
                    }
                    fim =1;
                        
                break;

                case"2":

                    System.out.println("Do you want to print the owner(1) or employee(2) list?");
                    int funcao1=scan.nextInt(); 

                    if(funcao1==1){
                        System.out.println("Owners:");
                        System.out.println("");
                        Iterator<PessoaDono> i=dono.iterator();

                        while(i.hasNext()){
                            PessoaDono temp=i.next();
                            System.out.println(temp.toString());
                        }
                        System.out.println("");
                        System.out.println("********************");

                    } else if(funcao1==2){

                        System.out.println("Employeers");
                        System.out.println("");

                        Iterator<PessoaFuncionario> n=funcionario.iterator();
                        while(n.hasNext()){
                            PessoaFuncionario temp=n.next();
                            System.out.println(temp.toString());
                        }
                        System.out.println("");
                        System.out.println("********************");

                    } else {
                        System.out.println("Function not found");
                    }
                    
                    fim=2;
                    break;
                case"3":
                    System.out.println("You want to update an owner(1) or employee(2)?");
                    int funcao2=scan.nextInt();
                    boolean positivo=false;
                    String cnpjj, cpff;

                    if(funcao2==1){

                        System.out.println("Inform the owner's cnpj to be updated:");
                        scan.nextLine();
                        cnpjj=scan.nextLine();

                        Collection<PessoaDono> lista=new ArrayList<>();
                        Iterator<PessoaDono> i=dono.iterator();

                        while(i.hasNext()){
                            PessoaDono temp=i.next();

                          if(temp.getCnpj().equals(cnpjj)){

                            System.out.println("Update:");
                            System.out.println("Enter your name:");
                            String nome=scan.nextLine();
                            System.out.println("Enter your profession:");
                            String cargo=scan.nextLine();
                            System.out.println("Enter your age:");
                            int idade=scan.nextInt();
                            System.out.println("Enter your Cnpj:");
                            scan.nextLine();
                            String cnpj=scan.nextLine();
                            System.out.println("Enter your company value:");
                            float valor=scan.nextFloat();
    
                            PessoaDono dados=new PessoaDono(nome, cargo, idade, cnpj, valor);
                            lista.add(dados);
                            positivo=true;
                            
                            System.out.println("");
                            System.out.println("Sucess update!");
                            
                            } else{
                                lista.add(temp);
                            }
                            dono=lista;
                            
                        }

                        if(!positivo){
                            System.out.println("Cnpj not found");
                        }
                        
                    } else if(funcao2==2){

                        System.out.println("Inform the employeer's cpf to be updated:");
                        scan.nextLine();
                        cpff=scan.nextLine();

                        Collection<PessoaFuncionario> lista1=new ArrayList<>();
                        Iterator<PessoaFuncionario> n=funcionario.iterator();

                        while(n.hasNext()){
                            PessoaFuncionario temp=n.next();

                          if(temp.getCpf().equals(cpff)){

                            System.out.println("Update:");
                            System.out.println("Enter your name:");
                            String nome=scan.nextLine();
                            System.out.println("Enter your profession:");
                            String cargo=scan.nextLine();
                            System.out.println("Enter your age:");
                            int idade=scan.nextInt();
                            System.out.println("Enter yout Cpf:");
                            scan.nextLine();
                            String cpf=scan.nextLine();
                            System.out.println("Enter your salary:");
                            float salario=scan.nextFloat();
    
                            PessoaFuncionario dados=new PessoaFuncionario(nome, cargo, idade, cpf, salario);
                            lista1.add(dados);
                            positivo=true;
                            
                            System.out.println("");
                            System.out.println("Sucess update!");
                            
                            } else{
                                lista1.add(temp);
                            }
                            funcionario=lista1;
                        }

                        if(!positivo){
                            System.out.println("Cpf not found");
                        }
                    }
                    
                    fim=3;
                    break;
                case"4":
                    boolean positivo1=false;
                    String cnpjj1, cpff1;
                    System.out.println("You want to delete an owner(1) or employee(2)?");
                    int funcao3=scan.nextInt();
                    if(funcao3==1){
                        System.out.println("What is the cnpj of the owner you want to delete?");
                        cnpjj1=scan.nextLine();
                        cnpjj1=scan.nextLine();

                        Iterator<PessoaDono> i=dono.iterator();

                        while(i.hasNext()){
                            PessoaDono temp=i.next();

                            if(temp.getCnpj().equals(cnpjj1)){
                                i.remove();
                                positivo1=true;
                                System.out.println("Success people deleted!");
                            }
                        }
                        if(!positivo1){
                            System.out.println("Cnpj not found");
                        }

                    } else if(funcao3==2){

                        System.out.println("What is the cpf of the employee you want to delete?");
                        cpff1=scan.nextLine();
                        cpff1=scan.nextLine();

                        Iterator<PessoaFuncionario> n=funcionario.iterator();

                        while(n.hasNext()){
                            PessoaFuncionario temp=n.next();

                            if(temp.getCpf().equals(cpff1)){
                                n.remove();
                                positivo1=true;
                                System.out.println("Success, people deleted!");
                            }
                        }
                        if(!positivo1){
                            System.out.println("Cpf not found");
                        }
                        
                    } else{
                        System.out.println("Function not found");
                    }

                    
                    fim=4;
                    break;
                case"5":
                
                    fim=5;
                    break;
                default:
                    System.out.println("Enter another number");
            }
        } while(fim<5);
        System.out.println("Thank you for using this program!");
    
    }

    @Override
    public void informacoes(){

        Scanner scan=new Scanner(System.in);
        String opcao;

        do{
            System.out.println("You want to see more informations?");
            opcao=scan.nextLine();
                if(opcao.equals("yes")){
                    System.out.println("Want to see developer or system information?");
                    String opcao1=scan.nextLine();
                    if(opcao1.equals("developer")){
                        InformacoesDoDesenvolvedor idd=new InformacoesDoDesenvolvedor();
                        idd.mostrarInformacoes(); 

                    }else if(opcao1.equals("system")){
                        InformacoesDoDesenvolvimento idd=new InformacoesDoDesenvolvimento();
                        idd.mostrarInformacoes();
                        idd.mostrarDados();
                    }

                }else{
                    System.out.println("Thank You!");
                }
        }while(opcao.equals("yes")==true);
   
    }

}
