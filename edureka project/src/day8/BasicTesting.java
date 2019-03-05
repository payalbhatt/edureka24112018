package day8;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTesting {
	
  @Test(priority=0)
  
  public void testcase1() {
	  System.out.println("Test Case 1");
  }
  
  @Test(priority = -1,groups= {"Sanity, Regression"})
  public void testcase2() {
	  System.out.println("Test Case 2");
}
  @Test(priority=3000,groups= {"Sanity"})
  public void testcase3() {
	  System.out.println("Test Case 3");
  }
  @BeforeMethod(alwaysRun = true)
  public void beforeATestCase() {
	  System.out.println("Before A Test Case");
  }
  @AfterMethod(alwaysRun = true)
  public void afterATestCase() {
	  System.out.println("After A Test Case");
  }
  @BeforeClass(alwaysRun = true)
  public void beforeAClass() {
	  System.out.println("First method Of The Class");
  }
  @AfterClass(alwaysRun = true)
  public void afterAClass() {
	  System.out.println("Last Method Of The Class");
  }
}
 