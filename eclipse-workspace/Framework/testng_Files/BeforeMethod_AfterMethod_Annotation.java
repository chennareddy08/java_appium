package testng_Files;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class BeforeMethod_AfterMethod_Annotation {

@BeforeMethod
//Prequest

public void cleanup()

{

System.out.println(" executes before each Test");

}

@BeforeTest

public void Cookies()

{

System.out.println("cleanup Before all Testcases");

//delete cookies

}

@AfterTest

public void Cookiesclose()

{

System.out.println("Cleanup after all Testcases");

//close the browesers

}

@AfterMethod
//is post request
public void Reportadding()

{

System.out.println("executes after each Test");

}

@Test

public void OpeningBrowser()

{

//This opens the Browser

System.out.println("Test 2");

}

@Test

public void Booking()

{

System.out.println("Test 1");

}

@Test

public void Cancel()

{

System.out.println("Executing Test  2");

}

}