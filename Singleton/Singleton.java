package Singleton;

public class Singleton {
    // private static final Singleton instance = new Singleton(); // Eager Instantiation
    private static Singleton instance = null; // Lazy Instantiation
    private static String name;
    private static int roll;

    protected Singleton(){}

    public void display(){
        System.out.println("\nName: "+name+"\nRoll no.: "+roll);
    }

    public void setInstanceData(String name, int roll){
        Singleton.name = name;
        Singleton.roll = roll;
    }

    public static Singleton getInstance(){
        if(instance!=null){             // Due to Lazy Instantiation
            return instance;
        }else{
            instance = new Singleton();
            System.out.println("Singleton Initiated...");
            return instance;
        }
        // return instance; // Eager instantiation
    }
}
