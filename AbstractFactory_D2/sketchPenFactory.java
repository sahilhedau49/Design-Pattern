package AbstractFactory_D2;

public class sketchPenFactory implements PenFactory{
    public Tube createTube(){
        return new Fiber();
    }
    public Refill createRefill(){
        return new Sponge();
    }

    public PenFactory getProduct(){
        this.createTube();
        this.createRefill();
        System.out.println("Sketch Pen Composed...\n");
        return this;
    }
}
