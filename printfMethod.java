import java.util.ArrayList;

public class printfMethod{
    public static void main(String[] args){
        //printf = an optional method to control, format and display text to the console.
        //2 args = format string + (object/variable/value)
        //% [flags] [precision] [width] [conversion-character]

        boolean myBool=true;
        char myChar='$';
        String myString="meow";
        int myInt=5000;
        double myDouble=1.56;

        System.out.printf("%b ", myBool);
        System.out.printf("%c ", myChar);
        System.out.printf("%s ", myString);
        System.out.printf("%d ", myInt);
        System.out.printf("%f ", myDouble);

        //width
        //minimun characters to be written
        System.out.printf("hello %10s", myString);

        //precision
        //sets number of digits of precision (float-double)
        System.out.printf("double num: %.3f", myDouble);    //1.560

        //flags
        //adds an effect to output
        //- left justify
        //+ outputs a plus (+) or a minus (-)
        //0 numeric value are zero-padded
        //, grouping separator
        System.out.printf("you have this amount of money: %,f", myDouble);

    }
}