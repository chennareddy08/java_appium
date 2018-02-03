package testng_Files;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeSuite_AfterSuite {

	@BeforeSuite
	public void install()
	{
		System.out.println("installing required software");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
	
	@AfterSuite
	public void uninstall()
	{
		System.out.println("UN install software");
		}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
}
