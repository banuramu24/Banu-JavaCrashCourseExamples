//Example for heterogenous objects.
//What is heterogeneous object? We can add String, Int etc.
//Which means without adding generics.
//But this type of using List is not advisable. it is a Raw type.To show [can insert heterogeneous objects]
//We have coded the below example.

package com.lao.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithoutGenerics {

	public static void main(String[] args) {
		List a1=new ArrayList(); //Here no generic is used.thats why we can insert both number and character.
        a1.add(1);
        a1.add("string");
        System.out.println(a1);
	}

}
