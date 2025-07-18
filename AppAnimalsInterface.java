public class AppAnimalsInterface {
    public static void main(String[] args) {
        //uses: Rabbit.java, Hawk.java, Fish.java, (interfaces:) Prey.java, Predator.java
        //interface: a template that can be used in a class
        //similar to inheritance, but must define what the class does
        //we can have many interfaces in a class but only one superclass

        Fish fish = new Fish();
        Hawk hawk = new Hawk();

        fish.hunt();
        fish.flee();

        hawk.hunt();
    }
}
