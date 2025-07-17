public class AppFoodStatic {
    public static void main(String[] args) {
        //static = modifier. a single copy of a variable/method is created and shared
        //the class "owns" the static member

        //uses Food.java
        Food food1 = new Food("souvlaki");
        Food food2 = new Food("pizza");

        //System.out.println(Food.numberOfFoods);    //runs: 2, static variable accessed through class name
        Food.printNumberOfFoods();      //static method accessed through class name
    }
}
