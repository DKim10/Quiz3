package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;
import MainPackage.Triangle;;


public class TriangleTest {

	Triangle input = new Triangle();
	
	@Test
	public void testGetArea() {
		
		input.setside1(3);
		input.setside2(4);
		input.setside3(5);
		
		assertTrue("This is wrong", 6.0 == input.getArea() );
		
		input.setside1(6);
		input.setside2(8);
		input.setside3(10);
		
		assertTrue("This is wrong", 24.0 == input.getArea() );
		
		
	}

	@Test
	public void testGetPerimeter() {
		input.setside1(3);
		input.setside2(4);
		input.setside3(5);
		
		assertTrue("This is wrong", 12.0 == input.getPerimeter() );
		
		input.setside1(6);
		input.setside2(8);
		input.setside3(10);
		
		assertTrue("This is wrong", 24.0 == input.getPerimeter() );
	}

}
