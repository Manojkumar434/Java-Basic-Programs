package manojkumar.m.hotel;

import java.util.Scanner;
public class leapyear{
	public static void main(String[] args) {
		int year;
		System.out.println("enter the year:");
		Scanner y=new Scanner(System.in);
		year=y.nextInt();
		if(((year %4==0)&&(year%100!=0)) ||(year%400==0)) 
		{
			System.out.println("this is leap year");
		}
		else
		{
			System.out.println("this is not leap year");
		}
	}
}
	