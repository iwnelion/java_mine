public class MyMultithread extends Thread{
    @Override
    public void run(){
        for(int i=10; i>0; i--){
            System.out.println("thread #1: "+i);
            try {
				Thread.sleep(1000);     //only to make it look realistic, does not serve any purpose besides that
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
        }
        System.out.println("thread #1 is finished");
    }
}
