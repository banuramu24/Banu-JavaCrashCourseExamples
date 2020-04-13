//COLLECTION:
//1)LIST
//LINKEDLIST-2)
package com.lao.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExamples {

	/*
	 * LinkedList is implemented using Doubly linked list.
	 * Insertion is maintained. Duplicates are allowed.
	 * This is best suited for insertion and deletion.
	 * Unlike ArrayList,This is not the best for retrieving data.
	 * All the collections implements serializable and cloneable interfaces.
	 * LinkedList also implements those interfaces but not RandomAccess Interface.
	*/
	public void linkedListOperationsExamples() {
		//Create a simple LinkedList
		LinkedList <Integer> linkedlist=new LinkedList<Integer>();
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(4);
		System.out.println("LinkedList : "+linkedlist);
		
	//1)Add an element to the first position.Suppose I want to add an element to the head position.
		linkedlist.addFirst(1);
		System.out.println("LinkedList after adding First : "+linkedlist);
	//2)Add an element to the last position.Suppose I want to add an element to the tail position.
		linkedlist.addLast(5);
		System.out.println("LinkedList after adding Last : "+linkedlist);
	//3)Get the first value:
		System.out.println("First Value : "+linkedlist.getFirst());
	//4)Get the first value using index position:
		System.out.println("First Value using index : "+linkedlist.get(0));
	//5)Get the third value of the list.
		System.out.println("3rd Value : "+linkedlist.get(3));
	//6)To remove an element at first:RemoveFirst
		System.out.println("Remove First : "+linkedlist.removeFirst());
		System.out.println(linkedlist);
	//7)To remove an element at last:RemoveLast	
		System.out.println("Remove Last : "+linkedlist.removeLast());
		System.out.println(linkedlist);
	//8)Poll method and PollFirst() deletes the first element in the list.
		System.out.println("remove using poll : "+linkedlist.poll());
		System.out.println(linkedlist); 
	//9)PollLast() deletes the last element in the list.
		System.out.println("remove using poll last: "+linkedlist.pollLast());
		System.out.println(linkedlist); 
	//10)remove deletes the first element
		System.out.println("Remove operation deletes the 1st element :" +linkedlist.remove());
		System.out.println(linkedlist); 
	//11)Adding
		linkedlist.addFirst(1);
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(6);
		linkedlist.add(2);
		linkedlist.add(4);
		linkedlist.add(5);
		linkedlist.add(6);
		System.out.println("After newly adding : "+ linkedlist);
	//12)I want to remove the first occurrence of value 2.
		linkedlist.removeFirstOccurrence(2); //it is a value and not the index.
		System.out.println("After removing the first occurrence of 2" + linkedlist);
	//13)I want to remove the last occurrence of value 6.
		linkedlist.removeLastOccurrence(6); //it is a value and not the index.
		System.out.println("After removing the Last occurrence of 6" + linkedlist);
		System.out.println("---------------------------------------------");
	}
	
	/*
	 * Iteration of Linked List with Simple For Loop
	 */
	    
	    public void IterateLinkedListWithSimpleFor() 
	   {
			LinkedList <String> linkedlist1=new LinkedList<String>();
			linkedlist1.add("a");
			linkedlist1.add("b");
			linkedlist1.add("c");
			linkedlist1.add("d");
			System.out.println("Simple for loop");
			for (int i=0;i<linkedlist1.size();i++) {
				System.out.println("Using for Loop :"+linkedlist1.get(i));
			}
			System.out.println("---------------------------------------------");
		}
		
	  /*
	   * Iteration of Linked List with Advanced For Loop
	   */
	    
	    public void IterateLinkedListWithAdvancedFor() 
		   {
				LinkedList <String> linkedlist2=new LinkedList<String>();
				linkedlist2.add("a");
				linkedlist2.add("b");
				linkedlist2.add("c");
				linkedlist2.add("d");
				System.out.println("Simple for each loop");
				for(String string : linkedlist2) {
					System.out.println("Using for each :" +string);
				}
				System.out.println("---------------------------------------------");
			}
	  
	    /*
	     * Iterate using While Loop
	    */
	
	    public void IterateUsingWhile() 
		   {
				LinkedList <String> linkedlist3=new LinkedList<String>();
				linkedlist3.add("a");
				linkedlist3.add("b");
				linkedlist3.add("c");
				linkedlist3.add("d");
				System.out.println("Iterate using While loop");
				int number=0;
				while(linkedlist3.size()>number){
					System.out.println("Using While Loop :" +linkedlist3.get(number));
					number++;
				}
				System.out.println("---------------------------------------------");
		   }
	    
	    /*
	     * Iterate using Iterator
	     */
	    
	    public void IterateUsingIterator() 
		   {
				LinkedList <String> linkedlist4=new LinkedList<String>();
				linkedlist4.add("a");
				linkedlist4.add("b");
				linkedlist4.add("c");
				linkedlist4.add("d");
				System.out.println("Iterate using Iterator");
				Iterator <String> iterator=linkedlist4.iterator();
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				System.out.println("---------------------------------------------");
		   }
	    
	public static void main(String[] args) {
		LinkedListExamples linkedListExamples=new LinkedListExamples();
		linkedListExamples.linkedListOperationsExamples();
		linkedListExamples.IterateLinkedListWithSimpleFor();
		linkedListExamples.IterateLinkedListWithAdvancedFor();
		linkedListExamples.IterateUsingWhile();
		linkedListExamples.IterateUsingIterator();
		
	} 

} 
