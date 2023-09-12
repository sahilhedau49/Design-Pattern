package PrototypeDP;

public class TicTak implements Protoytpe{
    int dim;
    String c1,c2;

    public TicTak(int dim, String c1, String c2){
        this.dim = dim;
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public Protoytpe getClone() {
        return new Chess(dim,c1,c2);
    }

    @Override
    public void showRecord() {
        System.out.println("\nDim: "+dim+" Color: "+c1+" "+c2);
    }
}
