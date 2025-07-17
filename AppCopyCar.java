public class AppCopyCar {
    public static void main(String[] args) {
        //copy an object
        CopyCar car1 = new CopyCar("vw", "golf", 2003);
        CopyCar car2 = new CopyCar("bmw", "x2", 2015);
        CopyCar car3 = new CopyCar(car1);   //using the copy constructor

        car2.copy(car1);

        //print the objects' addresses
        //they have different addresses but the same content
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println();

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println();

        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

        System.out.println();

        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());
    }
}
