//COLLECTION: 
//2)SET
//TREESET-3)
package com.lao.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
/*
 * TreeSet is the Implementation class of SoretdSet Interface.
 * Does not allow duplicates.
 * null insertion is not possible.
 * Sorts the element, Insertion order will not be maintained.
 * It has 6 methods like first,last,headSet,tailSet,subSet and comparator.
 * Difference between Hashset and TreeSet, hash doesnt maintain order.
 * but Treeset maintains ascending or alphabetic order.
 * DS-> Balanced Tree.
 * Heterogeneous data not allowed.If added Exception,ClassCast will occur.
 * For Default natural sorting order, the objects should be homogeneous and comparable else class cast exception
 * To say any class is comparable or not,the class should implement comparable interface. see eg below for class cast exception.
 */
	
	/*
	 * 
	 */
	public void treeSetExample() {
		//Creating Object
		TreeSet <Integer> treeset=new TreeSet<Integer>();
		treeset.add(10);
		treeset.add(1);
		treeset.add(2);
		treeset.add(9);
		treeset.add(7);
		treeset.add(3);
		System.out.println("Elements are sorted on ascending order :" +treeset);
		//1)First:
		System.out.println("First Element :" +treeset.first());
		//2)Last:
		System.out.println("Last Element :" +treeset.last());
		//3)headSet(): It will return the values which is lesser than the given value 3.
		System.out.println("Values lesser than the given value 3:" +treeset.headSet(3));
		//4)tailSet(): It will return the values equal to and higher than the given value 3.
		System.out.println("Values equal to and higher than the given value 9:" +treeset.tailSet(9));
		//5)subSet(): between 2 & 9 o/p : 2,3,7
		System.out.println("Subset values between 2 & 9 :"+treeset.subSet(2, 9));
		//6)Comparator:when explicitly we did not mention like indha order la dhan nee arrange aaganum
		//             nu namma sollaama default ah irukura sorting order la arrange aachi apdinaa comparator()
		//             null ah return panum.
		System.out.println("Comparator returns null if the sorting is default natural order :" +treeset.comparator());
		//7)Higher:
		System.out.println("Returns value of next immediate Higher than value 3: "+treeset.higher(3));
		//8)Lower:
		System.out.println("Returns value of next immediate Lower than value 2: "+treeset.lower(2));
		//9)pollfirst:
		System.out.println("poll first "+treeset.pollFirst()); //retrieves the first element and deletes it.
		//10)polllast:
		System.out.println("poll last "+treeset.pollLast());   //retrieves the last element and deletes it.
		//11)After polling:
		System.out.println("After Polling "+treeset);
		//12)Descending Order Set:
		System.out.println("Descending Order Set "+treeset.descendingSet());
	
	//Normal Iteration:-We can use Iterator
	Iterator <Integer> iterator=treeset.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	//Descending Iterator: allows for Descending traverse.
	Iterator <Integer> desciterator=treeset.descendingIterator();
	while(desciterator.hasNext()) {
		System.out.println(desciterator.next());
	}
	//Eg for class cast exception
	TreeSet<StringBuffer> set=new TreeSet<StringBuffer>(); //here StringBuffer doesnt implement Comparable Interface.
	set.add(new StringBuffer("B")); //We are adding StringBuffer object here.
	set.add(new StringBuffer("A"));
	System.out.println(set); //Now if we run we get Class Cast Exception error,bt we r not getting since it implements comparable interface.
	}
	public static void main(String[] args) {
		TreeSetExample treeSetExample=new TreeSetExample();
		treeSetExample.treeSetExample();
	}

}
