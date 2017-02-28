package JavaPuzzelsEasy;

import JavaPuzzelsEasyUT.WordsCountUT;

public class WordsCount {

	/**
	 * 
	 * Given an array of strings, return the count of the number of strings with
	 * the given length <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * wordsCount({"a", "bb", "b", "ccc"}, 1) <b>---></b> 2<br>
	 * wordsCount({"a", "bb", "b", "ccc"}, 3) <b>---></b> 1 <br>
	 * wordsCount({"a", "bb", "b", "ccc"}, 4) <b>---></b> 0 <br>
	 */

	public static int wordsCount(String[] words, int len) {

		int count = 0;

		for (String s : words) {
			if (s.length() == len)
				count++;
		}

		return count;
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		WordsCountUT.runTests();

	}
}
