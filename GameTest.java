package texas;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class GameTest extends TestCase
	{
		
		public String s1="2D 3D 4D 5D 6D ";
		
		public String s2="3D 4D 5D 6D 7D ";
		
		public String s3="4D 5D 6D 7D 8D";
		
		public String  whitewinner = "White";
		
		public String  blackwinner="Black";
		
		Compare instance = new Compare();
		
		public void setUp() throws Exception 
		{}
		
		public void tearDown() throws Exception 
		{}

		public void testAdd() 
		{
		     String result = instance.compare(s1,s2);
		     System.out.print(result);
		     assertEquals(whitewinner, result);
		 }
		public void testtd()
		{
			String result1 = instance.compare(s3,s1);
			System.out.print(result1);
			assertEquals(blackwinner, result1);
		}
		
	}


