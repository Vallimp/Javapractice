package HashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashpmapexample {
//this interface takes the values in the form of key value pair
//we map key to the value, that is when u pass the value u need to pass the index or the key too
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		//here the word is put
		//in 0th key i am placing hello
		hm.put(0, "hello");
		hm.put(1, "goodbye");
		hm.put(42, "morning");
		hm.put(3, "evening");
//we do get(key) to find value at a particular index
		hm.get(1);
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		//each key and value will be stored as a set index
		//converting hashmap into a Set
		Set sn =hm.entrySet();
		//now to traverse thru each and every index of set we can use iterator but with no string argument
		Iterator it =sn.iterator();
		while(it.hasNext()){
			//it will be confused with the below statement whether it should be retrieving the key or value and throws error
			//System.out.println(it.next());
			//for getting key separate and value separate we are using map.entry so we hav casted map.entry
			Map.Entry  mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			//interview question
			//I am passing some data as key value pairs. extract me by pushing those values into Set collection
			//question: Create a hash table and pass the table to the set collection 
			//and print the key and value separately using the iterator
		}
		

	}
}