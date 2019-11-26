package Console.FirstMavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class NewTestCase2 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println(n + " : "+ s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class in 2");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test in 2");
  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite in 2");
	  
  }

}
