package singleton;

import static org.junit.Assert.*;
import org.junit.Test;

public class singletonTests {

	public singletonTests() {
	}

	@Test
	public void testCounter() {
		singleton.incrementCount();
		singleton.incrementCount();
		assertEquals(2, singleton.getCount());
		singleton.incrementCount();
		singleton.incrementCount();
		singleton.incrementCount();
		assertEquals(5, singleton.getCount());
	}
}