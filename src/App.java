import java.util.Scanner;
import java.util.ArrayList;

public class App {

/* 
        ArrayList<String> nome = new ArrayList<String>();
        nome.add("Julio"); // ID 0
        nome.add("Leon"); // ID 1
        nome.add("Lucas"); // ID 2
        nome.add("Paulo"); // ID 3
        
        System.out.println("Imprimindo nomes:"); //for que mostra todos os id's
        for(int id =0;id<nome.size();id++){
            System.out.println(nome.get(id));
        }

        System.out.println("Remover"); //remove um dado
        nome.remove(2);

        
        for(int id=0;id<nome.size();id++){
            string element = nome.get(id);
            System.out.println(element);
        }
        
        System.out.println("Imprimindo nomes:"); //melhor maneira de escrever o for em arraylist
        for (String element : nome) {
            System.out.println(element);
        }

        //nome.clear(); //limpa todos os dados
*/
        
/* 
        Scanner ler =new Scanner(System.in);
        ArrayList<String> nome1 = new ArrayList<String>();

        System.out.println("Digite um número:");
        System.out.println("1- Registrar:");
        System.out.println("2- Imprimir:");
        System.out.println("3- Remover:");
        System.out.println("4- Sair");
        
        int c=0;
        int id=0;
        c=ler.nextInt();
            
        if(c==1){

            //registrar
            for(id=-1;id<2;id++){
                System.out.println("Digite um nome:");
                String nome = ler.next();
                nome1.add(nome);
            }
            
            //imprimir
            int ides=-1;
            for (String element : nome1) {
                
                ides++;
                System.out.println(ides);
                System.out.println(element);
            }
            
            //remover
            
            int r=0;
            System.out.println("Qual registro você deseja remover?");
            r = ler.nextInt();
            nome1.remove(r);
            //imprimir
            ides=-1;
            for (String element : nome1) {
                
                ides++;
                System.out.println(ides);
                System.out.println(element);
            } 

            //alterar
            int a=0;
            System.out.println("Qual registro voce deseja alterar?");
            a = ler.nextInt();
            nome1.remove(a);
            //registrar
            System.out.println("Digite um nome");
            String nome = ler.next();
            nome1.add(nome);
            

            //imprimir
            ides=-1;
            for (String element : nome1) {
                
                ides++;
                System.out.println(ides);
                System.out.println(element);
            }
        }
        */

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

    public static void cod(){
        Scanner scan=new Scanner(System.in);
        int fim=0;
        int i=0;
        int atu=0;
        int del=0;
        int id;
        float idade=0;
        String nome;
        String cargo;
        String[][] funcionarios=new String[100][10];
        do{
            switch(menu()){

                case"1":
                    System.out.println("Registrar:");
                    System.out.println("Digite o nome:");
                    nome=scan.nextLine();
                    System.out.println("Registrar:");
                    System.out.println("Digite o cargo:");
                    cargo=scan.nextLine();
                    System.out.println("Registrar:");
                    System.out.println("Digite o idade:");
                    idade=scan.nextFloat();
                    id=i;
                    funcionarios[i][0] ="ID: "+Integer.toString(id);
                    funcionarios[i][1] ="Nome: "+nome;
                    funcionarios[i][2] ="Cargo: "+cargo;
                    funcionarios[i][3] ="Idade: "+idade;
                    i++;
                    fim =1;
                    System.out.println("Registrado com sucesso!");
                break;

                case"2":
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
                    System.out.println("Visualização completa");
                    fim=2;
                    break;
                case"3":
                    System.out.println("Informe o ID a ser atualizado:");
                    atu=scan.nextInt();
                    scan.nextLine();
                    if(atu<i){
                        System.out.println("Registrar:");
                        System.out.println("Digite o nome:");
                        nome=scan.nextLine();
                        System.out.println("Registrar:");
                        System.out.println("Digite o cargo:");
                        cargo=scan.nextLine();
                        System.out.println("Registrar:");
                        System.out.println("Digite o idade:");
                        idade=scan.nextFloat();
                        funcionarios[i][0] ="ID:"+Integer.toString(atu);
                        funcionarios[i][1] ="Nome:"+nome;
                        funcionarios[i][2] ="ID:"+cargo;
                        funcionarios[i][3] ="ID:"+idade;
                        System.out.println("Registro atualizado com sucesso!");
                    } else{
                        System.out.println("ID não existe");
                    }
                    fim=3;
                    break;
                case"4":
                    System.out.println("Qual item voce deseja deletar?");
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
                    fim=4;
                    break;
                case"5":
                    break;
                default:
                    System.out.println("Digite outro numero");
            }
        } while(fim>5);
        System.out.println("Obrigado!");
    }

    public static void main(String[] args) throws Exception {
        cod();
    }
}

