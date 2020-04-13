//Eg for Switch Case...
//used mainly when we have more than 4-5 conditions.
//Namma Oru Super Hero pera sonnaa..avan super hero vaa irundhaa
//yes super hero nu solla podhu.
//no vaa irudnha , no super hero illa solla podhu.
//break statement purpose: if any one of the given case condition is satisfied 
//the complier will print all the below println statements.
//to avoid this we use break;
//purpose of default :
//neraya condition namma sollitey varom idhula endha condition mey.
//satisfy aagalana enna pananum.. apdinu sollra section dhan default.

package com.lao.conditionnel_statements;

public class SuperHeroOrNot {
	//we are telling the prg that hero name is captain america
	String hero = "Captain America";
	public void heroOrNot() {
		switch(hero)
		{
		//below [case] condition telling by us//
		case "Iron Man" :
			System.out.println("Iron Man is a Super Hero");
			break;
		case "Captain America" :
			System.out.println("Captain America is a Super Hero");
			break;
		case "Bat Man" :
			System.out.println("Bat Man is a Super Hero");
			break;
	    default:
	    	System.out.println(hero+" Sorry I dont know about this person!!");
		} 
	}
	public static void main(String[] args) {
		SuperHeroOrNot heroOrNot = new SuperHeroOrNot();
		heroOrNot.heroOrNot(); 

	}

}
