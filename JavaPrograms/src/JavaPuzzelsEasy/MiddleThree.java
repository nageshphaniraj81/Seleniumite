package JavaPuzzelsEasy;
import JavaPuzzelsEasyUT.MiddleThreeUT;

public class MiddleThree {
	/**
	Given a string of odd length, return the middle 3 characters from the string, 
	so the string <b>"Monitor"</b> yields <b>"nit"</b>. 
	If the string length is less than 3, return the string as is. <br> <br>

	<b>EXPECTATIONS:</b><br>
	middleThree("bunny") <b>---></b> "unn" <br>
	middleThree("peter") <b>---></b> "ete" <br>
	middleThree("Jamaica") <b>---></b>"mai" <br>
	 */
	
	public static String middleThree(String str) {
		String result = str;
		int length = str.length();
		if(length>4){
		int middle = length/2;
		result = str.substring(middle-1, middle+2);
		return result;
		}
		return result;
	}

	
//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		MiddleThreeUT.runTests();
	}
}


