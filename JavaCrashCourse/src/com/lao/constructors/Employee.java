//example for No arguments constructors...
//it is not similar to default constructor
//it will allow us to write the logic when the object is created.
//when we are creating an object Employee() {}, we are performing several 
//operations inside the constructor block.
//there s no need to call the Employee() object by using the objects. 
//it will automatically call the constructor.

package com.lao.constructors;

public class Employee {
	int employeeid;
	String employeeName; 
		//Define a No Arg constructor//
	//here below Employee() {} is an object.
	Employee(){
		employeeid=1;
		employeeName="Agni";
		System.out.println("Employee object is created");
		}

	public static void main(String[] args) {
		Employee employee =new Employee();
     	}

}
