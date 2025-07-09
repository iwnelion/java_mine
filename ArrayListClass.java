import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        //ArrayList = a resizable array
        //            elements can be added and removed after compilation phase
        //            can store reference data types (objects)
        
        ArrayList<Integer> numbers=new ArrayList<Integer>();

        //add elements to the arraylist
        numbers.add(5);
        numbers.add (67);
        numbers.add(100);

        //change element
        numbers.set(0, 10);  //index, element

        //remove element
        numbers.remove(2);

        //clear arraylist
//        numbers.clear();

        //print arraylist elements
        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}