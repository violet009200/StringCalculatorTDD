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

}
