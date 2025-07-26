public class AppGenericClasses {
    public static void main(String[] args) {
        //generic classes
        //uses: MyIntClass.java, MyDoubleClass.java, MyCharacterClass.java, MyStringClass.java, MyGenericClass.java
        MyGenericClass<Integer> myInt = new MyGenericClass(1);
        MyGenericClass<Double> myDouble = new MyGenericClass(3.14);
        MyGenericClass<Character> myCharacter = new MyGenericClass('#');
        MyGenericClass<String> myString = new MyGenericClass("meow");

        System.out.println(myInt.getX());
        System.out.println(myDouble.getX());
        System.out.println(myCharacter.getX());
        System.out.println(myString.getX());
    }
}
