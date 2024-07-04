package Collection_Behaviour;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_Behaviour {

	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet();
		//indexing
		lh.add("Akshay");
		lh.add("Aaarav");
		lh.add("Veer");
		lh.add("Badal");
		lh.add("Sachin");
		System.out.println("indexing : "+lh );    //indexing - true
		
		//Collections.sort(lh);  //Compilation error
		//System.out.println("Sorting :"+lh); //sorting - false - method sort not applicable to LinkedHashset
		
		//null checking
		lh.add(null);
		lh.add(null);
		lh.add(null);
		System.out.println("null checking : "+lh ); //null - accept only 1 null value
		
		lh.add(100);
		lh.add(5.789);
		lh.add(false);
		System.out.println("heterogeneous : "+lh );  //heterogeneous - true
		
		lh.add(100);
		lh.add(100);
		lh.add(100);
		System.out.println("duplicate : "+lh );  //duplicate -false
		
		System.out.println("Order of insertion : "+lh );  //Order of insertion - true

	}

}
