public class Outside {
    //outer class
    String x = "hello";

    public class Inside{
        //inner class
        String y = " world";

        //inner class method
        public void sayHello(){
            System.out.println(x + y);
        }
    }
}
