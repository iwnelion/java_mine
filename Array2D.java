public class Array2D {
    public static void main(String[] args) {
        String[][] cars=new String[3][3];       //rows, cols

        //row 1
        cars[0][0]="bmw";
        cars[0][1]="mercedes";
        cars[0][2]="ford";

        //row 2
        cars[1][0]="ferrari";
        cars[1][1]="tesla";
        cars[1][2]="lambo";

        //row 3
        cars[2][0]="vw";
        cars[2][1]="toyota";
        cars[2][2]="ranger";

        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
        }
        System.out.println();
    }
}
