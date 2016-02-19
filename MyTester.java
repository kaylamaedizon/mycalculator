import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {
	
	@Test
	public void testNfactorial() {
		MyCalculator tester = new MyCalculator();
		assertEquals("5! = 120", 120, tester.nfactorial(5));
		assertEquals("7! = 5040", 5040, tester.nfactorial(7));
		assertEquals("3! = 6", 6, tester.nfactorial(3));
	}

	@Test
	public void testBinarySearch() {
		MyCalculator tester = new MyCalculator();
		int[] a = {0,1,2,3,4,5,6,7};
		assertEquals("binSearch(5) from array a = 5", 5, tester.binarySearch(a,5 ));
		assertEquals("binSearch(7) from array a = 7", 7, tester.binarySearch(a,7 ));
		assertEquals("binSearch(3) from array a = 3", 3, tester.binarySearch(a,3));
	}

}
