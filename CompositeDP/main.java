package CompositeDP;

public class main {
    public static void main(String[] args) {
        Employee ceo = new Leaf(101,"Raju","CEO");
        Employee pm = new Leaf(102,"Smit","PM");
        Employee pm2 = new Leaf(103,"Shreyash","PM2");
        Employee se = new Leaf(104,"Sahil","SE");
        Employee se2 = new Leaf(105,"Samrat","SE");
        Employee clerk1 = new Leaf(106,"Sarang","Clerk");
        Employee clerk2 = new Leaf(106,"Ayush","Clerk");

        Employee CEOTeam = new Composite();
        Employee PMTeam = new Composite();
        Employee SETeam = new Composite();

        CEOTeam.addEmployee(ceo);
        CEOTeam.addEmployee(PMTeam);
        CEOTeam.addEmployee(SETeam);

        PMTeam.addEmployee(pm);
        PMTeam.addEmployee(pm2);
        PMTeam.addEmployee(clerk1);

        SETeam.addEmployee(se);
        SETeam.addEmployee(se2);
        SETeam.addEmployee(clerk2);

        PMTeam.removeEmployee(clerk1);

        CEOTeam.displayEmployee();
    }
}
