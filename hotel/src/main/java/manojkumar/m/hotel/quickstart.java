package manojkumar.m.hotel;

import java.util.Arrays;

public class quickstart {
	public int sortquick(int[] each,int start,int end)
	{
		int pivotaldata=each[end];
		int pos=start-1;
		for(int index=start;index<end;index++)
		{
			if(each[index]<pivotaldata)
				{
					pos++;
					int third=each[pos];
					each[pos]=each[index];
					each[index]=third;
				}			
		}
		int third=each[pos+1];
		each[pos+1]=each[end];
		each[end]=third;
		
		return pos+1;
	}
	public void quick(int[] one,int start,int end)
	{
		if(start<end)
		{
			int pivotal=sortquick(one,start,end);
			quick(one,start,pivotal-1);
			quick(one,pivotal+1,end);
		}
	}
	public static void main(String[] args) 
	{
	quickstart start=new quickstart();
	int[]	saysome= {11,32,44,56,23,12};
	System.out.println(Arrays.toString(saysome));
	start.quick(saysome, 0,saysome.length-1);
	System.out.println("after bubble\n"+Arrays.toString(saysome));
	}

}
