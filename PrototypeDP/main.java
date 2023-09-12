package PrototypeDP;

public class main {
    public static void main(String[] args) {
        Protoytpe p1 = new Chess(8,"black","white");
        p1.showRecord();
        Chess c = (Chess)p1.getClone();
        c.showRecord();
    }
}
