package BuilderDP;

public class Phone {
    String os;
    int ram, ss;

    Phone setOS(String s){
        this.os =s;
        return this;

    }
    Phone setRAM(int n){
        this.ram = n;
        return this;

    }
    Phone setSS(int n){
        this.ss = n;
        return this;
    }
}
