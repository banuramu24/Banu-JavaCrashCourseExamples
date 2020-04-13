//How to solve Runtime Exception?

package exception_handling;

public class You {
    /*
     * On a fine evening,a guy is giving wierd faces to his upset girlfriend
     * when she is at her balcony to make her laugh.her bro noticed this and came to beat him.
     * How to handle this?
     */
	public void makeYourGirlLaugh() { 
	try 
	{
		throw new MachanInterruptedException("Machan is coming to hit you");
		
	}
	catch (MachanInterruptedException e)
	{
		//e.printStackTrace(); //this will print only the try{} blk exception.
		System.out.println("Your Friend: Machan give this pose da.");
		System.out.println("and you are acting like you are posing for instagram.");
		
	}
	
	}
	public static void main(String[] args) {
		You you=new You();
		you.makeYourGirlLaugh();

	}

}
 
 