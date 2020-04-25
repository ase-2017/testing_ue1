/**
 * 
 */
package ex01;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author danilo
 *
 */
public class TestCases {

	// the two tests below should help you to find your way around, even if you are not too familiar with Java and JUnit 
	@Test
	public void testExample01_Passing() {
		// compare result for array length 1 with expected result 
		double in[]= {10.0 , 0.2 , 4.4, 5.6, 7.3, 8.5 };
		
		double out[] = new double[1];
		double reference[] = { 10.0 };// the expected sliding average value(s)
		
		
		SlidingAverage.average(in, out, 1);
		
		for (int idx = 0; idx < 1; idx++)
		{
			// you can compare 2 scalar values
			assertEquals(in[idx], out[idx],0.0); 
			// all these assertXXXX statements in a test must yield true to get a successfully passed test.
			// 
			// the third argument 0.0 is how much both values may differ from each other to be still considered equal
			// this is because sometimes rounding error create almost identical results where the difference is not relevant
			// we go for exact match thus 0.0
		}
		// but you can compare also arrays
		assertArrayEquals(reference , out, 0.0);
		
		// you can type assert and then CTRL+SPACE aka STRG+SPACE to see more choices of available assert functions
		// but those 2 (plus possibly assertThrows) should get the job done for you
	}
	
	@Test
	public void testExample02_Failing() {
		// compare result for array length 1 with expected result
		// this test is the same as above, but this time failing since
		// the expected reference result is not identical to the delivered result
		// however, the fault this time is in the test case, not the tested method
		double in[]= {10.0 , 0.2 , 4.4, 5.6, 7.3, 8.5 };
		
		double out[] = new double[1];
		double reference[] = { 100.0 }; // the expected sliding average value(s)
		
		
		SlidingAverage.average(in, out, 1);
		
		for (int idx = 0; idx < 1; idx++)
		{
			// you can compare 2 scalar values
			assertEquals(in[idx], out[idx], 0.0);
		}
		// but you can compare also arrays
		assertArrayEquals(reference , out, 0.0);		
	}
}
