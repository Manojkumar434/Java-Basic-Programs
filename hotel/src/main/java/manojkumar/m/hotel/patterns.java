package manojkumar.m.hotel;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char num='A';
		for(int row=5;row>0;row--)
		{
			for(int col=1;col<=5;col++,num++)
			{
				System.out.print(num);
			}
			System.out.println();
		}
	}

}
