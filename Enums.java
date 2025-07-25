enum Days{
    //the param is optional. we use it as a counter with the constructor belows
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    int number;

    //constructor for the enum
    Days(int number){
        this.number = number;
    }
}

public class Enums{
    public static void main(String[] args){
        //enum = enumerated
        //it's like an ordered list with objects, like a group
        
        Days myDay = Days.MONDAY;
        
        canWork(myDay);
    }
    static void canWork(Days myDay){
        switch(myDay){
                case SATURDAY:
                    System.out.println("you can skip work");
                    System.out.println("this is day number: "+myDay.number);
                    break;
                case SUNDAY:
                    System.out.println("you can skip work");
                    System.out.println("this is day number: "+myDay.number);
                    break;
                default:
                    System.out.println("get back to work");
                    System.out.println("this is day number: "+myDay.number);
                    break;
        }
    }
}