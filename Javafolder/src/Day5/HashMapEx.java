package Day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String,Integer> phonebook=new HashMap<>();
		phonebook.put("mnop", 12345);
		phonebook.put("xyz", 67789);
		phonebook.put("mlk", 45678);
		phonebook.put("abcd", 12345);
		System.out.println(phonebook);
		Set set = phonebook.entrySet();
		Iterator itr=set.iterator();
		//search operation
		System.out.println(phonebook.get("xyz"));
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(phonebook.values());
		//using map entry
		System.out.println();
		itr=set.iterator();//reset to entry point
		while(itr.hasNext()) {
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+"---"+entry.getValue());
			
		}
		

	}

}
