package main;

import java.util.logging.*;

public class LockedScreen {
	
	public static boolean isScreenOn = false;
	
		public void onReceive(int noAttempt, boolean isCorrectPwd) {
		
			Logger logger = Logger.getLogger(LockedScreen.class.getName(), "Start checking");
		
			if (isCorrectPwd) {
				isScreenOn = true;
				logger.log(Level.CONFIG, "SCREEN_ON" + isScreenOn);
			}
			else {
		
				if (noAttempt <=3) {
					logger.warning("Number of attempt to unlock the screen = " + noAttempt);
					isScreenOn = false;
					System.out.println("SCREEN_OFF = " + isScreenOn);
				}
				else if (noAttempt == 4)
				{	logger.warning("Number of attempt to unlock the screen = " + noAttempt + " Only one last attempt left!!");		
					isScreenOn = false;
					System.out.println("SCREEN_OFF = " + isScreenOn + "One last chance before your computer will be locked!!");		
				}
				else {
					logger.warning("Number of attempt to unlock the screen = " + noAttempt + "The computer will be locked!!");
					isScreenOn = false;
					System.out.println("SCREEN_OFF = " + isScreenOn + "The computer is locked. You have to wait for 24hrs. to try again.");					
			}
		}		
	}
}
