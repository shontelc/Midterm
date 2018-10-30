package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.internal.runners.statements.ExpectException;
import org.junit.jupiter.api.Test;

import pkgShape.Cuboid;

class CuboidTest {

	@Test
	public void cuboid_test_constructor() {
		Cuboid cuboid1 = new Cuboid(2, 3, 5);
		Cuboid cuboid2 = new Cuboid(3, 3, 8);
		assertNotEquals(cuboid1, cuboid2);
	
	
	}
	@Test
	public void cuboid_test_getter() {
		Cuboid cuboid1 = new Cuboid(2, 3, 5);
		cuboid1.getiDepth();
		cuboid1.getiWidth();
		cuboid1.getiLength();
		assertEquals(cuboid1.getiDepth(), 5);
		assertEquals(cuboid1.getiWidth(), 2);
		assertEquals(cuboid1.getiLength(), 3);
		
	}
	@Test
	public void cuboid_test_setters() {
		Cuboid cuboid1 = new Cuboid(1, 3, 5);
		cuboid1.setiDepth(2);
		cuboid1.setiWidth(4);
		cuboid1.setiLength(6);
		assertEquals(cuboid1.getiDepth(), 2);
		assertEquals(cuboid1.getiWidth(), 4);
		assertEquals(cuboid1.getiLength(), 6);
		
	}
	@Test
	public void cuboid_test_area() {
		Cuboid cuboid2 = new Cuboid(3, 3, 8);
		assertEquals(cuboid2.area(), 114);
	}
	@Test
	public void cuboid_test_perimeter() {
		Cuboid cuboid1 = new Cuboid(1, 3, 5);
		
		try {
			cuboid1.perimeter();
			fail("Cannot find perimeter of cuboid!");
		} catch(UnsupportedOperationException e) {
		}
		}
	
		
	

	
	

}
