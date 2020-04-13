//COLLECTION: 
//2)SET
//HASHSET-1)
package com.lao.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	/*
	 * Set(I) -> Hashset(c) and LinkedHashset(c) are implementations
	 * Set(I) -> SortedSet(Child Interface)->NavigableSet(I)->Treeset(c) is the implementation
	 * Important points to remember:
	 * 1.To store group of individual objects.
	 * 2.Duplicates not allowed.
	 * 3.Insertion order will not be maintained.
	 * Null value is allowed.
	 * 4.Set(I) doesnt have any new methods other than given in Collection(I).
	 * 5.DS for Hashset is Hashtable.
	 * 6.If we add duplicate values to Hashset,simply it will return false to the add()
	 * and it wont throw any error or exception.
	 * 7.We can insert null values.
	 * 8.Heterogeneous values can be added.
	 * 9.Implement Serializeable and Cloneable-> yes
	 * 10.Data are stored based on hash code,so search is very effective.
	 * 11.Fill ratio or load factor:0.75 or 75%
	 * 12.Default Capacity-16
	 *   
	 */
	
	/*
	 * Number Constructors available in HashSet=4.
	 * 1.HashSet hs=new HashSet(); //By default size=16 and fill ratio is 0.75
	 * 2.HashSet hs=new HashSet(int initialSize); size as declared and fill ratio is 0.75(default)
	 * 3.HashSet hs=new HashSet(int initialSize,float fillRatio); //size and fill ratio can be declared..
	 * 4.HashSet hs=new HashSet(Collection c); //Creates a HashSet for any given Collection(Acts as..
	 * HashSet has above 3 types of constructors, in above first 3 types we can create an object.
	 * 4th one is to change from one collection type to another.
	 */
	
	//we are creating one HashSet here
	public void basicExamplesHashSet() {
		HashSet <String> hashset=new HashSet<String>();
		hashset.add("A");
		hashset.add("D");
		hashset.add("E");
		hashset.add("F");
		hashset.add("A"); //the return type of add() is boolean.Since A is already there it will return false.
		hashset.add(null);
		hashset.add("G");
		
	//We have no control on Insertion order.
		System.out.println("Contents of HashSet :" +hashset);
	//To remove an Element
		hashset.remove(null);
		System.out.println("Contents of HashSet after removing :" +hashset);
	//To check "A" element is present
		System.out.println(hashset.contains("A")); //Returns in boolean value.
	}
	
	/*
	 * Check all the functions present in [hashset.]
	 */
	
	//VeryVeryImportant:
	/*
	 * addAll() : Adds all the element from one collection to another collection.
	 * containsAll() : Compares the elements of one collection to another collection.
	 */
	
	/*
	 * List ku matum dhan ListIterator nu thaniyaa oru option iruku.
	 * Set ku verum iterator dhan.
	 */
	public void iterateUsingIterator() {
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("A");
		hashset.add("D");
		hashset.add("E");
		hashset.add("F");
		hashset.add("A");
		hashset.add(null);
		hashset.add(null);
		Iterator<String> iterator=hashset.iterator();
		while(iterator.hasNext()) {
			System.out.println("Elements of HashSet :"+iterator.next());
		}	
		
	}
	
	public static void main(String[] args) {
		HashSetExample hashsetexample=new HashSetExample();
		hashsetexample.basicExamplesHashSet();
		hashsetexample.iterateUsingIterator();

	}

}
