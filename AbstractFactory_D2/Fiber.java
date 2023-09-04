package AbstractFactory_D2;

public class Fiber implements Tube{
    Fiber(){
        this.getTube();
    }
    public void getTube(){
        System.out.println("Fiber Tube Got...");
    }
}
