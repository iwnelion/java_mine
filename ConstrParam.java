public class ConstrParam{
    int x;
    public Constr(int y){
        x=y;
    }
    public static void main(String[] args) {
        Constr c=new Constr(5);
        System.out.println(c.x);
    }
}
