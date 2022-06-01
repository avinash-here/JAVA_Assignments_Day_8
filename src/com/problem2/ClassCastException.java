package com.problem2;

public class ClassCastException {
	
	/*
	 * What is Class Cast Exception?
	 * 
	 * When an object is created, it can be assigned three different values:
	 * 1. same class object,
	 * 2. child class object and
	 * 3. null
	 * 
	 * According to our need we assign these three different values.
	 * 
	 * So, when we assign a child class object to an object variable, it is called 
	 * "Parent Class Reference - Child Class Object"
	 * like this,  Parent p1 = new Child();
	 * 
	 * with the help of this, we call all the methods of the parent class and all the overridden 
	 * methods inside the child class.
	 * 
	 * if we need to call the specific methods of the child class, we need to downcast that object
	 * like this,  Child c1 = (Child)p1;
	 * 
	 * Downcasting like this, is only possible when a parent class variable is assigned a child 
	 * class object. Otherwise, it will throw an exception and that exception is called 
	 *   "Class Cast Exception".
	 *     
	 *     
	 *     Below is an example
	 *     We have created an animal class and a cheetah class.
	 *     Cheetah is extending/inheriting the animal class.
	 *     i.e. => Class Cheetah is the child of the animal class.
	 *     
	 *     In main, we created an object of animal and assigned it an object of its child (cheetah)
	 *     class.
	 *     with this, we can call all the methods of the parent class and all the overridden 
	 * 		methods inside the child class.
	 * 	   But, we can't call child specific methods.
	 * 
	 * 		for that, we need to downcast the a1 class. 
	 *      and then, we can call child specific methods.
	 *      But, at line 55 and ahead, we can't do so. 
	 */
	
	public static void main(String[] args) {
		
		Animal a1 = new Cheetah();
		a1.sleep();
		a1.walk();
		
		Cheetah c1 =  (Cheetah)a1;
		c1.eat();
		
		Animal a2 = new Animal();
		
		// we can't downcast here like this, because here it's not 
		// Parent Class Reference - Child Class Object
		// It will give an exception called "Class Cast Exception"
		
		Cheetah c2 =  (Cheetah)a2;
	}

}




class Cheetah extends Animal{
	
	@Override
	public void walk() {
		System.out.println("Cheetah is running");
	}
	
	public void eat() {
		System.out.println("Cheetah is eating");
	}
}
