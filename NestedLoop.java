import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int rows, cols;
        String symbol="";

        System.out.println("enter # of rows: ");
        rows=sc.nextInt();

        System.out.println("enter # of columns: ");
        cols=sc.nextInt();

        System.out.println("enter symbol: ");
        symbol=sc.next();

        for(int i=1; i<=rows; i++){
            System.out.println();           //print a new line for each row
            for(int j=1; j<=cols; j++){
                System.out.print(symbol);   //print the symbol for each column
            }
        }
        System.out.println();               //print a new line after the last row
        sc.close();
    }
}
