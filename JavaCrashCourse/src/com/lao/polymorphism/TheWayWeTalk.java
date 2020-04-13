//Polymorphism:
/*
 * 1)static/compile/early binding/overloading
 * 2)dynamic/run time/late binding/overriding
 * method name should be same for overloading
 */
package com.lao.polymorphism;

public class TheWayWeTalk {

	// This class is to illustrate (method overloading) with a practical eg
	
	public void talk(Parents SpeakingStyle)
	{
		System.out.println("Polite and Respectful?!!");
	}
	public void talk(Partner SpeakingStyle)
	{
		System.out.println("Love,Romantic and a mixture of everything!!");
	}
	public void talk(Boss SpeakingStyle)
	{
		System.out.println("Nothing Personal!Pure Business!!");
	}
	public static void main(String[] args) {
		TheWayWeTalk talk = new TheWayWeTalk();
		Parents parents=new Parents();
		talk.talk(parents);
		Partner partner=new Partner();
		talk.talk(partner);
		Boss boss=new Boss();
		talk.talk(boss);
	}

}
