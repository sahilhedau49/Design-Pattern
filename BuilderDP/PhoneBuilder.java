package BuilderDP;

public class PhoneBuilder {
    Phone p = new Phone();
    private String os;
    private int ram,ss;

    PhoneBuilder setOS(String s){
        this.os = s;
        return this;
    }
    PhoneBuilder setRAM(int n){
        this.ram = n;
        return this;
    }
    PhoneBuilder setSS(int n){
        this.ss = n;
        return this;
    }

    Phone build(){
        p.setOS(os);
        p.setRAM(ram);
        p.setSS(ss);
        return p;
    }
}
