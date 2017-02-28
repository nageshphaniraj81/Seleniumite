package JavaPuzzelsModerate;

//Write a program to reverse a number using numeric operations. 
//Below example shows how to reverse a number using numeric operations. 
// Formula :  reverse = (reverse*10)+(number%10);

public class ReverseNumber {
	 
    public int reverseNumbers(int number){
         
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
    }
     
    public static void main(String a[]){
    	ReverseNumber nr = new ReverseNumber();
        System.out.println("Result: "+nr.reverseNumbers(12345));
    }
}
