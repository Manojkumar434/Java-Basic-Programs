package manojkumar.m.hotel;

public class rightlowerfloyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char num='A';
		for(int row=5;row>0;row--)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++,num++)
			{
				System.out.print(num);
			}
			System.out.println();
		}

}
}
