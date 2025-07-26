public class AppOutside {
    public static void main(String[] args) {
        //uses: Outside.java
        //inner and outer classes
        Outside out = new Outside();
        Outside.Inside in = out.new Inside();

        //System.out.println(out.x + in.y);   //hello world

        in.sayHello();  //hello world
    }
}
