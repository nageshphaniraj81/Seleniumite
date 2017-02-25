package TestCases.CoreJava;

public class MyFirstClass {
	
	public static void main(String [] args){
		
		String myVar;
		myVar = "Hello it's a beautiful day";
		
		System.out.println(myVar);
		System.out.println("Hello");
		
		printHello();
		
		
		int Result =sumThese(300,24);
		System.out.println(Result);

	}
	
	static void printHello(){
		System.out.println("Hello There");
	}
	
	static int sumThese(int firstArg,int secondArg){
		return firstArg+secondArg;
	}
	

}
