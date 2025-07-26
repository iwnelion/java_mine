public class MyGenericClass <Thing> {
    Thing x;

    MyGenericClass(Thing x){
        this.x = x;
    }

    public Thing getX(){
        return x;
    }
}
