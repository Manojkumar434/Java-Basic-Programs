package manojkumar.m.hotel;

public class indianbank extends bank {
	public double getrateofinterest(double a)
	{
		return (7.5);
	}
	public static void main(String[] args) {
		indianbank s=new indianbank();
		bank n=new sbi();
		System.out.println("getrateofinterest:"+s.getrateofinterest());
		System.out.println("getrateofinterest:"+n.getrateofinterest());
	}

}
