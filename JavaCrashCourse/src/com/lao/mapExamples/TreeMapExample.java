//COLLECTION: 
//3)MAP
//TREEMAP-3)

package com.lao.mapExamples;

import java.util.TreeMap;

/*
 * TREEMAP(C) is a implementation class for MAP(I) interface.
 * Duplicate keys are not allowed. but duplicate values are allowed.
 * NULL Key is not allowed.
 * The elements will be retrieved on natural sorting order based on the given key.
 * 
 */
public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String,String> placesintrichy=new TreeMap<String,String>();
		//Below is the example for allowing duplicate values.
		placesintrichy.put("Thiruverumbur", "Trichy");
		placesintrichy.put("Srirangam", "Trichy");
		placesintrichy.put("Palakkarai", "Trichy");
		placesintrichy.put("Kallukuzhi", "Trichy");
		
		//1)Eg for duplicate keys not allowed.what happens?
		//Nothing will happen. It will overwrite the value for Trichy.
		//doesnt throw any exception.
		placesintrichy.put("Trichy", "TVS TollGate");
		placesintrichy.put("Trichy", "Melaputhur");
		
		//2)Eg for . if we have null key
		//We get nullpoiter exception bcoz treemap cannot support null insertion.
		//Wherever we add.. we get null poiter exception. even if it is first entry also, or only one entry with null also.
		placesintrichy.put(null, "TVS TollGate"); 
		//placesintrichy.put(null, "XYZ");
		
		System.out.println(placesintrichy); //Elements are retrieved on natural sorting order based on the KEY.

	}

}
