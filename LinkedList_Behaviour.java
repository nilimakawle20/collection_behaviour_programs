package Collection_Behaviour;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Behaviour {

	public static void main(String[] args) {
		LinkedList ln=new LinkedList();
		//indexing
		ln.add("Akshay");
		ln.add("Aaarav");
		ln.add("Veer");
		ln.add("Badal");
		ln.add("Sachin");
		System.out.println("indexing : "+ln );    //indexing - true
		
		Collections.sort(ln);
		System.out.println("Sorting :"+ln); //sorting - true
		
		//null checking
		ln.add(null);
		ln.add(null);
		ln.add(null);
		System.out.println("null checking : "+ln ); //null - true
		
		ln.add(100);
		ln.add(5.789);
		ln.add(false);
		System.out.println("heterogeneous : "+ln );  //heterogeneous - true
		
		ln.add(100);
		ln.add(100);
		ln.add(100);
		System.out.println("duplicate : "+ln );  //duplicate -true
		
		System.out.println("Order of insertion : "+ln );  //Order of insertion - true

	}

}
