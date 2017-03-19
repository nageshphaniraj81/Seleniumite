package Stacks;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(returnReverse("nagesh"));
		System.out.println(returnReverse("hello India"));
		System.out.println(returnReverse("9886292980"));
	}
	
	
	public static String returnReverse(String name){
		
		String reversedName = "";
		StackString stack  = new StackString(name.length());
		
		//Push
        for(int i=0;i< name.length();i++){
        	stack.push(name.charAt(i));
        }
        
        //Pop
		while(!stack.isEmpty()){
			char value = stack.pop();
			reversedName = reversedName+value;
		}
		
		return reversedName;
		
	}
	

}
