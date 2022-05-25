public class Tela1 implements Telas{

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
    
}
