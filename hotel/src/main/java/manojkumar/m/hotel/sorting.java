package manojkumar.m.hotel;

import java.util.Arrays;

public class sorting {
	public void bubble(int[]hey)
	{
		for(int time=0;time<hey.length-1;time++)
		{
			for(int point=0;point<hey.length-time-1;point++)
			{
				if(hey[point]>hey[point+1])
				{
					hey[point]+=hey[point+1];
					hey[point+1]=hey[point]-hey[point+1];
					hey[point]-=hey[point+1];
				}
			}
		}
	}
	public static void main(String[] args) {
		sorting sort=new sorting();
		int[] say = {12,2,34,56,76,45,76,55};
		System.out.println(Arrays.toString(say));
		sort.bubble(say);
		System.out.println("after the bubble\n" +Arrays.toString(say));
	}
		
	}


