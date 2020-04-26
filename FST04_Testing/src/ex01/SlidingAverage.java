package ex01;

public class SlidingAverage {
	
	/* Average of neighboring elements in array
	 * Author: Danielo Beuche
	 * 
	 * Sliding average of an value is calculated by averaging two right and left values and the value itself
	 * If there are not enough neighbors available, the value itself is place in the output array.
	 * The output array may be shorter than the defined length of the to be processed input values
	 * In this case the output array contains the appropriate values and the method returns normally  
	 * 
	 */ 
	 
	public static void average(double[] in, double[] out, int length) { 
		/* loop over all elements in 'in' array */
		for (int i = 0; i < length; i++) {
			// Compare index with 1 or length -1, only do average in this case
			if (i > 1 || i < length - 1) {
				// index within limits, do average
				out[i] = in[i - 2] + in[i - 1] + in[i] + in[i + 1] + in[i + 2];
			} else {
				// not in limits, just copy
				out[i] = in[i];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double in[]= {10.0 , 0.2 , 4.4, 5.6, 7.3, 8.5 };
			// sliding average output for this input should be 
			// { 10.0, 0.2, 5.5, 5.2, 7.3, 8.5 }
			
			double out[] = new double[5];
			
			average(in, out,1);
			System.out.print(out[0]);
	}

}
