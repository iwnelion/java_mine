public class Food {
    String name;
    static int numberOfFoods;

    Food(String name){
        this.name=name;
        numberOfFoods++;
    }

    static void printNumberOfFoods(){
        System.out.println("total number of foods: "+numberOfFoods);
    }
}
