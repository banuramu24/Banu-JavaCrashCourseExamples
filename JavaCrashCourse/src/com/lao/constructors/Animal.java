//example for Parameterised constructors.
//usually used in IT industry.
//Mainly to assign different different values for the initialised [animal_name , animal_type] datas of the class Animal
//and to avoid rewrite..
//how will i create different different values? i will create diffe objects eact tym.
//we are creating the paramesterised constructors.

package com.lao.constructors;

public class Animal {
    String animal_name;
    String animal_type;
    //Define a parameterised constructor
    //here below declared Animal() {} is an object
    Animal(String name,String type){
    	animal_name=name;
    	animal_type=type;
    }
    
    public void SayAbtAnimal() {
    System.out.println("Animal name is " + animal_name + " and type is " + animal_type);
    	
    }
	public static void main(String[] args) {
	Animal animal1=new Animal("Duck","Omnivores");
	animal1.SayAbtAnimal();
	
	Animal animal2=new Animal("Karadi","Omnivores");
	animal2.SayAbtAnimal();
     
	}

}
