package AbstractFactory_D2;

public class Metal implements Tube{
    Metal(){
        this.getTube();
    }
    public void getTube(){
        System.out.println("Metal Tube Got...");
    }
}
