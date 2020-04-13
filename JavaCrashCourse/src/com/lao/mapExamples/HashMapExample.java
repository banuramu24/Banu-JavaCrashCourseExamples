//COLLECTION: 
//3)MAP
//HASHMAP-1)
package com.lao.mapExamples;

/*
 * HASHMAP(C) is a implementation class for MAP(I) interface.
 * Duplicate keys are not allowed. but duplicate values are allowed.
 * Uses a technique called Hashing to store elements.
 * Only 1 NULL key is allowed.
 * Insertion order is not preserved as it uses Hashing.
 * So we cant predict the retrival order of the elements inserted.
 * A VALUE of the MAP can only be fetched using its KEY.
 * Synchronised: NO .
 * So if it has to be used in multithreading environment,it has to be synchronised explicitly.
 * Initial Capacity: 16 and Load Factor:0.75
 *  
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		//We are creating a Hashmap here.It is generally followed by key and value.
		//Below <Integer is key> <String is value>
	HashMap <Integer,String> employeemap=new HashMap<Integer,String>();
	//1)To insert an element in a Map we use PUT method.
		employeemap.put(1,"Agni");   //It is an ENTRY(KEY and VALUE) 
		employeemap.put(2,"Riya");   //2nd ENTRY
		employeemap.put(3,"Arya");
		employeemap.put(4,"Munima");
		employeemap.put(5,"Duck");
        System.out.println("Employee Map :"+employeemap);
    //2)To make a copy of the existing Map we use PUTALL method.
        Map<Integer,String> duplicatemap=new HashMap<Integer,String>();
        duplicatemap.putAll(employeemap);
        System.out.println("Duplicate Map :"+duplicatemap);
    //3)Clear to delete the map contents.
        duplicatemap.clear();
        System.out.println("After Clearing Duplicate Map :"+duplicatemap);
    //4)To check if a particular key is present or not in the map
        System.out.println("Does this employeemap has key 1? "+employeemap.containsKey(1));
    //5)To check if a particular value is present or not
        System.out.println("Does this employeemap has value Arya?" +employeemap.containsValue("Arya")); 
    //6)I dont want to use putAll() but i need a copy then i use clone() method.
        System.out.println("Cloned Map "+employeemap.clone());
    //7)Check if the map is empty or not
        System.out.println("Is Empty-duplicatemap "+duplicatemap.isEmpty());
    //8)Fetch the set of keys in the map 
    //  (NOTE: Here its not of List of Keys,Its set of keys. //Bcoz List will allow duplicate but set won't.
    //  Keys should be unique.
        System.out.println("employeemap Key Set " + employeemap.keySet()); //To retrieve only[all the keys]
    //9)Fetch a Value
        System.out.println(employeemap.get(1)); //To retrieve value of key 1.
    //10)Fetch all the values
        System.out.println("employeemap all values " +employeemap.values()); //To retrieve only[all the values]
    //11)Entry Set
        System.out.println(employeemap.entrySet()); //To retrieve the whole keyset. [values as well keys]
        
	}

}
 