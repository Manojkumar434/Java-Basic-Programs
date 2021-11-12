package manojkumar.m.hotel;

public class reversenumber {
	public static void main(String[] args) {
		long num=395539879 ,reversed=0;
		while(num!=0)
		{
			long digit=num%10;
			reversed=reversed*10+digit;
			num/=10;
			System.out.println("reversed numbers:"+reversed);
		}
			
		
	}

}
