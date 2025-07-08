public class ArrayLoop {
    public static void main(String[] args) {
        String[] cars=new String[3];

        cars[0]="lambo";
        cars[1]="bmw";
        cars[2]="mercedes";

        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
