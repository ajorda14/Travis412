package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(3, 5), 2);
	}
	
	@Test
	public void testMultiply()
	{
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(3, 5), 15);
	}
	
	@Test 
	public void testDivide()
	{
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(5, 25), (Integer) 5);
	}
	
	@Test 
	public void testDivide2()
	{
		SimpleCalculator calc = new SimpleCalculator();		
		Assert.assertNull(calc.divide(0, 10));
	}
}
