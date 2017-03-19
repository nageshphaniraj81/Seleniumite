package AbstractDataType;

public class TestCounter {

	public static void main(String[] args) {
		Counter count = new Counter("Test Counter");
		count.increment();
		count.increment();
		System.out.println("Current value of the counter is "+count.getCurrentValue());
        count.increment();
        System.out.println(count.toString());
		count.increment();
		count.increment();
		System.out.println("Current value of the counter is "+count.getCurrentValue());
	}

}
