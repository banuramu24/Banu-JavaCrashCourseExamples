//Example for Single Try and Catch
//Exception is the parent of all other exceptions
//If there are no exceptions in the try block then the catch block wont get executed.

package exception_handling;

public class SingleTryCatchExample {

	public static void main(String[] args) {
		
		try {
			int number1=0;
			int number2=3;
			int result=number2/number1;
			System.out.println(result);
			}
		catch(Exception e) {
			e.printStackTrace(); //gives arithmetic exception
			System.out.println("Drink a lemon juice and dont divide a number by 0");
			
		}
	}

}
 