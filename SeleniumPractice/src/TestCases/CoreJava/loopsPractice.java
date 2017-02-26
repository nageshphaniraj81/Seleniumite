package TestCases.CoreJava;

public class loopsPractice {

	public static void main(String[] args) {

		String str = "We have a large inventory ofcategory:anusha  things in our warehouse falling in the category:apperal "
				+ "and the slightly more in demand category:makeup along with category:jaji"
				+ " the category:furniture and ...hfkjhfhjdshkjfhdjshfjdhsj category:nagesh ";

		printCategories(str);

	}

	public static void printCategories(String str) {

		int startIndex = 0;
		int newStringEnd = 0;
		String newString;
		String categoryString;

		while (true) {
			startIndex = str.indexOf("category:");
			if (startIndex == -1)
				break;
			newString = str.substring(startIndex + 9);
			newStringEnd = newString.indexOf(" ");
			if (newStringEnd == -1) {
				System.out.println(newString);
				break;
			}
			categoryString = newString.substring(0, newStringEnd);
			System.out.println(categoryString);
			str = newString;
		}

	}

}
