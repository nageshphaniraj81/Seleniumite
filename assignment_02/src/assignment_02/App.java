package assignment_02;

import ignore.TestingUtils;

public class App {

	/**
	 * You are driving a little too fast, and a police officer stops you. Write
	 * code to compute the fine you would have to pay. If your speed is 60 or
	 * less, the result is 0 since there is no fine. If speed is between 61 and
	 * 80 inclusive, the fine is 100 dollars. If speed is 81 or more, the result
	 * is 200. Unless it is a holiday -- on that day, your speed can be 5 higher
	 * in all cases. <br>
	 * <br>
	 *
	 * <b>EXPECTATIONS:</b><br>
	 * speedingFine(60, false) <b>---></b> 0 <br>
	 * speedingFine (65, false) <b>---></b> 100 <br>
	 * speedingFine (65, true) <b>---></b> 0 <br>
	 */
	public static int speedingFine(int speed, boolean isHoliday) {

//		if (!isHoliday) {
//
//			if (speed <= 60) {
//				return 0;
//			} else if (speed >= 61 && speed <= 80) {
//				return 100;
//			} else if (speed >= 81) {
//				return 200;
//			}
//
//		} else {
//			if (speed <= 60 + 5) {
//				return 0;
//			} else if (speed >= 61 + 5 && speed <= 80 + 5) {
//				return 100;
//			} else if (speed >= 81 + 5) {
//				return 200;
//			}
//		}
//
//		return 0;
		
		int minSpeed = 60;
		int maxSpeed = 80;
		
		if(isHoliday){
			minSpeed+=5;
			maxSpeed+=5;
		}
		
		if(speed <= minSpeed){
			return 0;
		}else if(speed >= minSpeed && speed <= maxSpeed){
			return 100;
		}else{
			return 200;
		}
		

	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils.runTests();
	}

}
