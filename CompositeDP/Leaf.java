package CompositeDP;

public class Leaf implements Employee {
    int id;
    String name,position;

    Leaf(int id, String name, String position){
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void displayEmployee() {
        System.out.println("ID: "+id+" Name: "+name+" Position: "+position);
    }

    @Override
    public void addEmployee(Employee e) {

    }

    @Override
    public void removeEmployee(Employee e) {

    }
}
