package manojkumar.m.hotel;

public class PurposeofException 
{
	static String exe="manojkumar";
	public static void main(String[] args) //nullpointer exception
	{
		try
		{
			System.out.println(exe.length());
			System.out.println("length obtained");
		}
		catch(NullPointerException np)
		{
			//System.out.println(np);
			np.printStackTrace();
			exe="Sarathy";
			System.out.println(exe.length());
			System.out.println("Length Obtained");
		}
		finally
		{
			System.out.println("program ended");
		}
	}

}
