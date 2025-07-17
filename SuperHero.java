public class SuperHero extends Human {
    //super-class: human
    //sub-class: superhero
    String power;
    
    SuperHero(String name, int age, String power){
        super(name, age);        //call to Human constructor
        this.power=power;
    }

    //override toString method to include power using super.toString()
    public String toString(){
        return super.toString() + this.power;
    }
}
