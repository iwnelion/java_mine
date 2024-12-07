abstract class Animal{
    public abstract void sound();
    public void sleep(){
        System.out.println("Zzz...");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Meow");
    }
}
class AbstractMain{
    public static void main(String[] args) {
        Cat myCat=new Cat();
        myCat.sound();  //Meow
        myCat.sleep();  //Zzz...
    }
}
