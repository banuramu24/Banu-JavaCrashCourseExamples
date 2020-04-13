//COLLECTION: 
//3)MAP
//LINKEDHASHMAP-2)
package com.lao.mapExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
/*
 * LINKEDHASHMAP(C) is a implementation class for MAP(I) interface.
 * Insertion order is preserved here.
 * Duplicate keys are not allowed. but duplicate values are allowed.
 * Uses a technique called Hashing to store elements.
 * Only 1 NULL key is allowed.
 * A VALUE of the MAP can only be fetched using its KEY.
 * Synchronised: NO .
 * So if it has to be used in multithreading environment,it has to be synchronised explicitly.
 * Initial Capacity: 16 and Load Factor:0.75
 */
public class LinkedHashMapExample {

	public static void main(String[] args) {
	//LinkedHashMap : Maintains Insertion Order, null cases possible. no exception will happen. only overwritten happens.
	LinkedHashMap<String,String> heros=new LinkedHashMap<String,String>(); 
		heros.put(null, " ");
		heros.put("IronMan", "Tony Stark");
		heros.put("BatMan", "Bruce Wayne");
		heros.put("SuperMan", "Clark");
		//1)Eg for 1 NULL key is allowed.
		heros.put(null, "Power Star");
		//2)Eg for If i allow another null key with different value.
		//Nothing will happen. It will overwrite.bcoz it will condider null key as normal key.
		heros.put(null, "Little Super Star");
		//(or)
		heros.put(null, null);
		System.out.println(heros);
		
	//HashMap : Doesn't Maintain Insertion Order,null cases possible.no exception will happen. only overwritten happens.
	HashMap <String,String> hasmapheros=new HashMap<String,String>();
		hasmapheros.put("IronMan", "Tony Stark");
		hasmapheros.put("BatMan", "Bruce Wayne");
		hasmapheros.put("SuperMan", "Clark");
		//1)Eg for 1 NULL key is allowed.
		hasmapheros.put(null, "XYZ");
		//2)Eg for If i allow another null key with different value.
		//Nothing will happen. It will overwrite.bcoz it will consider null key as normal key.
		hasmapheros.put(null, "ABC");
		System.out.println(hasmapheros);
		
		//Whatever methods we saw for HashMap . Same for LinkedHashMap.
		
	}
 
}
