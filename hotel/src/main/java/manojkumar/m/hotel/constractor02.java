package manojkumar.m.hotel;

public class constractor02 {
	int rollno;
	String collegename;
	String busname;
	public constractor02(int r,String c,String b)
	{
		rollno=r;
		collegename=c;
		busname=b;
		
	}
	void display()
	{
		System.out.println(rollno+""+collegename+""+busname);
	}
	public static void main(String[] args) {
		constractor02 n=new constractor02(18212,"ksr","namakkal-84");
		constractor02 n1=new constractor02(7367,"mcas","trichengode-246");
		n.display();
		n1.display();
	}

}
