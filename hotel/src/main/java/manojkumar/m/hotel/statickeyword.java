package manojkumar.m.hotel;

public class statickeyword {
int no;
String name;
static String college=" sona college";
statickeyword (int n,String s)
{
	no=n;
	name=s;
}
void display()
{
System.out.println(no+"" +name+"" +college);
}
	public static  void main(String[] args) {
	statickeyword s=new statickeyword (111 , "vijay");
	statickeyword s1=new statickeyword (11 , "manoj");
	s.display();
	s1.display();
	}
}




