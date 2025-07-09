import java.util.ArrayList;

public class foreachLoop{
    public static void main(String[] args){
        //String[] cars={"bmw", "mercedes", "ford", "vw"};
        
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("bmw");
        cars.add("mercedes");
        cars.add("ford");
        cars.add("vw");
        
        for(String i : cars){
            System.out.println(i);
        }
    }
}