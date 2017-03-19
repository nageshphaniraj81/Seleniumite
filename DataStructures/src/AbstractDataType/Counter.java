package AbstractDataType;

public class Counter {
	
	private int count = 0;
	private String str;
	
	public Counter(String str){
		this.str = str;
	}
	
	public void increment(){
		count++;
	}
	
	public int getCurrentValue(){
		return count;
	}
	
	public String toString(){
		return "The value of the "+str+" counter is : "+count;
	}
	

}
