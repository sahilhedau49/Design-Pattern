package Singleton;

public class main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.setInstanceData("Sahil",56);
        s.display();
        Singleton s1 = Singleton.getInstance();
        s1.setInstanceData("Sahil Hedau",56);
        s.display();
        s1.display();

        Marks m1 = Marks.getInstance();
        m1.setInstanceData("Sahil Bhau",56,9);
        m1.display();
        s.display();
    }
}
