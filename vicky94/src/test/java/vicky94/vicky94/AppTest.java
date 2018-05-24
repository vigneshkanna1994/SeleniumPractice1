package vicky94.vicky94;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
{
   public void afterTest(){
	   System.out.println("AfterTest");
   }
   public void beforeTest(){
	  System.out.println("BeforeTest");
   }
   public void testMethod(){
	   System.out.println("Test Method");
   }
}
