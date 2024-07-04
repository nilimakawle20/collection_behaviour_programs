package Collection_Behaviour;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_Behaviour {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		//indexing
		pq.add("Akshay");
		pq.add("Aaarav");
		pq.add("Veer");
		pq.add("Badal");
		pq.add("Sachin");
		System.out.println("indexing : "+pq );    //indexing - false
		
		//Collections.sort(pq); //Compilation error
		//System.out.println("Sorting :"+pq); //sorting - false - method sort not applicable to PriorityQueue
		
		//null checking
		//pq.add(null);
		//pq.add(null);
		//pq.add(null);
		//System.out.println("null checking : "+pq ); //null - false - gives java.lang.NullPointerException
		
		//pq.add(100);   //runtime error
		// gives java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer 
		
		//pq.add(5.789);  //runtime error
		// gives java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Double 
		
		//pq.add(false);   //runtime error
		// gives java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Boolean 
		
		//System.out.println("heterogeneous : "+pq );  //heterogeneous - false
		
		pq.add("Veer");
		pq.add("Veer");
		pq.add("Veer");
		System.out.println("duplicate : "+pq );  //duplicate -true
		
		System.out.println("Order of insertion : "+pq );  //Order of insertion - false

	}

}
