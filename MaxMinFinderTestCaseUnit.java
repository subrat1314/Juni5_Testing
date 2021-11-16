package juni5Testing;

//MaxMinFinderTestCaseUnit

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaxMinFinderTestCaseUnit {
	MaxMinFinder mm=new MaxMinFinder();

	@Test
	@DisplayName("Checking the Result For MaxMinFinder")
	void test1() {
		int[] arr1=new int[]{3,56};
		int []a= {56,34,7,3,54,3,34,34,53};
		assertArrayEquals(arr1,mm.findMinMax(a));
	}
	
	/*MaxMinFinder a;
    @Test
    void findMinMax() {
        a=new MaxMinFinder();
        assertArrayEquals(new int[]{2,99}, a.findMinMax(new int[]{89,2,56,43,99}));
        assertArrayEquals(new int[]{-1,9}, a.findMinMax(new int[]{5,6,0,7,-1,8,9}));
        assertArrayEquals(new int[]{0,15}, a.findMinMax(new int[]{15, 8, 5, 3, 0}));
        assertArrayEquals(new int[]{42,69}, a.findMinMax(new int[]{55,65,54,59,62,42,69}));
    }*/
	
}

