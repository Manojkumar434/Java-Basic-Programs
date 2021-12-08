package manojkumar.m.hotel;

import java.io.IOException;

public class checkedSample 
{
	public static void main(String[] args)  throws IOException, InterruptedException 
	{
		Runtime run=Runtime.getRuntime();
		Process pro=run.exec("notepad");
		Thread.sleep(1000);
		pro=run.exec("calc");
		Thread.sleep(1000);
		pro=run.exec("mspaint");
	}

}
