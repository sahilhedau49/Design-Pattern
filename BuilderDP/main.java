package BuilderDP;

public class main {
    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1 = p1.setOS("iOS");
        p1 = p1.setRAM(6);
        p1 = p1.setSS(5);

        System.out.println("\nPhone\nOS: "+p1.os+"\nRAM: "+p1.ram+"\nScreen Size: "+p1.ss);
    }


}
