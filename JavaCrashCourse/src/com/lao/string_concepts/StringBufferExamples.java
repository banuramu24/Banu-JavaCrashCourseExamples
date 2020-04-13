package com.lao.string_concepts;

public class StringBufferExamples {

	public static void main(String[] args) {
		
		//To show stringbuffer is mutable
	System.out.println("STRING is IMMUTABLE");
	String name = "ARYA";
	System.out.println("Appending a name to Original:"+name.concat("PRASATH"));
	System.out.println("Original Name:" +name);
	System.out.println("****************");
	System.out.println("STRINGBUFFER is MUTABLE");
	StringBuffer name1 = new StringBuffer("ARYA");
	System.out.println("Appending a name to Original:"+name1.append("PRASATH"));
	System.out.println("Original Name:" +name1);
	System.out.println("****************");
	//String Buffer Methods
	//1)Reverse :Can we reverse a string? NOOOO since it is immutable.
	//           Can we reverse a stringbuffer? YESSSSS since it is mutable.
	System.out.println("Reversed Name: "+name1.reverse());
	//2)Replace :
	StringBuffer replacethis=new StringBuffer("Arul");
	System.out.println(replacethis.replace(0, 3, "Riya")); //wont take the end index
	//3)Delete :
	StringBuffer delete=new StringBuffer("xyzRiya");
	System.out.println(delete.delete(0, 3));
	//4)Insert :
	StringBuffer insert=new StringBuffer("Moni");
	System.out.println(insert.insert(4,"sha"));
	//5)Capacity :
	System.out.println(insert.capacity()); //o/p will give the space of stringbuffer object.
	
		}

}
 
//Like String we have charAt,substring,length methods as well.
//Check StringBuilder eg's in notebook.