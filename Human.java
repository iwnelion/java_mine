public class Human {
    String name;
    int age;

    Human(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return this.name + " | " + this.age + " | ";
    }
}
