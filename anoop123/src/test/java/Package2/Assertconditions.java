package Package2;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Assertconditions {
  @Test(priority = 0)
  public void yogi() 
  {
	  AssertJUnit.assertEquals("tushar", "anoop");
	  System.out.println("This is first case");
  }
  @Test(priority = 1,dependsOnMethods = "yogi",alwaysRun = true)
  public void prathiksha()
  {
	  System.out.println("This is second case");
  }
  @Test(priority = 2)
  public void meghana()
  {
	  System.out.println("This is third case");
  }
  @Test(priority = 3,dependsOnMethods = "yogi")
  public void prashanth()
  {
	  System.out.println("This is fourth case");

  }
}
