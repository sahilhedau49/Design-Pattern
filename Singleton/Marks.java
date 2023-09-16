package Singleton;

public class Marks extends Singleton{
    private static Marks m = null;
    private static int cgpa;

    private Marks(){
        System.out.println("\nMarks Class Initiated...");
    }

    public static Marks getInstance(){
        Singleton.getInstance();
        if(m!=null) {
            return m;
        }else {
            m = new Marks();
            return m;
        }
    }

    public void setInstanceData(String name, int roll, int cgpa) {
        super.setInstanceData(name, roll);
        Marks.cgpa = cgpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("CGPA: "+cgpa);
    }
}
