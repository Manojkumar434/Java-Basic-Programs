package manojkumar.m.hotel;

public class Insist
{
	public static void main(String[] args) 
	{
		try
		{
			String hai="alpha";
			System.out.println(hai.charAt(3));
			throw new StringIndexOutOfBoundsException();
		}
		catch(StringIndexOutOfBoundsException sin)
		{
			System.out.println(sin+"\nIn catch block");
		}
		finally
		{
			System.out.println("throw keyword is use of forward \n END");
		}
	}

}
