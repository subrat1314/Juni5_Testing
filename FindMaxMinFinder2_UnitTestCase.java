package juni5Testing;


//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaxMinFinder2_UnitTestCase {
	
	 int[] array = new int[] {56,34,7,3,54,3,34,34,53};
	
	
	@Test
    public void testMin() {
        int minValue = FindMaxMinFinder2.findMin(array);
        assert(minValue == 3);
        System.out.println("True");
    }
	@Test
    public void testMax() {
        int maxValue = FindMaxMinFinder2.findMax(array);
        assert(maxValue == 56);
        System.out.println("True");
    }
	
	
}

