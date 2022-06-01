package com.problem3;

public class DynamicPolymorphism {
	
	
	/*
	 * Explain Dynamic Polymorphism.
	 * Polymorphism basically means different forms of the same thing.
	 * When a method is used in different styles in Java, it is called Polymorphism.
	 * 
	 *  There are two types of Polymorphism:
	 *  Static Polymorphism and Dynamic Polymorphism
	 *  
	 *  Let's talk about Dynamic Polymorphism:
	 *  In Java, when a class extends an other class, Dynamic Polymorphism can take place.
	 *  In such case, there is a parent and a child class.
	 *  let's say there is a method "funX" in the parent class
	 *  And, the child class wants to change this method according to its need.
	 *  
	 *  In that case, child class needs to override this method inside it.
	 *  
	 *  And, after that if we create a child class object with parent class reference.
	 *  
	 *   like this, Parent p1 = new Child();
	 *   Then, if we call the method that is overridden in child class, with this parent class
	 *   variable p1, then the method that is in child class will be called, not that one which is 
	 *   in the parent class.
	 *   
	 *    This concept is called Dynamic Polymorphism.
	 * 
	 * 
	 */

}
