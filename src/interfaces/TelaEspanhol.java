package interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import objetos.PessoaDono;
import objetos.PessoaFuncionario;
import polimorfismo.InformacoesDoDesenvolvedor;
import polimorfismo.InformacoesDoDesenvolvimento;

public class TelaEspanhol implements Telas {

    @Override
    public void tela() {
        System.out.println("****************************************");
        System.out.println("*                                      *");
        System.out.println("*             Bienvenido               *");
        System.out.println("*                                      *");
        System.out.println("****************************************");
        
    }

    @Override
    public void mensagem() {
        System.out.println("Bienvenido a la selva");
        System.out.println("Ahora veamos un CRUD(CREAR, LEER, ACTUALIZAR Y ELIMINAR)");
        System.out.println("Este CRUD fue hecho en Java");
        
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
        System.out.println("Digite um numero:");
        System.out.println("1- registrar:");
        System.out.println("2- listar:");
        System.out.println("3- atualizar:");
        System.out.println("4- deletar:");
        System.out.println("5- sair:");
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
                    System.out.println("¿Es usted el propietario (1) o empleado (2)?");
                    int funcao=scan.nextInt();

                    if(funcao==1){

                        System.out.println("Registro:");
                        System.out.println("Escriba su nombre:");
                        scan.nextLine();
                        String nome=scan.nextLine();
                        System.out.println("Escriba su sexo:");
                        String cargo=scan.nextLine();
                        System.out.println("Escriba su edad:");
                        int idade=scan.nextInt();
                        System.out.println("Escriba su Cnpj:");
                        scan.nextLine();
                        String cnpj=scan.nextLine();
                        System.out.println("ingrese el valor de su empresa:");
                        float valor=scan.nextFloat();

                        PessoaDono donos=new PessoaDono(nome, cargo, idade, cnpj, valor);
                        dono.add(donos);

                        System.out.println("********************");
                        System.out.println("Registro Completado!");

                    }else if (funcao==2){
                        System.out.println("Registro:");
                        System.out.println("Escriba su nombre:");
                        scan.nextLine();
                        String nome=scan.nextLine();
                        System.out.println("Escriba su sexo:");
                        String cargo=scan.nextLine();
                        System.out.println("Escriba su edad:");
                        int idade=scan.nextInt();
                        System.out.println("Escriba su cpf:");
                        scan.nextLine();
                        String cpf=scan.nextLine();
                        System.out.println("Escriba su salario:");
                        float salario=scan.nextFloat();

                        PessoaFuncionario funcionarios=new PessoaFuncionario(nome, cargo, idade, cpf, salario);
                        funcionario.add(funcionarios);

                        System.out.println("********************");
                        System.out.println("Registro Completado!");

                    }else {
                        System.out.println("Función no encontrada");
                    }
                    fim =1;
                break;

                case"2":

                    System.out.println("¿Desea imprimir la lista de propietarios (1) o empleados (2)?");
                    int funcao1=scan.nextInt(); 

                    if(funcao1==1){
                        System.out.println("Proprietarios:");
                        System.out.println("");
                        Iterator<PessoaDono> i=dono.iterator();

                        while(i.hasNext()){
                            PessoaDono temp=i.next();
                            System.out.println(temp.toString());
                        }
                        System.out.println("");
                        System.out.println("********************");

                    } else if(funcao1==2){

                        System.out.println("Empleados");
                        System.out.println("");

                        Iterator<PessoaFuncionario> n=funcionario.iterator();
                        while(n.hasNext()){
                            PessoaFuncionario temp=n.next();
                            System.out.println(temp.toString());
                        }
                        System.out.println("");
                        System.out.println("********************");

                    } else {
                        System.out.println("Función no encontrada");
                    }
                    
                    System.out.println("Vista completa");
                    fim=2;
                    break;
                case"3":
                    System.out.println("¿Quiere actualizar un propietario (1) o un empleado (2)?");
                    int funcao2=scan.nextInt();
                    boolean positivo=false;
                    String cnpjj, cpff;

                    if(funcao2==1){

                        System.out.println("Informar al cnpj del propietario para ser actualizado:");
                        scan.nextLine();
                        cnpjj=scan.nextLine();

                        Collection<PessoaDono> lista=new ArrayList<>();
                        Iterator<PessoaDono> i=dono.iterator();

                        while(i.hasNext()){
                            PessoaDono temp=i.next();

                          if(temp.getCnpj().equals(cnpjj)){

                            System.out.println("Actualizar:");
                            System.out.println("Escriba su nome:");
                            String nome=scan.nextLine();
                            System.out.println("Escriba su sexo:");
                            String cargo=scan.nextLine();
                            System.out.println("Escriba su edad:");
                            int idade=scan.nextInt();
                            System.out.println("Escriba su Cnpj:");
                            scan.nextLine();
                            String cnpj=scan.nextLine();
                            System.out.println("ingrese el valor de su empresa:");
                            float valor=scan.nextFloat();
    
                            PessoaDono dados=new PessoaDono(nome, cargo, idade, cnpj, valor);
                            lista.add(dados);
                            positivo=true;
                            
                            } else{
                                lista.add(temp);
                            }
                            dono=lista;
                            
                            System.out.println("");
                            System.out.println("Cambio realizado con éxito");
                        }

                        if(!positivo){
                            System.out.println("Cnpj no existe");
                        }
                        
                    } else if(funcao2==2){

                        System.out.println("Informar al cpf del empleado a ser actualizado:");
                        scan.nextLine();
                        cpff=scan.nextLine();

                        Collection<PessoaFuncionario> lista1=new ArrayList<>();
                        Iterator<PessoaFuncionario> n=funcionario.iterator();

                        while(n.hasNext()){
                            PessoaFuncionario temp=n.next();

                          if(temp.getCpf().equals(cpff)){

                            System.out.println("Actualizar:");
                            System.out.println("Escriba su nome:");
                            String nome=scan.nextLine();
                            System.out.println("Escriba su sexo:");
                            String cargo=scan.nextLine();
                            System.out.println("Escriba su edad:");
                            int idade=scan.nextInt();
                            System.out.println("Escriba su cpf:");
                            scan.nextLine();
                            String cpf=scan.nextLine();
                            System.out.println("Escriba su salario:");
                            float salario=scan.nextFloat();
    
                            PessoaFuncionario dados=new PessoaFuncionario(nome, cargo, idade, cpf, salario);
                            lista1.add(dados);
                            positivo=true;
                            
                            System.out.println("");
                            System.out.println("Cambio realizado con éxito");
                            
                            } else{
                                lista1.add(temp);
                            }
                            funcionario=lista1;
                        }

                        if(!positivo){
                            System.out.println("Cpf no existe");
                        }
                    }
                    
                    fim=3;
                    break;
                case"4":
                    boolean positivo1=false;
                    String cnpjj1, cpff1;
                    System.out.println("¿Desea eliminar un propietario (1) o un empleado (2)?");
                    int funcao3=scan.nextInt();
                    if(funcao3==1){
                        System.out.println("¿Cuál es el Cnpj del propietario que desea eliminar?");
                        cnpjj1=scan.nextLine();
                        cnpjj1=scan.nextLine();

                        Iterator<PessoaDono> i=dono.iterator();

                        while(i.hasNext()){
                            PessoaDono temp=i.next();

                            if(temp.getCnpj().equals(cnpjj1)){
                                i.remove();
                                positivo1=true;
                                System.out.println("¡Persona eliminada!");
                            }
                        }
                        if(!positivo1){
                            System.out.println("Cnpj no existe");
                        }

                    } else if(funcao3==2){

                        System.out.println("¿Cuál es el Cpf del propietario que desea eliminar?");
                        cpff1=scan.nextLine();
                        scan.nextLine();

                        Iterator<PessoaFuncionario> n=funcionario.iterator();

                        while(n.hasNext()){
                            PessoaFuncionario temp=n.next();

                            if(temp.getCpf().equals(cpff1)){
                                n.remove();
                                positivo1=true;
                                System.out.println("¡Persona eliminada!");
                            }
                        }
                        if(!positivo1){
                            System.out.println("Cpf no existe");
                        }
                        
                    } else{
                        System.out.println("Función no encontrada");
                    }

                    
                    fim=4;
                    break;
                case"5":
                
                    fim=5;
                    break;
                default:
                    System.out.println("Introduce otro número");
            }
        } while(fim<5);
        System.out.println("¡Gracias por usar el programa!");
    
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
