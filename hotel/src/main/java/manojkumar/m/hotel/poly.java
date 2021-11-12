package manojkumar.m.hotel;

public class poly extends polymarphism {
	public void run() {
		System.out.println(" polymorphism is running successfully=100% good oops concept");
	}
	public static void main(String[] args) {
		polymarphism p=new poly();
		p.run();
		p.run();
		p.run();
		polymarphism k=new polymarphism();
		k.run();
	}

}
