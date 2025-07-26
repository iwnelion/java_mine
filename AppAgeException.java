import java.util.Scanner;

public class AppAgeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = sc.nextInt();

        try{
            checkAge(age);
        }catch(Exception e){
            System.out.println("a problem has occurred: " + e);
        }
    }
    static void checkAge(int age) throws Exception{
        if(age<18){
            throw new AgeException("\n" + "you must be an adult to sign in");
        }else{
            System.out.println("you are now signed in");
        }
    }
}
