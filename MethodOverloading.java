import java.util.ArrayList;

public class MethodOverloading{
    public static void main(String[] args){
        //overloaded methods = methods that have the same name but different params
        //method name + params = method signature

        double result=add(2.5, 5.7);
        System.out.println(result); //8.2
    }
    static int add(int x, int y){
        System.out.println("method 1");
        return x+y;
    }
    static int add(int x, int y, int z){
        System.out.println("method 2");
        return x+y+z;
    }
    static double add(double x, double y){
        System.out.println("method 1 double");
        return x+y;
    }
    static double add(double x, double y, double z){
        System.out.println("method 2 double");
        return x+y+z;
    }
}