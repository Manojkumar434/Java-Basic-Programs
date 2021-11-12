package manojkumar.m.hotel;

public class pyramidlowerfloyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char num='A';int limit = (5*2)-1;
		for(int row=5;row>0;row--)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=limit;col++,num++)
			{
				System.out.print(num);
			}
			System.out.println();
			limit-=2;
		}

	}

}
