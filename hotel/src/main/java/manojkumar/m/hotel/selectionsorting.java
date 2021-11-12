package manojkumar.m.hotel;

import java.util.Arrays;

public class selectionsorting {
	public void selection(int[] hoi)
	{
		for(int select=0;select<hoi.length;select++)
		{
			for(int com=0;com<hoi.length;com++)
			{
				if(hoi[select]>hoi[com])
				{
					hoi[select]^=hoi[com];
					hoi[com]^=hoi[select];
					hoi[select]^=hoi[com];

				}
			}
		}
	}
	public static void main(String[] args) {
		selectionsorting sorting=new selectionsorting();
		int[] say= {13,93,564,343,23,53,444};
		System.out.println(Arrays.toString(say));
		sorting.selection(say);
		System.out.println("after selection \n"+Arrays.toString(say));
	}

}
