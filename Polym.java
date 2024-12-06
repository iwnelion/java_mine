class Animal {
    public void animalSound(){
        System.out.println("animal sound!");
    }
}
class Cat extends Animal{
    public void animalSound(){
        System.out.println("Meow!");
    }
}
class Polym{
    public static void main(String[] args){
        Animal a=new Animal();
        Animal cat=new Cat();
        a.animalSound();
        cat.animalSound();
    }
}
// polymorphism
