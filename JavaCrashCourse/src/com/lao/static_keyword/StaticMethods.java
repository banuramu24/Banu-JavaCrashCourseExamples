//Static Keyword Concepts:
//If we declare any method,variable,block{} as static then it is shared among the class.
//Static keyword can be used to a class,to a variable,to a method and to a block{}.

/*
 * We see example for a 1)STATIC METHOD now.......
 * Create a method static and call it without without object.
 * We can call Non-static method to a Static method but not otherwise.
 */


package com.lao.static_keyword;

public class StaticMethods {

    //1) Create a Static Method//	
	public static void method1()
	{
		System.out.println("I'm a Static Method");
	}
	
	//3) We can call static method from Non-Static method but not viceversa is possible
	public void method2()
	{
		method1();
		System.out.println("I'm a Non-Static Method");
		
	}
	
	public static void main(String[] args) {
	//2) Call the Static Method without creating object//	
	 StaticMethods meth=new StaticMethods();
	 //Static Method without creating object
	 method1(); 
	//Non-Static Method with creating object.
     meth.method2();
	}

} 
