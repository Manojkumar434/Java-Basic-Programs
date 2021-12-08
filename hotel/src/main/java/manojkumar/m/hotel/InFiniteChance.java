package manojkumar.m.hotel;

import java.util.Scanner;

public class InFiniteChance 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int yet=0,yets=0;
		try
		{
			System.out.println("Enter the two numbers: ");
			yet=scan.nextInt();
			yets=scan.nextInt();
			System.out.println(yet+" "+yets);
			System.out.println(yet/yets);
		}
		catch(ArithmeticException am)
		{
			System.out.println(am+"\nEnter except 0");
			InFiniteChance.main(args);
		}
	}
}
