//example for default constructors...
//when we don't provide any constructor, complier will provide one.
//we can't see with naked eye. it will be in class file.
//But class files are not in readable format.
//used to provide default values to the object like null,0.
//must not have explicit return types.

package com.lao.constructors;

public class Student {

	String student_name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student student = new Student();
      System.out.println(student.student_name); 
		
	}

}
