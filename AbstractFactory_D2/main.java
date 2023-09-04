package AbstractFactory_D2;

public class main {
    public static void main(String[] args) {
        PenFactory p = new gelPenFactory();

        PenFactory product = p.getProduct();
    }
}
