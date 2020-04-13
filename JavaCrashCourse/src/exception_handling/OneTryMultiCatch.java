//Example for OneTryMultiCatch
//Why we give multiCatch?
//indha program ku indha exception dhan varum nu oru developper ku theriyadhu.
//aana enna enna lam exception varum nu developper ku therium.
//eg: neraya objects vechi deal panrapo null ptr exception
//eg: Arithmetic operations lam deal panrapo arith exception
//andha maari neraya exception varapo, indha exception vandha indha 
//implementation pannu nu multiple ah seggregate panni yeludha
//catch blks use aagum.
//when i give only a single catch blk, for eg catch(exception e) {}
//so,yellaa exception kummey orey catch blk dhan execute aagum.
//So nammaku enna exception ney theriyadhu. thats why we r customisely writing.
//parent exception kadasiya dhan throw pananum.
package exception_handling;

public class OneTryMultiCatch {
	
	public static void main(String[] args) {
		String name="Banu";
		int number1=2;
		int number2=3;
		try {
			int name1=name.length(); //trying to receive the value for null.
			System.out.println(name1);
			float result=number2/number1;
			System.out.println(result);
			}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println("This is due to Arithmetic Exception");
		}
		catch(NullPointerException e)
		{
			//e.printStackTrace();
			System.out.println("This is due to NullPoiter Exception");
		}
        catch(Exception e)
		{
        	System.out.println("This is Parent Exception");
		}

	}

}
