import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	StringCalculator sc;
	
	@Before
	public void setUp() {
		 sc= new StringCalculator();
	}
	
	@Test
	public void singleInputShouldReturnItsValue() {
		assertEquals(1,sc.Add("1"));
	}
	
	@Test
	public void emptyStringShouldReturnZero() {
		assertEquals(0,sc.Add(" "));
	}
	
	@Test
	public void twoNumbersInputShouldReturnItsSum() {
		assertEquals(5, sc.Add("2,3"));
	}
	
	@Test
	public void anyNumberofNumbersIsUserForInputShouldReturnTheirSum() {
		assertEquals(1+2+3+4+5+6+7,sc.Add("1,2,3,4,5,6,7"));
	}
	
	@Test
	public void newLineIsUsedBetweenNumbersShouldReturnTheirSum() {
		assertEquals(6, sc.Add("1\n2,3"));
	}
	
	@Test
	public void whenDelimitorChangedUsedItToSeperateInput() {
		assertEquals(3+6+15, sc.Add("//;n3;6;15"));
	}
	
	@Test
	public void whenNegativeNumberIsUsedThenExceptionIsThrown() {
		RuntimeException exception = null;
		try {
			sc.Add("3,-6,15,-18,46,33");
		}catch(RuntimeException e){
			exception = e;
		}
		assertNotNull(exception);
	    assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
	}

	

}
