package Collection_Behaviour;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet_Behaviour {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		//indexing
		ts.add("Akshay");
		ts.add("Aaarav");
		ts.add("Veer");
		ts.add("Badal");
		ts.add("Sachin");
		System.out.println("indexing : "+ts );    //indexing - false
		
		//Collections.sort(ts);  //Compilation error
		//System.out.println("Sorting :"+ts); //sorting - false - method sort not applicable to Treeset
		
		//null checking
		//ts.add(null);
		//ts.add(null);
		//ts.add(null);
		//System.out.println("null checking : "+ts ); //null - false - gives java.lang.NullPointerException
		
		//ts.add(100); //Runtime error
		//java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
		
		//ts.add(5.789); //Runtime error
		//java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Double
		
		//ts.add(false); //Runtime error
		//java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Boolean
		
		//System.out.println("heterogeneous : "+ts );  //heterogeneous - false
		
		ts.add("Badal");
		ts.add("Badal");
		ts.add("Badal");
		System.out.println("duplicate : "+ts );  //duplicate -false
		
		System.out.println("Order of insertion : "+ts );  //Order of insertion - false

	}

}
