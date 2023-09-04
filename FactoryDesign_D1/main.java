package FactoryDesign_D1;

public class main {
    public static void main(String[] args) {
        shapeFactory sf = new shapeFactory();
        shape s = sf.getShape("square");
        s.draw();

        shape c = sf.getShape("circle");
        c.draw();
    }
}
