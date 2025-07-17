public class AppRefrigerator {
    public static void main(String[] args) {
        //object as argument
        //uses Refrigerator.java and Food.java
        Refrigerator ref=new Refrigerator();
        Food food1=new Food("pastitsio");

        ref.freeze(food1);      //call the freeze method with food1 object as an argument
    }
}
