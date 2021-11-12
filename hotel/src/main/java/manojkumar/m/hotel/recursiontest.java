package manojkumar.m.hotel;

public class recursiontest {
	public void heythere(int data)
	{
		if(data<=3)
		{
		System.out.println("function is running"+data);
		data++;
		heythere(data);
		}
		return;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		recursiontest test=new recursiontest();
		test.heythere(1);
	}
		

	}


