package factoryJava;
// package 2.9;

class Java {
    public static void main(String[] args) {
        shapeFactory sf = new shapeFactory();
        shape s = sf.getShape("square");
        s.draw();
    }
}