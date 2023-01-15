package Test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import compare.com.emp;

public class Test {

	public static void main(String[] args) {
		
		
		ArrayList<emp> e = new ArrayList<>();
		
		emp e1 = new emp(1001, "Sujit", "DACA");
		emp e2 = new emp(1005, "Ajit", "FACA");
		emp e3 = new emp(2, "zen", "Zaca");
		emp e4 = new emp(1010, "Kolar", "ACA");
		
		
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		
  	System.out.println(e);
		Collections.sort(e , new IdCompare());
		Collections.sort(e , new NameCompare());
			}
}
