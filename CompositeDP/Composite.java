package CompositeDP;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee{
    List<Employee> list;

    Composite(){
        list = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee e) {
        list.add(e);
    }

    @Override
    public void removeEmployee(Employee e) {
        list.remove(e);
    }

    @Override
    public void displayEmployee() {
        for(Employee e:list){
            e.displayEmployee();
            System.out.print("\n");
        }
    }
}
