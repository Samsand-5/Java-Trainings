package exceptionHandling;

import java.sql.SQLException;

public class Child extends Parent{
	void demo(){
		System.out.println("Child");
	}
	public static void main(String[] args) {
		
	}
}
/*
 * If the super class method is throwing an exception
 * then the subclass overridden method must also throw the
 * same exception or the child type of that exception and not parent type.
*/
