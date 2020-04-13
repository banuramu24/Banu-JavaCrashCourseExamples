//UnChecked Exception/Run Time Exception.
package exception_handling;

public class UncheckedExceptionExample {

	static String name; //I'm declaring static variable without giving any value.
	                    //So by default the value will be NULL.
	public static void main(String[] args) {
		/*
		 * Exceptions which are indicated during the run time are known as un-checked exception
		 * or run time exception.
		*/
    System.out.println(name.length());
	}

}
