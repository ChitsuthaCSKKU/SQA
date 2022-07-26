package main;

import java.util.logging.*;

public class PhoneScreenReceiver {
	
	public static boolean isScreenOn = false;
	
	public void onReceive(int noAttempt, boolean isCorrectPwd) {
		
		Logger logger = Logger.getLogger(PhoneScreenReceiver.class.getName(), "Start checking");
		
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
				System.out.println("SCREEN_OFF = " + isScreenOn + "One last chance before your phone will be locked!!");		
			}
			else {
				logger.warning("Number of attempt to unlock the screen = " + noAttempt + "The phone will be locked!!");
				isScreenOn = false;
				System.out.println("SCREEN_OFF = " + isScreenOn + "The phone is locked. You have to wait for 24hrs. to try again.");					
			}
		}
		
	}

}
