import java.util.Scanner;

import interfaces.TelasAcao;
import objetos.PessoaDono;
import objetos.PessoaFuncionario;
import polimorfismo.InformacoesDoDesenvolvedor;
import polimorfismo.InformacoesDoDesenvolvimento;
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
            program.menu(tl1);
            program.crud(tl1);
            program.informacoes(tl1);
        }else if(opcao==2){
            TelaEspanhol tl1 =new TelaEspanhol();
            TelasAcao program =new TelasAcao();
            program.tela(tl1);
            program.mensagem(tl1);
            program.menu(tl1);
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

    public static String menu(){

        Scanner scan=new Scanner(System.in);
        String opcao;
        System.out.println("Digite um numero:");
        System.out.println("1- registrar:");
        System.out.println("2- listar:");
        System.out.println("3- atualizar:");
        System.out.println("4- deletar:");
        System.out.println("5- sair:");
        
        opcao=scan.nextLine();
        return opcao;

    }

    public static void crud(){
        Scanner scan=new Scanner(System.in);

        PessoaDono pessoaDono=new PessoaDono("","", 0, "", (float)0);
        PessoaFuncionario pessoaFuncionario=new PessoaFuncionario("","", 0, "", (float)0);

        int fim=0;int i=0;int i1=0;int atu=0;int del=0;int id;int id1;
        String[][] funcionarios=new String[100][10];
        String[][] donos=new String[100][10];
        
        do{
            switch(menu()){

                case"1":
                    System.out.println("Você é dono(1) ou funcionario(2)?");
                    int funcao=scan.nextInt();

                    if(funcao==1){
                        System.out.println("Registrar:");
                        System.out.println("Digite o nome:");
                        scan.nextLine();
                        String nome=scan.nextLine();
                        pessoaDono.setNome(nome);
                        System.out.println("Digite o cargo:");
                        String cargo=scan.nextLine();
                        pessoaDono.setCargo(cargo);
                        System.out.println("Digite o idade:");
                        int idade=scan.nextInt();
                        pessoaDono.setIdade(idade);
                        System.out.println("Digite o cnpj:");
                        scan.nextLine();
                        String cnpj=scan.nextLine();
                        pessoaDono.setCnpj(cnpj);
                        System.out.println("Digite o valor da empresa:");
                        float valor=scan.nextFloat();
                        pessoaDono.setValor(valor);

                        id=i;
                        donos[i][0] ="ID: "+Integer.toString(id);
                        donos[i][1] ="Nome: "+pessoaDono.getNome();
                        donos[i][2] ="Cargo: "+pessoaDono.getCargo();
                        donos[i][3] ="Idade: "+pessoaDono.getIdade();
                        donos[i][4] ="Cnpj: "+pessoaDono.getCnpj();
                        donos[i][5] ="Valor da empresa: "+pessoaDono.getValor();

                    }else if (funcao==2){
                        System.out.println("Registrar:");
                        System.out.println("Digite o nome:");
                        scan.nextLine();
                        String nome=scan.nextLine();
                        pessoaFuncionario.setNome(nome);
                        System.out.println("Digite o cargo:");
                        String cargo=scan.nextLine();
                        pessoaFuncionario.setCargo(cargo);
                        System.out.println("Digite o idade:");
                        int idade=scan.nextInt();
                        pessoaFuncionario.setIdade(idade);
                        System.out.println("Digite o seu cpf:");
                        scan.nextLine();
                        String cpf=scan.nextLine();
                        pessoaFuncionario.setCpf(cpf);
                        System.out.println("Digite o seu salario:");
                        float salario=scan.nextFloat();
                        pessoaFuncionario.setSalario(salario);

                        id1=i;
                        funcionarios[i][0] ="ID: "+Integer.toString(id1);
                        funcionarios[i][1] ="Nome: "+pessoaFuncionario.getNome();
                        funcionarios[i][2] ="Cargo: "+pessoaFuncionario.getCargo();
                        funcionarios[i][3] ="Idade: "+pessoaFuncionario.getIdade();
                        funcionarios[i][4] ="Cpf: "+pessoaFuncionario.getCpf();
                        funcionarios[i][5] ="Salario: "+pessoaFuncionario.getSalario();
                    }else {
                        System.out.println("Função não encontrada");
                    }
                    i++;
                    fim =1;
                    System.out.println("Registrado com sucesso!");
                break;

                case"2":
                    System.out.println("Deseja imprimir a lista de donos(1) ou funcionario(2)?");
                    int funcao1=scan.nextInt();
                    if(funcao1==1){
                        System.out.println("Lista de donos:");
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
                        System.out.println("Lista de funcionarios:");
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
                        System.out.println("Função não encontrada");
                    }
                    
                    System.out.println("Visualização completa");
                    fim=2;
                    break;
                case"3":
                    System.out.println("Você deseja atualizar um dono(1) ou funcionario(2)?");
                    int funcao2=scan.nextInt();
                    if(funcao2==1){
                        System.out.println("Informe o ID a ser atualizado:");
                        atu=scan.nextInt();
                        scan.nextLine();
                        if(atu<i){
                            System.out.println("Registrar:");
                            System.out.println("Digite o nome:");
                            String nome=scan.nextLine();
                            pessoaDono.setNome(nome);
                            System.out.println("Digite o cargo:");
                            String cargo=scan.nextLine();
                            pessoaDono.setCargo(cargo);
                            System.out.println("Digite o idade:");
                            int idade=scan.nextInt();
                            pessoaDono.setIdade(idade);
                            System.out.println("Digite o cnpj:");
                            scan.nextLine();
                            String cnpj=scan.nextLine();
                            pessoaDono.setCnpj(cnpj);
                            System.out.println("Digite o valor da empresa:");
                            float valor=scan.nextFloat();
                            pessoaDono.setValor(valor);

                            id=i;
                            donos[i][0] ="ID: "+Integer.toString(id);
                            donos[i][1] ="Nome: "+pessoaDono.getNome();
                            donos[i][2] ="Cargo: "+pessoaDono.getCargo();
                            donos[i][3] ="Idade: "+pessoaDono.getIdade();
                            donos[i][4] ="Cnpj: "+pessoaDono.getCnpj();
                            donos[i][5] ="Valor da empresa: "+pessoaDono.getValor();
                        } else{
                            System.out.println("ID não existe");
                        }
                    } else if(funcao2==2){
                        System.out.println("Informe o ID a ser atualizado:");
                        atu=scan.nextInt();
                        scan.nextLine();
                        if(atu<i){
                            System.out.println("Registrar:");
                            System.out.println("Digite o nome:");
                            scan.nextLine();
                            String nome=scan.nextLine();
                            pessoaFuncionario.setNome(nome);
                            System.out.println("Digite o cargo:");
                            String cargo=scan.nextLine();
                            pessoaFuncionario.setCargo(cargo);
                            System.out.println("Digite o idade:");
                            int idade=scan.nextInt();
                            pessoaFuncionario.setIdade(idade);
                            System.out.println("Digite o seu cpf:");
                            scan.nextLine();
                            String cpf=scan.nextLine();
                            pessoaFuncionario.setCpf(cpf);
                            System.out.println("Digite o seu salario:");
                            float salario=scan.nextFloat();
                            pessoaFuncionario.setSalario(salario);
    
                            id1=i;
                            funcionarios[i][0] ="ID: "+Integer.toString(id1);
                            funcionarios[i][1] ="Nome: "+pessoaFuncionario.getNome();
                            funcionarios[i][2] ="Cargo: "+pessoaFuncionario.getCargo();
                            funcionarios[i][3] ="Idade: "+pessoaFuncionario.getIdade();
                            funcionarios[i][4] ="Cpf: "+pessoaFuncionario.getCpf();
                            funcionarios[i][5] ="Salario: "+pessoaFuncionario.getSalario();
                        } else{
                            System.out.println("ID não existe");
                        }
                    } else{
                        System.out.println("Função não encontrada");
                    }
                    
                    fim=3;
                    break;
                case"4":
                    System.out.println("Você deseja deletar um dono(1) ou funcionario(2)?");
                    int funcao3=scan.nextInt();
                    if(funcao3==1){
                        System.out.println("Qual ID voce deseja deletar?");
                        del=scan.nextInt();
                        scan.nextLine();
                        if(del<i && donos[del][0] !=null){
                            donos[del][0] = null;
                            donos[del][1] = null;
                            donos[del][2] = null;
                            donos[del][3] = null;
                            System.out.println("Informações deletadas");
                        } else{
                            System.out.println("ID não existe");
                        }
                    } else if(funcao3==2){
                        System.out.println("Qual ID voce deseja deletar?");
                        del=scan.nextInt();
                        scan.nextLine();
                        if(del<i && funcionarios[del][0] !=null){
                            funcionarios[del][0] = null;
                            funcionarios[del][1] = null;
                            funcionarios[del][2] = null;
                            funcionarios[del][3] = null;
                            System.out.println("Informações deletadas");
                        } else{
                            System.out.println("ID não existe");
                        }
                    } else{
                        System.out.println("Função não encontrada");
                    }
                    
                    fim=4;
                    break;
                case"5":
                    break;
                default:
                    System.out.println("Digite outro numero");
            }
        } while(fim<5);
        System.out.println("Obrigado por utilizar o programa!");
    }

    public static void informacoes(){

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

    public static void main(String[] args) throws Exception {
        //telaInicial();
        //crud();
        //informacoes();
    }
}

