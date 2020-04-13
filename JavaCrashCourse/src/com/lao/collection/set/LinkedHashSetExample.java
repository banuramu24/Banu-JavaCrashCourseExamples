//COLLECTION: 
//2)SET
//LINKEDHASHSET-2)

package com.lao.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	/*
	 * LinkedHashSet->Child Class of HashSet
	 * DS-> Hashtable+Linked List.
	 * why we come to LinkedHashSet? Since already we have HashSet.
	 * If we want Insertion order to be preserved.
	 * But Duplicates are not allowed.
	 */
    public void linkedHashSetExample() {
    	Set linkedhashset=new LinkedHashSet(); //No generics is used here.
    	//We are inserting different data types below.
		linkedhashset.add(1);
		linkedhashset.add(2);
		linkedhashset.add("A");
		linkedhashset.add("B");
		linkedhashset.add("C");
		linkedhashset.add("10");
		linkedhashset.add(null);
		linkedhashset.remove(2);
		
		System.out.println("Insertion order is preserved in LinkedHashSet :" +linkedhashset);
		System.out.println("Size :" +linkedhashset.size());
    }
	public static void main(String[] args) {
		LinkedHashSetExample linkedhashsetexample=new LinkedHashSetExample();
		linkedhashsetexample.linkedHashSetExample();
	}

}
