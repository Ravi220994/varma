package exception;

import java.util.ArrayList;
import java.util.List;

public class IndexOut {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(11);
		l.add(22);
		l.add(12);
		l.add(23);
		
		System.out.println(l.get(5));
		
		
	}

}
