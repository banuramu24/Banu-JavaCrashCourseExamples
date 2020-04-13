/*
 * We see example for a 1)STATIC BLOCKS now.......
 * It is nothing but a Block of code{} which additionally has the keyword called static.
 * We can have any number of static blocks for 1 single class.
 * Static Blocks will get executed when the class is compiled & loaded in the memory.
 * Highest level priority will go to the static blocks and not even to the main method.
 * why we go to static blocks? Static Blks are mainly used for Initializing the Static Variables.
 */


package com.lao.static_keyword;

public class StaticBlock {

	static {
		System.out.println("Inside Static blk 1");
	}
	static {
		System.out.println("Inside Static blk 2");
	}
	public static void main(String[] args) {
		System.out.println("Inside main method");

	}

}
