import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskClass {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask(){

			@Override
			public void run() {
                System.out.println("task is executed");
            }

        };

        Calendar date = Calendar.getInstance();
        
        date.set(Calendar.YEAR, 2025);
        date.set(Calendar.MONTH, Calendar.JULY);
        date.set(Calendar.DAY_OF_MONTH, 6);
        date.set(Calendar.HOUR_OF_DAY, 21);
        date.set(Calendar.MINUTE, 44);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        System.out.println(date.getTime());
        
        // timer.schedule(task, 0); //task, time in ms
    }
}
