package Collections;

import java.util.HashSet;
import java.util.Iterator;


public class HashmapSetinterface {
	
	public static void main(String[] args) {
		//hashset treeset linkedhashset implements Set interface
		//does not accept duplicate values
		//there is no guarantee that elements are  stored in sequential order, random
		HashSet<String> hs = new HashSet<String>();
		hs.add("valli");
		hs.add("java");
		hs.add("java");
		hs.add("usa");
		//prints set of only valli and java..does not accept duplicate values
		System.out.println(hs);
		hs.remove("java");
		System.out.println(hs);
		hs.isEmpty();
		hs.size();
		
		
		//there is an iterator in Set which iterates thru each index and prints 
		//import java util iternator
	Iterator<String> i = hs.iterator();
	//control comes to the first index when u say 
	//u create an object of type iterator for Set and say i.next it keeps on going to the next index
	//thats how we can traverse thru indexes of the Set 
	System.out.println(i.next());
	System.out.println(i.next());
	//if there are 100 indexes we cannot keep doing i.next for 100 times so we do while loop
//	
//	while(i.hasNext()) {
//		System.out.println(i.next());
//		}
	}

}
