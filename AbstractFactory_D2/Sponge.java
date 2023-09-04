package AbstractFactory_D2;

public class Sponge implements Refill{
    Sponge(){
        this.getRefill();
    }
    public void getRefill(){
        System.out.println("Sponge Refill Got...");
    }
}
