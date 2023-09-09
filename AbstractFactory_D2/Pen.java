package AbstractFactory_D2;

public class Pen {
    PenFactory getPen(String s){
        if(s.equalsIgnoreCase("gel")){
            return new gelPenFactory();
        }
        else if(s.equalsIgnoreCase("sketch")){
            return new sketchPenFactory();
        }
        return null;
    }
}
