public class MyThread extends Thread {
    @Override
    public void run(){
        if(this.isDaemon()){
            System.out.println("this is a daemon thread");
        }else{
            System.out.println("this is a user thread running");
        }
    }
}
