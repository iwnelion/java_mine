public class AppMultithreading {
    public static void main(String[] args) {
        //uses: MyMultithreading.java, MyRunnable.java

        //way 1
        MyMultithread thread1 = new MyMultithread();

        //way2: MyRunnable.java
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        //start the threads
        thread1.start();
        thread2.start();
        //=>they are both happening at the same time! 
    }
}
