package Test.java;

import java.util.Comparator;

import compare.com.emp;

public class IdCompare implements Comparator<emp> {
	
	@Override
	public int compare(emp o1, emp o2) {
		
		return o1.getId() - o2.getId();
	}

}
