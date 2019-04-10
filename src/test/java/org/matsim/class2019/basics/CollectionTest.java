package org.matsim.class2019.basics;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CollectionTest {
	@Test
	public void listExample() {
		
		// create a list containing rectangles
		List<Rectangle> myList = new ArrayList<>();
		myList.add(new Rectangle(10,20));
		myList.add(new Rectangle(10,200));
		myList.add(new Rectangle(10,2));
		myList.add(new Rectangle(100,20));
		myList.add(new Rectangle(1,20));
		
		// same as:
		// for(int i = 0; i<myList.size(); i++) {
			//Rectangle rect = myList.get(i);
		
		for(Rectangle rect : myList) {
			System.out.println("The area is: "+rect.calculateArea());
		}
	}
}
