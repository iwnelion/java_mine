public class ThreadStuff {
    public static void main(String[] args) throws InterruptedException {
        //uses MyThread.java (only for the last part)

        // System.out.println(Thread.activeCount()); //1

        // Thread.currentThread().setName("meow");
        // System.out.println(Thread.currentThread().getName()); //meow, but without renaming, it's main

        // Thread.currentThread().setPriority(10);
        // System.out.println(Thread.currentThread().getPriority()); //10 bc of the previous, but 5

        // System.out.println(Thread.currentThread().isAlive()); //true

        //countdown from 3 to 0 to put the thread to sleep
        // for(int i=3; i>0; i--){
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }

        //create a new thread
        MyThread thread2 = new MyThread();
        //make thread2 equal to a daemon thread
        thread2.setDaemon(true);
        thread2.start();
        // thread2.setName("THREAD 2");
        // System.out.println(thread2.getName()); //nnormally Thread-0, but here THREAD 2


        System.out.println(Thread.activeCount()); //runs: this is a user thread running (*from the run func in MyThread.java*), 2


    }
}
