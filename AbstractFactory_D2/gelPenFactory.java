package AbstractFactory_D2;

public class gelPenFactory implements PenFactory{
    public Tube createTube(){
        return new Metal();
    }
    public Refill createRefill(){
        return new Plastic();
    }

    public PenFactory getProduct(){
        this.createTube();
        this.createRefill();
        System.out.println("Gel Pen Composed...\n");
        return this;
    }
}
