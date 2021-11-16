

package juni5Testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Juni5Annotations_LifeCycle 
{
	Calculator cal;
	@BeforeEach
	public void Initialize()
	{
		cal=new Calculator();
		System.out.println("Opeartion Starts");
	}
	
	@AfterEach
	public void AfterTest()
	{
		System.out.println("Opeartion Ends");
		
		System.out.println("            -           ");
	}
	
	@BeforeAll
	public static void BerforeAllTest()
	{
		System.out.println("Execution Starts.......");
		System.out.println("       ");
	}
	
	@AfterAll
	public static void AfterAllTest()
	{
		System.out.println("Execution Ended Succesfully");
	}
	
	@Order(1)
	@Test
	//@RepeatedTest(3)
	@DisplayName("Adding two Small positive number")
	public void testMethod1()
	{
		
		int sum=cal.add(10,20);
		System.out.println("Sum of Two Small +ve number is "+sum);
	}
	
	@Order(3)
	@Test
	@DisplayName("Adding two Small negative number")
	public void testMethod2()
	{
		
		int sum=cal.add(-30,-20);
		System.out.println("Sum of Two Small -ve number is "+sum);
	}
	
	//@Disabled
	@Order(2)
	@Test
	@DisplayName("Adding two big positive number ")
	public void testMethod3()
	{
		
		int sum=cal.add(1005,2004);
		System.out.println("Sum of Two big +ve number is "+sum);
	}
	
	@Order(4)
	@Test
	@DisplayName("Adding two big Negative number ")
	public void testMethod4()
	{
		
		int sum=cal.add(-1005,-2004);
		System.out.println("Sum of Two big -ve number is "+sum);
	}

}
