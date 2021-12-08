package manojkumar.m.hotel;

import java.util.Scanner;

public class purposeofThreads 
{
	public static void main(String[] args) {
		Manage manage =new Manage();
		//manage.search("str");
		Thread t1=new Thread(manage,"Manojkumar");
		Thread t2=new Thread(manage,"Vijayasarathy");
		Thread t3=new Thread(manage,"Manikanadan");
		Thread t4=new Thread(manage,"Nandhakumar");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
//		t1.run();t2.run();t3.run();t4.run();
		}
}
class Manage  extends Thread //implements Runnable
 {
	 private String[] crew= {"Vijay","Nayanthara","Lokesh","Sandhanam","vikram","kamal"};
	 private Scanner scan=new Scanner (System.in);
	 public void search(String names)
	 {
		 for(int index=0;index<crew.length;index++)
		 {
			 if(crew[index].equalsIgnoreCase(names))
			 {
				 System.out.println(names+ "Availabale @"+index);
				 return;
			 }
		 }
		 System.out.println(names+"doesn't found anywhere");
	 }

	@Override
synchronized public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"tell us bname to find in crew: ");
		System.out.println(Thread.currentThread().getId()+"this id name is different format display");
		System.out.println(Thread.currentThread().getPriority()+"this priority is n0t important in thread");
		search(scan.next());
	}
	 
 }
