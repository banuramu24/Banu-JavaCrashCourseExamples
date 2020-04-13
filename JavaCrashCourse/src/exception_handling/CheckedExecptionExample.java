//Exceptions Examples.
//Checked Exception/Compile Time Exception/IO Exception.


package exception_handling;

public class CheckedExecptionExample {
 
	String name="Duckling"; //It is not a static variable.Its a normal variable.
	public static void main(String[] args) {
	/*
	 * Exceptions which are indicated during the compile time are known as checked exception
	 * or compile time exception.
	*/
    System.out.println(name); //Cannot make a static reference to the non-static field name.
    
	}

}
