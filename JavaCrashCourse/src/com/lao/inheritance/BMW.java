//CHILD CLASS - BMW //Create main function and declare object.
/*
 * inherited datas and methods of the parent class.
 */
//Access Modifiers:
/*
 * default : where no access modifier is specified.
 * public : accessed anywhere in the program.
 * private : only within the class in which they are declared.
 * protected : accessible anywhere within the same package or accessed sub classes(child class)
 *             in different package.
 */
package com.lao.inheritance;

public class BMW extends Car{

	public static void main(String[] args) {
    BMW bmw = new BMW();
    bmw.engine();

	}

}
