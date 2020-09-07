package msenibaldi;

import java.util.Timer;
import java.util.TimerTask;

public class mattsTimer {

	
		int secondsPassed = 0;
		
		Timer myTimer = new Timer();
		TimerTask task = new TimerTask() {
			public void run() {
				secondsPassed++;
				System.out.println("Time Passed: " + secondsPassed);
			}
		};
		public void start() {
			myTimer.scheduleAtFixedRate(task, 1000, 1000);
		}
		public static void main(String[] args) {
			mattsTimer msenibaldiProject = new mattsTimer();
			msenibaldiProject.start();
			
		}



}

	
	
	
		
	
	
	
	
	
	

	