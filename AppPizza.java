public class AppPizza {
    public static void main(String[] args) {
        //overloaded constructor
        //Pizza pizza=new Pizza("italian thin", "tomato", "mozzarella", "pepperoni");
        Pizza pizza=new Pizza("italian thin", "tomato", "mozzarella");

        System.out.println("Pizza ingredients:");
        System.out.println("bread: " + pizza.bread);
        System.out.println("sauce: " + pizza.sauce);
        System.out.println("cheese: " + pizza.cheese);
        // System.out.println("topping: " + pizza.topping);
    }
}
