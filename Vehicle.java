class Vehicle {
    protected String brand="ford";
    public void honk(){
        System.out.println("tut tuuut");
    }
}
class Car extends Vehicle{
    private String modelName="mustang";
    public static void main(String[] args){
        Car c=new Car();
        c.honk();
        System.out.println(c.brand+" "+c.modelName);
    }
}
// inheritance
