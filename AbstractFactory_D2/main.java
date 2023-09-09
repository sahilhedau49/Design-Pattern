package AbstractFactory_D2;

public class main {
    public static void main(String[] args) {

        Pen pen = new Pen();

        PenFactory gp = pen.getPen("gel");
        PenFactory gelProduct = gp.getProduct();

        PenFactory sp = pen.getPen("sketch");
        PenFactory sketchProduct = sp.getProduct();
    }
}
