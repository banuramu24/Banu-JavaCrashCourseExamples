//Example for DoWhile Loop..
//We give initialise,condition,increment/decrement in the seperate lines.
//We must give condition otherwise the Loop is waste.
//DoWhile Loop is also called Exit-Controlled Loop.
//DoWhile Loop will allow to do implementation once and then checks the condition.


package com.lao.looping;

public class ImpositionUsingDoWhile {
 
	/*
     *You: I'm not Sure! May be this programming is not for me.
     *Your Trainer: What are you saying! You are doing great.
     *You: Nahh! I dont think so.
     *Your Trainer: you dont belive! ok. Write an Imposition.
     *"I can Program! I can learn" - 25 times.
     *You: :-(
     */
	
	public static void main(String[] args) {
		int times=1;
		do {
			System.out.println("I can Program! I can learn");
			times++;
		} while(times<=25);
		
	}

}
