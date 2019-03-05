package day8;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTesting2 {
	
  @Test(priority=1000,groups= {"Sanity"})
  
  public void testcase1() {
	  System.out.println("Class 2 Test Case 1");
  }
  
  @Test(priority = -1)
  public void testcase2() {
	  System.out.println("Class 2 Test Case 2");
}
  @Test(priority=3000)
  public void testcase3() {
	  System.out.println("Class 2 Test Case 3");
  }
  @BeforeMethod(alwaysRun = true)
  public void beforeATestCase() {
	  System.out.println("Before A Class 2 Test Case");
  }
  @AfterMethod(alwaysRun = true)
  public void afterATestCase() {
	  System.out.println("After A Class 2 Test Case");
  }
  @BeforeClass(alwaysRun = true)
  public void beforeAClass() {
	  System.out.println("First method Of The Class 2");
  }
  @AfterClass(alwaysRun = true)
  public void afterAClass() {
	  System.out.println("Last Method Of The Class 2");
  }
}
 