//Eg for If & Else:
//boolean data type gives only either true/false.
//it is mainly used for if,else condition..
//By default its value will be False.
//Mainly used for selenium purpose.

package com.lao.conditionnel_statements;

public class LetsHaveACoffe {
	//boolean IsCupEmpty=true;
    boolean IsCupEmpty;
	public static void main(String[] args) {
		LetsHaveACoffe coffe = new LetsHaveACoffe();
		//if(Coffe.IsCupEmpty==true) is similar to below if(Coffe.IsCupEmpty)
        if(coffe.IsCupEmpty) { 
        	System.out.println("Fill the cup");
        }
        else {
            System.out.println("Drink the Coffe");
        }
	}

} 
