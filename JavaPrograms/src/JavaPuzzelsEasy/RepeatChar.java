package JavaPuzzelsEasy;

import JavaPuzzelsEasyUT.RepeatCharUT;

public class RepeatChar {

	/**
	 * 
	 * Given a string, return a string where for every char in the original,
	 * append another. <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * repeatChar("The") <b>---></b>"TThhee"<br>
	 * repeatChar("AAbb") <b>---></b> "AAAAbbbb" <br>
	 * repeatChar("Hi-There") <b>---></b> "HHii--TThheerree" <br>
	 */

	public static String repeatChar(String str) {

		String newString = "";

		for (int i = 0; i < str.length(); i++) {
			newString = newString + str.charAt(i) + str.charAt(i);
		}

		return newString;

	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		RepeatCharUT.runTests();

	}

}
