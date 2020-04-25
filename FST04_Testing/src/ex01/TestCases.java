/**
 * 
 */
package ex01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author danilo
 *
 */
class TestCases {

	// the two tests below should help you to find your way around, even if you are not too familiar with Java and JUnit 
	@Test
	void testExample01_Passing() {
		double in[]= {10.0 , 0.2 , 4.4, 5.6, 7.3, 8.5 };
		
		double out[] = new double[5];
		
		
		SlidingAverage.average(in, out, 1);
		
		// you can compare 2 scalar values
		assertEquals(10.0, out[0]);
		
		// but you can compare also arrays
		assertArrayEquals(in , in);
		
		// you can type assert and then CTRL+SPACE aka STRG+SPACE to see more choices of available assert functions
		// but those 2 plus possible assertThrows should get the job done for you
	}
	
	@Test
	void testExample02_Failing() {
		double in[]= {10.0 , 0.2 , 4.4, 5.6, 7.3, 8.5 };
		
		double out[] = new double[5];
		
		
		SlidingAverage.average(in, out, 1);
		
		// you can compare 2 scalar values, this will fail since 1.0 != 10.0
		assertEquals(1.0, out[0]);
		
		// but you can compare also arrays, this will fail, too, since in does not have same content as out
		assertArrayEquals(in , out);
		
		// you can type assert and then CTRL+SPACE aka STRG+SPACE to see more choices of available assert functions
		// but those 2 plus possible assertThrows should get the job done for you
	}

}
