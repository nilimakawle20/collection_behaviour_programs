package Collection_Behaviour;

import java.util.Collections;
import java.util.HashSet;
import java.util.Vector;

public class Vector_Behaviour {

	public static void main(String[] args) {
		Vector vc=new Vector();
		//indexing
		vc.add("Akshay");
		vc.add("Aaarav");
		vc.add("Veer");
		vc.add("Badal");
		vc.add("Sachin");
		System.out.println("indexing : "+vc );    //indexing - true
		
		Collections.sort(vc);
		System.out.println("Sorting :"+vc); //sorting - true
		
		//null checking
		vc.add(null);
		vc.add(null);
		vc.add(null);
		System.out.println("null checking : "+vc ); //null - true
		
		vc.add(100);
		vc.add(5.789);
		vc.add(false);
		System.out.println("heterogeneous : "+vc );  //heterogeneous - true
		
		vc.add(100);
		vc.add(100);
		vc.add(100);
		System.out.println("duplicate : "+vc );  //duplicate -true
		
		System.out.println("Order of insertion : "+vc );  //Order of insertion - true

	}

}
