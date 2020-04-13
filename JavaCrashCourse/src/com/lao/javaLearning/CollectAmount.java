//example for return types
package com.lao.javaLearning;

public class CollectAmount {
    Integer collectedAmount = 1000;
 
    //public void collectAmtAndGiveItToMe() { [to]
      public Integer collectAmtAndGiveItToMe() {
    	System.out.println("Daddy have collected " +collectedAmount+ "and sent it to you");
    	return collectedAmount; 
   }
    
public static void main(String[] args) {
	//Return Types
	CollectAmount myson = new CollectAmount();
	Integer amount = myson.collectAmtAndGiveItToMe(); 
	System.out.println("Got the amt son "+ amount);
	
}
}

// i got o/p as Daddy have collected 1000

// I want to get the return type.

//void will not return anything.. so change the return type void to Integer since 
//our data type s integer. eg:(public Integer collectAmtAndGiveItToMe()