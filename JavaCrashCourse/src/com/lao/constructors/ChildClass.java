//even though there was no object created for ParentClass.. since 
//we used the keyword extends.. it will automatically acquires the
//properties of the ParentClass.
package com.lao.constructors;

public class ChildClass extends ParentClass{ 

	public ChildClass() { 
		//super(); keyword present here*
		System.out.println("Child Class Constructor");
	}
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass(); 

	}

}
