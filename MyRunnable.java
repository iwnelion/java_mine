public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("thread #2: "+i);
            try {
				Thread.sleep(1000);     //only to make it look realistic, does not serve any purpose besides that
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
        }
        System.out.println("thread #2 is finished");
    }
}
