import java.util.ArrayList;

public class arrayListMain {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("volvo");
        cars.add("bmw");
        cars.add("ford");
        
        cars.add(0,"mazda");    //index, element

        System.out.println(cars);       //[mazda, volvo, bmw, ford]
    }
}
