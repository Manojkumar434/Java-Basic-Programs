package manojkumar.m.SMSagencies;

import java.util.Iterator;
import java.util.Stack;

public class PurposeOfCollection
{
	public static void main(String[] args)
	{
		Stack hello=new Stack();
		hello.push("Manojkumar");
		hello.push(979355930L);
		hello.push(434);
		hello.push(88.9);
		
		System.out.println(hello);
		Iterator it=hello.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(hello.empty());
		System.out.println(hello.pop());
		System.out.println(hello.pop());
		System.out.println(hello.peek());
		System.out.println(hello.search("Manojkumar"));
	}

}
