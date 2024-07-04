package Collection_Behaviour;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Behaviour {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		//indexing
		al.add("Akshay");
		al.add("Aaarav");
		al.add("Veer");
		al.add("Badal");
		al.add("Sachin");
		System.out.println("indexing : "+al );    //indexing - true
		
		Collections.sort(al);
		System.out.println("Sorting :"+al); //sorting - true
		
		//null checking
		al.add(null);
		al.add(null);
		al.add(null);
		System.out.println("null checking : "+al ); //null - true
		
		al.add(100);
		al.add(5.789);
		al.add(false);
		System.out.println("heterogeneous : "+al );  //heterogeneous - true
		
		al.add(100);
		al.add(100);
		al.add(100);
		System.out.println("duplicate : "+al );  //duplicate -true
		
		System.out.println("Order of insertion : "+al );  //Order of insertion - true

	}

}
