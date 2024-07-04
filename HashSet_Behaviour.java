package Collection_Behaviour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSet_Behaviour {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		//indexing
		hs.add("Akshay");
		hs.add("Aaarav");
		hs.add("Veer");
		hs.add("Badal");
		hs.add("Sachin");
		System.out.println("indexing : "+hs );    //indexing - false
		
		//Collections.sort(hs); //Compilation error
		//System.out.println("Sorting :"+hs); //sorting - false - method sort not applicable to Hashset
		
		//null checking
		hs.add(null);
		hs.add(null);
		hs.add(null);
		System.out.println("null checking : "+hs ); //null - accept only 1 null value
		
		hs.add(100);
		hs.add(5.789);
		hs.add(false);
		System.out.println("heterogeneous : "+hs );  //heterogeneous - true
		
		hs.add(100);
		hs.add(100);
		hs.add(100);
		System.out.println("duplicate : "+hs );  //duplicate -false
		
		System.out.println("Order of insertion : "+hs );  //Order of insertion - false


	}

}
