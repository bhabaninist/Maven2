package Console.FirstMavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class NewTestCase1 {
	  @Test(testName= "Test1")
	  public void f() {
		  System.out.println("Test case 1");
		  assertEquals(true, true);
	  }
	  @Test
	  public void f1() {
		  System.out.println("Test Case 2");
		  assertEquals(true, true);
	  }
	  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test 1");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }
@AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }
}
