import java.util.ArrayList;

public class Methods{
    public static void main(String[] args){
        int x=3;
        int y=5;

        System.out.println(add(x, y));  //8
    }
    static int add(int num1, int num2){
        int result=num1+num2;
        return result;
    }
}