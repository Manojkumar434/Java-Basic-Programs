package manojkumar.m.hotel;

public class constractor01 { 
	int chocolate;
	String kitkat;
	String name;
	public constractor01() {}
	void display()
	{
		System.out.println(chocolate+""+kitkat+""+name);
	}
public static void main(String[] args) {
	constractor01 C=new constractor01();
	C.display();
}
}
