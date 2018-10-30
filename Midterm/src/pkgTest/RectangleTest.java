package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Rectangle;

class RectangleTest {

	@Test
	public void rect_test_constructor() {
		Rectangle rec1 = new Rectangle(2, 7);
		Rectangle rec2 = new Rectangle (2, 9);
		assertNotEquals(rec1, rec2);
		
	}
	@Test
	public void rect_test_setter() {
		Rectangle rec1 = new Rectangle(6, 9);
		rec1.setiWidth(2);
		
		assertEquals(rec1.getiWidth(), 2);
			
	}
	@Test
	public void rect_test_getter() {
		Rectangle rec1 = new Rectangle(6, 9);
		rec1.getiWidth();
		
		assertEquals(rec1.getiWidth(), 6);
	}
	@Test
	public void rect_test_area() {
		Rectangle rec1 = new Rectangle(3, 8);
		assertEquals(rec1.area(), 24);
		
	}
	@Test
	public void rect_test_perimeter() {
		Rectangle rec1 = new Rectangle(2, 3);
		assertEquals(rec1.perimeter(), 10);
		
	}
	
	@Test
	public void rect_test_compareTo() {
		Rectangle rec1 = new Rectangle(3, 4);
		Rectangle rec2 = new Rectangle (7, 10);
		rec1.compare(rec1, rec2);
		assertTrue(rec1.area() < rec2.area());
		
		
		
		
		
		
		
	}

}
