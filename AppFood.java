public class AppFood {
    public static void main(String[] args) {
        //array of objects
        //Food[] foods=new Food[3];
        
        //food objects
        // Food food1=new Food("pitogiro");
        // Food food2=new Food("pizza");
        // Food food3=new Food("icecream");

        //array of objects and inserting objects into the array at the same time
        //Food[] foods={food1, food2, food3};
        //or
        Food[] foods={new Food("pitogiro"), 
                      new Food("pizza"), 
                      new Food("icecream")};


        //inserting objects into the array
        // foods[0]=food1;
        // foods[1]=food2;
        // foods[2]=food3;

        //printing the names of the foods
        for (Food food : foods) {
            System.out.println(food.name);
        }

        //System.out.println(foods[0].name);
        //System.out.println(foods[1].name);
        //System.out.println(foods[2].name);
    }
}
