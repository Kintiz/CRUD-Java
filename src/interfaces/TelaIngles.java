package interfaces;

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
        System.out.println("Write a number:");
        System.out.println("1- register:");
        System.out.println("2- list:");
        System.out.println("3- update:");
        System.out.println("4- delete:");
        System.out.println("5- exit:");
        
        opcao=scan.nextLine();
        return opcao;

    }

    @Override
    public void crud(){
            Scanner scan=new Scanner(System.in);
    
            PessoaDono pessoaDono=new PessoaDono("","", 0, "", (float)0);
            PessoaFuncionario pessoaFuncionario=new PessoaFuncionario("","", 0, "", (float)0);
    
            int fim=0;int i=0;int i1=0;int atu=0;int del=0;int id;int id1;
            String[][] funcionarios=new String[100][10];
            String[][] donos=new String[100][10];
            
            do{
                switch(menu()){
    
                    case"1":
                        System.out.println("Are you a owner(1) or employee(2)?");
                        int funcao=scan.nextInt();
    
                        if(funcao==1){
                            System.out.println("Register:");
                            System.out.println("Enter a name:");
                            scan.nextLine();
                            String nome=scan.nextLine();
                            pessoaDono.setNome(nome);
                            System.out.println("Enter a office:");
                            String cargo=scan.nextLine();
                            pessoaDono.setCargo(cargo);
                            System.out.println("Enter a age:");
                            int idade=scan.nextInt();
                            pessoaDono.setIdade(idade);
                            System.out.println("Enter a cnpj:");
                            scan.nextLine();
                            String cnpj=scan.nextLine();
                            pessoaDono.setCnpj(cnpj);
                            System.out.println("Enter a company value:");
                            float valor=scan.nextFloat();
                            pessoaDono.setValor(valor);
    
                            id=i;
                            donos[i][0] ="ID: "+Integer.toString(id);
                            donos[i][1] ="Name: "+pessoaDono.getNome();
                            donos[i][2] ="Office: "+pessoaDono.getCargo();
                            donos[i][3] ="Age: "+pessoaDono.getIdade();
                            donos[i][4] ="Cnpj: "+pessoaDono.getCnpj();
                            donos[i][5] ="Company value: "+pessoaDono.getValor();
    
                        }else if (funcao==2){
                            System.out.println("Register:");
                            System.out.println("Enter a name:");
                            scan.nextLine();
                            String nome=scan.nextLine();
                            pessoaFuncionario.setNome(nome);
                            System.out.println("Enter a office:");
                            String cargo=scan.nextLine();
                            pessoaFuncionario.setCargo(cargo);
                            System.out.println("Enter a age:");
                            int idade=scan.nextInt();
                            pessoaFuncionario.setIdade(idade);
                            System.out.println("Enter a cpf:");
                            scan.nextLine();
                            String cpf=scan.nextLine();
                            pessoaFuncionario.setCpf(cpf);
                            System.out.println("Enter your salary:");
                            float salario=scan.nextFloat();
                            pessoaFuncionario.setSalario(salario);
    
                            id1=i;
                            funcionarios[i][0] ="ID: "+Integer.toString(id1);
                            funcionarios[i][1] ="Name: "+pessoaFuncionario.getNome();
                            funcionarios[i][2] ="Office: "+pessoaFuncionario.getCargo();
                            funcionarios[i][3] ="Age: "+pessoaFuncionario.getIdade();
                            funcionarios[i][4] ="Cpf: "+pessoaFuncionario.getCpf();
                            funcionarios[i][5] ="Salary: "+pessoaFuncionario.getSalario();
                        }else {
                            System.out.println("Function not found");
                        }
                        i++;
                        fim =1;
                        System.out.println("Sucess!");
                    break;
    
                    case"2":
                        System.out.println("Want to print a owner(1) or employee(2)?");
                        int funcao1=scan.nextInt();
                        if(funcao1==1){
                            System.out.println("List of owners:");
                            for(int l=0;l<donos.length;l++){
                                for(int c=0;c<donos[c].length;c++){
                                    if(donos[l][c] !=null){
                                        if(c<6){
                                            System.out.println("- "+donos[l][c]);
                                        }
                                    }else{
                                        break;
                                    }
                                }
                            }
                        } else if(funcao1==2){
                            System.out.println("List of employeers:");
                            for(int l=0;l<funcionarios.length;l++){
                                for(int c=0;c<funcionarios[c].length;c++){
                                    if(funcionarios[l][c] !=null){
                                        if(c<6){
                                            System.out.println("- "+funcionarios[l][c]);
                                        }
                                    }else{
                                        break;
                                    }
                                }
                            }
                        } else {
                            System.out.println("Function not found");
                        }
                        
                        System.out.println("Full view");
                        fim=2;
                        break;
                    case"3":
                        System.out.println("Want update a owner(1) or employee(2)?");
                        int funcao2=scan.nextInt();
                        if(funcao2==1){
                            System.out.println("Enter a ID to be updated:");
                            atu=scan.nextInt();
                            scan.nextLine();
                            if(atu<i){
                                System.out.println("Register:");
                                System.out.println("Enter a name:");
                                String nome=scan.nextLine();
                                pessoaDono.setNome(nome);
                                System.out.println("Enter a office:");
                                String cargo=scan.nextLine();
                                pessoaDono.setCargo(cargo);
                                System.out.println("Enter a age:");
                                int idade=scan.nextInt();
                                pessoaDono.setIdade(idade);
                                System.out.println("Enter a cnpj:");
                                scan.nextLine();
                                String cnpj=scan.nextLine();
                                pessoaDono.setCnpj(cnpj);
                                System.out.println("Enter a company value:");
                                float valor=scan.nextFloat();
                                pessoaDono.setValor(valor);
        
                                id=i;
                                donos[i][0] ="ID: "+Integer.toString(id);
                                donos[i][1] ="Name: "+pessoaDono.getNome();
                                donos[i][2] ="Office: "+pessoaDono.getCargo();
                                donos[i][3] ="Age: "+pessoaDono.getIdade();
                                donos[i][4] ="Cnpj: "+pessoaDono.getCnpj();
                                donos[i][5] ="Company value: "+pessoaDono.getValor();
                            } else{
                                System.out.println("ID don't exist");
                            }
                        } else if(funcao2==2){
                            System.out.println("Enter a ID to be updated:");
                            atu=scan.nextInt();
                            scan.nextLine();
                            if(atu<i){
                                System.out.println("Register:");
                                System.out.println("Enter a name:");
                                String nome=scan.nextLine();
                                pessoaFuncionario.setNome(nome);
                                System.out.println("Enter a office:");
                                String cargo=scan.nextLine();
                                pessoaFuncionario.setCargo(cargo);
                                System.out.println("Enter a age:");
                                int idade=scan.nextInt();
                                pessoaFuncionario.setIdade(idade);
                                System.out.println("Enter a cpf:");
                                scan.nextLine();
                                String cpf=scan.nextLine();
                                pessoaFuncionario.setCpf(cpf);
                                System.out.println("Enter your salary:");
                                float salario=scan.nextFloat();
                                pessoaFuncionario.setSalario(salario);
    
                                id1=i;
                                funcionarios[i][0] ="ID: "+Integer.toString(id1);
                                funcionarios[i][1] ="Name: "+pessoaFuncionario.getNome();
                                funcionarios[i][2] ="Office: "+pessoaFuncionario.getCargo();
                                funcionarios[i][3] ="Age: "+pessoaFuncionario.getIdade();
                                funcionarios[i][4] ="Cpf: "+pessoaFuncionario.getCpf();
                                funcionarios[i][5] ="Salary: "+pessoaFuncionario.getSalario();
                            } else{
                                System.out.println("ID não existe");
                            }
                        } else{
                            System.out.println("Function not found");
                        }
                        
                        fim=3;
                        break;
                    case"4":
                        System.out.println("You want to delete a owner(1) or employee(2)?");
                        int funcao3=scan.nextInt();
                        if(funcao3==1){
                            System.out.println("Whos ID you want to delete?");
                            del=scan.nextInt();
                            scan.nextLine();
                            if(del<i && donos[del][0] !=null){
                                donos[del][0] = null;
                                donos[del][1] = null;
                                donos[del][2] = null;
                                donos[del][3] = null;
                                System.out.println("informations deleted");
                            } else{
                                System.out.println("ID dont exist");
                            }
                        } else if(funcao3==2){
                            System.out.println("Whos ID you want to delete?");
                            del=scan.nextInt();
                            scan.nextLine();
                            if(del<i && funcionarios[del][0] !=null){
                                funcionarios[del][0] = null;
                                funcionarios[del][1] = null;
                                funcionarios[del][2] = null;
                                funcionarios[del][3] = null;
                                System.out.println("informations deleted");
                            } else{
                                System.out.println("ID não existe");
                            }
                        } else{
                            System.out.println("Function not found");
                        }
                        
                        fim=4;
                        break;
                    case"5":
                        break;
                    default:
                        System.out.println("Enter another number");
                }
            } while(fim>5);
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
