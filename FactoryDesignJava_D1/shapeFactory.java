package factoryJava;

public class shapeFactory {
    shape getShape(String s) {
        if (s.equals("square")) {
            shape obj = new square();
            return obj;
        }
        if (s.equals("circle")) {
            shape obj = new circle();
            return obj;
        }

        return null;
    }
}
