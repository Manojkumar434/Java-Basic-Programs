package manojkumar.m.hotel;

import java.util.Arrays;

public class binarysearch {
	public void traverse(double[] yet)
	{ 
		for(double temp:yet)
			System.out.println(temp);
	}
	public int search(double []say,int start,int end,double users)
	{
		int mid=(start+end)/2;
		if(say[mid]==users)
			return mid;
			else if(say[mid]>users)
			return search(say,start,mid,users);
			else if(say[mid]<users)
			return search(say,mid+1,end,users);
			return-1;
	}
		
			
	public static void main(String[] args) 
	{
			double[] hai= {32.3,54.3,2.4,7.8,99.7,12.3,34.5,23.4};
			Arrays.sort(hai);
			binarysearch search=new binarysearch();
			search.traverse(hai);
			System.out.println(search.search(hai,0,hai.length,54.3));
	}

}
