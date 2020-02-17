package converting.tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import converting.tempConverter;

public class tempConverterTests {

    public tempConverterTests() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
	 * Test of convertCelsiusToFahrenheit method.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testConvertCelsiusToFahrenheit0() throws Exception {
        System.out.println("convertCelsiusToFahrenheit");
        double celsius = 0.0;
        double expResult =32.0;
        double result = tempConverter.convertCelsiusToFahrenheit(celsius);
        assertEquals(expResult, result, 0.0);
    }

				/**
	 * Test of convertCelsiusToFahrenheit method.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testConvertCelsiusToFahrenheit200() throws Exception {
        System.out.println("convertCelsiusToFahrenheit");
        double celsius = 200.0;
        double expResult =392.0;
        double result = tempConverter.convertCelsiusToFahrenheit(celsius);
        assertEquals(expResult, result, 0.0);
				}
				
				/**
	 * Test of convertCelsiusToFahrenheit method.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testConvertCelsiusToFahrenheitInt() throws Exception {
        System.out.println("convertCelsiusToFahrenheit");
        int celsius = 5;
        double expResult =41.0;
        double result = tempConverter.convertCelsiusToFahrenheit(celsius);
        assertEquals(expResult, result, 0.0);
				}
				
				/**
	 * Test of convertCelsiusToFahrenheit method.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testConvertCelsiusToFahrenheitNull() throws Exception {
        System.out.println("convertCelsiusToFahrenheit");
        double celsius = (Double) null;
        double expResult =392.0;
        double result = tempConverter.convertCelsiusToFahrenheit(celsius);
        assertEquals(expResult, result, 0.0);
        Exception p = new Exception("Input cannot be null, input a double or int");
        //assertThrows(p);
								
    }
}