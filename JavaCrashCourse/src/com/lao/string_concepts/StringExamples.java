//Example for JAVA STRING or STRING.
//It is a majority used data type.
//An object that represents sequence of char values.
//In Java,string is an immutable object which means it is constant 
//and cannot be changed once it is created. 
//How to create a STRING?
//1)By using string literal 2)By using new keyword.
//string literal: String string1 = "AGNI". can achieve memory efficiency.
//new keyword: String s=new String("AGNI"). cannot achieve memory efficiency.
package com.lao.string_concepts;

public class StringExamples {

	public static void main(String[] args) {
		/*
		 * Eg for string is immutable object how??
		 */
       //One important thing to be noted is we declared below string variable 
	   //inside the main function.and not inside class.
        String name="AGNI";
        name="Riya";
        System.out.println(name);
        
    //STRING METHODS
        /*
         * Here we will see list of string methods and string concepts.
         */
    //1)Returns Character value for the particular index.
        String name1="Agniprasath"; //String Literal
        int number=3;
        System.out.println(name1.charAt(1));
    //2)Returns string length.
        System.out.println(name1.length());
    //3)Checks the equality of string with the given object.
        System.out.println(name1.equals("Arul")); //Performs the boolean operation
    //4)Checks the equality of string with the string object without case sensitivity.
        System.out.println(name1.equalsIgnoreCase("AGNIPRASATH"));
    //5)Checks the string is empty or not.
        System.out.println(name1.isEmpty());
    //6)Returns true or false based on the given value is present or not.
        System.out.println(name1.contains("A"));
    //7)Take a particular portion of the string.
        System.out.println(name1.substring(1)); //o/p will be from 1 to end.
    //8)Take a particular portion of the string begin and end index.
        System.out.println(name1.substring(1,3)); //o/p will be from 1 and end index include aagaadhu.
    //9)Appends the string to the given string
        System.out.println(name1.concat("Arulprasath"));
    //10)Replace the existing char with given data
        System.out.println(name1.replace("g","G"));
        System.out.println(name1.replace("Agni","Riya"));
    //11)Find the position of the character in the string
        System.out.println(name1.indexOf("A"));
    //12)Find the character specified from the index position
        System.out.println(name1.indexOf("a",7)); //o/p is "a" character 7th position kapram ethana idathula varudhu.
    //13)Find the character specified from the index position
        System.out.println(name1.indexOf("i", 2));
        System.out.println(name1.indexOf("sath", 1));
    //14)Trim will remove the white spaces before and after
        String name2="  Agniprasath  ";
        System.out.println(name2.trim());
    //15)Convert the given data type to string
        System.out.println(String.valueOf(number)); //o/p will be "3" will be converted to string.
    //16)Uppercase to lowercase
        String UpperCase="RIYA";
        System.out.println(UpperCase.toLowerCase());
    //17)Lowercase to uppercase
        String LowerCase="riya";
        System.out.println(LowerCase.toUpperCase());   
    //18)Returns the joined string with given delimiter
        System.out.println(String.join("-", "Learn","Automation","Online"));
        System.out.println(String.join("/", "30","05","1990"));
    //19)Split
        String SplitThis="Am,I,teaching,good?";
        String[] SplittedWords=SplitThis.split(",");
        for(String string: SplittedWords)
        {
        	System.out.println(string);
        }
        
     }
	
	}
