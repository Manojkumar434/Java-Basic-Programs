package manojkumar.m.hotel;

public class car extends bike {
	public void worker()
	{
		System.out.println("workers");
	}
	public static void main(String[] args) {
		
		car b = new car();
		b.gear();
		b.worker();
		
	}

}
