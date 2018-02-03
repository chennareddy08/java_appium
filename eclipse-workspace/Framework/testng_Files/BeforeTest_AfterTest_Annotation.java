package testng_Files;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTest_AfterTest_Annotation {
	
	@BeforeTest
	public void run1()
	{
		System.out.println("Cleanup");
	}
	@Test
    //No need main method here
    public void openingchrome() {
	System.out.println("test1");
// by default testng execute alphabatically ie A B C etc
}
    
@Test

public void booking()
{
	
System.out.println("booking session");

}

@AfterTest

public void run2()
{
	System.out.println("clear data");
}

}
