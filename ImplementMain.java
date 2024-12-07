interface Animal {
    public void sound();
    public void sleep();
}
class Cat implements Animal {
    public void sound() {
        System.out.println("meow");
    }
    public void sleep() {
        System.out.println("zzz");
    }
}

public class ImplementMain {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.sound();
        c.sleep();
    }
    
}
