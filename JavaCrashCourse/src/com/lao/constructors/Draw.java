//example for constructor overloading.
//exhibits different behaviour in different situation based on the parameter passed
//is called constructor overloading.


package com.lao.constructors;

public class Draw {
    
	String Draw;
		Draw(){
		System.out.println("Draw object is created");
	}
		Draw(String toDraw){
			Draw=toDraw;
			System.out.println("Drawing "+toDraw); 
		}
	public static void main(String[] args) { 
		Draw draw = new Draw(); 
		Draw draw1 = new Draw("circle");  

	}

}
