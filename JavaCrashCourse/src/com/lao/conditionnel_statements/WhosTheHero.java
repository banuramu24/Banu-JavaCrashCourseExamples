//Eg for IF-ELSE-IF ladder.
//used only for checking 2 to 3 conditions.
//Namma Oru Super Hero pera manasula nanchitrukom.
//Prg vandhu 3 attempts la kandu pidika podhu.
//suppose 3 attempts la kandupidika mudilana
//4th attempt la enaku therila solla podhu.
//equalsIgnoreCase - ignores the case sensitive.

package com.lao.conditionnel_statements;

public class WhosTheHero {
	//My ThoughofSuperHero is Captain America
	String myHeroName = "Captain America";
	//Function Implementation to let the program find for the hero name.
	public void superHeroGuess() {
	//below condition myHeroName.equals is assumed by prg
	if(myHeroName.equals("Iron Man")) 
	{
		System.out.println("You thought about Iron Man");
	}
	else if(myHeroName.equals("Super Man")) 
	{
		System.out.println("You thought about Super Man");
	}
	else if(myHeroName.equalsIgnoreCase("Thor")) 
	{
		System.out.println("You thought about Thor");
	}
	else 
		System.out.println("Sorry I cannot Guess!!");
	}
	public static void main(String[] args) {
		WhosTheHero hero = new WhosTheHero();
		hero.superHeroGuess();

	}

} 
