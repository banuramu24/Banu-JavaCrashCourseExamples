//*example for project[java crash course],
//package[com.lao.javalearning],class[BankAccount],
//primitive data types[int],
//wrapper classes[Long,String]*/
//methods(functions)[public void getbalance()] 


//class is a combination of data's and functions//

package com.lao.javaLearning;

public class BankAccount {

	Long accountnumber = 1234567890l;
	String holdername = "Banu";
	int accountbalance = 500;
	
	public void getbalance() {
		System.out.println("Balance is " + accountbalance);
		System.out.println("Holder Name is " + holdername);
		System.out.println("Holders acc numb is " + accountnumber);
	}
	
	public static void main(String[] args) {
		// classname objname = new classname();
		
		BankAccount account = new BankAccount();
		account.getbalance();
		
		}

}
