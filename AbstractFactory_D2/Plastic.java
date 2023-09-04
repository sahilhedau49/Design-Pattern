package AbstractFactory_D2;

public class Plastic implements Refill{
    Plastic(){
        this.getRefill();
    }
    public void getRefill(){
        System.out.println("Plastic Refill Got...");
    }
}
