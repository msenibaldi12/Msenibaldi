package msenibaldi;
/* Name: Timer Program
 * Author: Matt Senibaldi
 * Date: 9/6/2020
 * Synopsis: This program will run a basic timer.
 * This program is a basic timer
 */
import java.util.Timer;
import java.util.TimerTask;

public class mattsTimer {

	// Setting the start time to 0 seconds 
		int secondsPassed = 0;
		
		Timer myTimer = new Timer();
		TimerTask task = new TimerTask() {
			public void run() {
				secondsPassed++;  // Adding 1 second 
				System.out.println("Time Passed: " + secondsPassed);
			}
		};
		public void start() {    // Settings the interval for the timer, 1 second
			myTimer.scheduleAtFixedRate(task, 1000, 1000);
		}
		public static void main(String[] args) {
			mattsTimer msenibaldiProject = new mattsTimer();
			msenibaldiProject.start();
			
		}



}

	
	
	
		
	
	
	
	
	
	

	