class OuterClass{
    int x=10;
    class InnerClass{
        int y=5;
    }
}
public class InnerClassesMain {
    public static void main(String[] args) {
        OuterClass out=new OuterClass();
        OuterClass.InnerClass in=out.new InnerClass();
        System.out.println(in.y+out.x);
    }
}
// inner classes
