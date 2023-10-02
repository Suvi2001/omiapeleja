package sovellus;

import java.util.Timer;
import java.util.TimerTask;
  
public class Notifier {
	public static void scheduler() {
	    TimerTask task = new TimerTask() {
	        public void run() {
	        
	        	MainGame.label4.setVisible(true);
	        	MainGame.labeli.setVisible(true);
	        	MainGame.labeli3.setVisible(true);
	        	MainGame.labeli2.setVisible(true);
	        	MainGame.labeli5.setVisible(true);
	        }
	    };
	    Timer timer = new Timer("Timer");
	    
	    long delay = 2000L;
	    timer.schedule(task, delay);
	    MainGame.label4.setVisible(false);
	    MainGame.labeli.setVisible(false);
	    MainGame.labeli3.setVisible(false);
	    MainGame.labeli2.setVisible(false);
		MainGame.labeli5.setVisible(false);
	}
}
