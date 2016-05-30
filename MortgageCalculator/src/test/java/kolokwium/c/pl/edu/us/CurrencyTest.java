package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CurrencyTest
{
	private Currency currency;
	Currency currencyMock;
	
	@Before
	public void setup(){
		
		
	}
	
	@Test
	public void convertFromPlnTest() {
		assertEquals(0.4,currency.convertFromPLN(4),0.001);
	}
	
	@Test
	public void convertToPlnTest() {
		assertEquals(50,currency.convertToPLN(4),0.001);
	}
}