package Package2;

import org.testng.annotations.Test;

public class group {
  @Test(groups = "smoke",priority = 0)
  public void testcase1() 
  {
	System.out.println("This my first Smoke Test");  
  }
  @Test(groups = "Regression",priority = 1)
  public void testcase2()
  {
	  System.out.println("This is my first regression Test");
  }
  @Test(groups = "smoke",priority = 2)
  public void testcase3()
  {
	  System.out.println("This my Second Smoke Test");  
  }
}
