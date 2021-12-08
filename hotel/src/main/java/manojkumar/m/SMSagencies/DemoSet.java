package manojkumar.m.SMSagencies;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoSet {
	public static void main(String[] args) {
		HashSet<Character> hash=new HashSet<Character>();
		TreeSet<Character> tree=new TreeSet<Character>();
		
		hash.add('R');hash.add('V');hash.add('R');hash.add('Q');hash.add('W');hash.add('M');
		
		tree.addAll(hash);
		
		tree.add('C');tree.add('Z');tree.add('P');tree.add('V');
		
		System.out.println("HAshSet: "+hash);
		System.out.println("TreeSet: "+tree);
		
		hash.remove('R');tree.remove('Q');
		
		System.out.println(tree.contains('R'));
		
		System.out.println("HAshSet: "+hash);
		System.out.println("TreeSet: "+tree);
		
		hash.retainAll(tree);
		
		System.out.println("HAshSet: "+hash);
		System.out.println("TreeSet: "+tree);
	}
}
