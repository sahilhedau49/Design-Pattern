package BuilderDP;

public class main {
    public static void main(String[] args) {

        PhoneBuilder x = new PhoneBuilder();
        Phone p1 = x.setOS("iOS").setRAM(6).setSS(5).build();

        System.out.println("\nPhone\nOS: "+p1.os+"\nRAM: "+p1.ram+"\nScreen Size: "+p1.ss);
    }


}
