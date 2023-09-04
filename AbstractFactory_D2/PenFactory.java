package AbstractFactory_D2;

public interface PenFactory {
    public Tube createTube();
    public Refill createRefill();
    public PenFactory getProduct();
}
