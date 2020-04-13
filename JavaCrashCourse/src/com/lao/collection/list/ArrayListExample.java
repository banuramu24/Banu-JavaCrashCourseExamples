//COLLECTION: 
//1)LIST
//ARRAYLIST-1)
package com.lao.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	
	/*
	 * ARRAYLIST:
	 * List(I) is the child of Collection(I).
	 * ArrayList(c) is one of the classes provides implementation for the List(I).
	 * In List duplicate values are allowed and insertion order is maintained.
	 * Synchronized :NO.why? bcoz we get concurrent modification exception.
	 * Thread Safe: NO. Multi-Thraed cannot access.bcoz we get concurrent modification exception.
	 * Default Capacity:10
	 * Fill Ratio or Load Factor:1 or 100%
	 * Growth Rate:current_size+current_size/2.
	 * ArrayList : Insertion order will be maintained.
	 * Duplicate elements are allowed.
	 * Null Insertion is possible in arrayList.
	 * ArrayList is Best suited for Search operations due to the random access interface.
	 * Worst for insertion and deletion.bcoz elements has to be displaced.
	 * It implements Serializable interface and cloneabel interface.
	 * Serializeable : Mainly used for transmitting data to network.
	 * Cloanable : It gives a copy. 
	 */
	
	//we are creating one arraylist here
	public void arrayListExample() {
		//I'm creating an arraylist with string datatype 
		//<> is generics which allow only character values to array since i have given string
		//parent class ref[List]=child class object[ArrayList]
		List <String> arrayList=new ArrayList<String>(); //denotes dynamic polymorphism. 
	//1)Now the arraylist is empty. I'm trying to add an element in it.
		arrayList.add("Bently");
		arrayList.add("Benz");
		arrayList.add("BMW");
		arrayList.add("Bugatti");
		arrayList.add("Bugatti");
		
		System.out.println(arrayList);
	//2)To retrieve an element from array
		System.out.println(arrayList.get(0));
	//3)To check any element oda index position.
		System.out.println(arrayList.indexOf("Bugatti")); //Retrieves the 1st index position only.
	//4)Now i want to retrieve the "Bugatti" of lastIndex.
		System.out.println(arrayList.lastIndexOf("Bugatti"));
	//5)If we are searching any un-present element in the array
		System.out.println(arrayList.lastIndexOf("Maruti")); //Retrieves -1 to the o/p 
	//6)Already i have one arraylist, indha list ah apdiye copy pananum means..i use addAll method
		List <String> anotherList=new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println(anotherList); 
	//7)Now,I want to delete the elements present in anotherList.
		anotherList.clear();
		System.out.println(anotherList); 
	//8)I want to delete any particular element only not the full elemenst in the arrayList means
		arrayList.remove(0); //Based on the index position.
		System.out.println(arrayList); 
	//9)I want to delete any particular element only not the full elemenst in the arrayList means
		arrayList.remove("Bugatti"); //Based on the value
		System.out.println(arrayList); 
	//10)Null Insertion is possible in arrayList.
		arrayList.add(null);
		System.out.println(arrayList); 
	//11)Now,0th position la irukura element ku badhilaa vera element insert aaganum means use set().
		arrayList.set(0, "Chevrolet");
		System.out.println(arrayList); 
	//12)isEmpty():checks whether the arrayList is empty or not.
		System.out.println(arrayList.isEmpty()); //o/p will be in boolean.
		
	//VeryVery Important
		//Iterate : We are going to take each element from the arrayList and doing iteration.
	//1)By Using For each:
		for(String string : arrayList) { //String is datatype and string is variable not object
			System.out.println("Using for each :" +string);
		}
		System.out.println("---------------------------------------------");
	//2)By Using For loop:
		for(int i=0;i<arrayList.size();i++) {
			System.out.println("Using for Loop :"+arrayList.get(i));
			}
		System.out.println("---------------------------------------------");
	//VeryVeryVery important
	//1)ListIterator: List kullaye irukura iterator idhu.idhuvum for each,for loop maariye dhan.
		ListIterator <String> list_iterator=arrayList.listIterator(); //Here ListIterator is an interface. thats why we are not creating an object here. 
		while(list_iterator.hasNext())
		{
			System.out.println(list_iterator.next()); //o/p will be in forward order or forward traverse.
		}
		System.out.println("---------------------------------------------");
   //2)ListIterator: To get the reverse traverse order use hasprevious().
		while(list_iterator.hasPrevious()) {
			System.out.println(list_iterator.previous());
		}
		System.out.println("---------------------------------------------");
   //3)Iterator: there is also an another operation which is iterator.it is different from ListIterator.
   //            In this forward traverse is only possible.
		
        Iterator <String> iterator=arrayList.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
    //Concurrent Modification Exception : When iteration happen, that time if i try to insert/delete an element in arrayList
        for(String string : arrayList) {
			System.out.println("Using for each :" +string);
			arrayList.add("TATA");
		}
    //enaku copy panum bodhey write aaganum means we have CopyOnWriteArrayList. but no need to discuss abt this further.
       
        
	}
		
		
	
	public static void main(String[] args) {
		
		ArrayListExample example=new ArrayListExample();
		example.arrayListExample();
		

	}

}
