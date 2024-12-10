import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter you name: ");
        String name=sc.nextLine();

        System.out.println("enter your age: ");
        int age=sc.nextInt();

        System.out.println(name +", "+ age);

        sc.close();
    }
}
