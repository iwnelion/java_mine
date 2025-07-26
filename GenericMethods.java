public class GenericMethods {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 6.6, 7.7, 8.8};
        Character[] charArray = {'c', 'v', 'b', 'n', 'm'};
        String[] stringArray = {"ABC", "DEF"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println(firstElement(intArray));
        System.out.println(firstElement(doubleArray));
        System.out.println(firstElement(charArray));
        System.out.println(firstElement(stringArray));
    }

    //print all elements in arrays of all types - generic!
    public static <Thing> void displayArray(Thing[] array){
        for(Thing x : array){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    //return a specific element from an array (of any type)
    public static <Thing> Thing firstElement(Thing[] array){
        return array[0];
    }
}
