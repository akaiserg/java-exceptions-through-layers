package org.myproject.layer0;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

public class Layer0Test {

	private static Layer0 layer0;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		Layer0Test.layer0= new Layer0(); 
		
	}

	@Test
	public void testLayer0ValueZero() {
		
		int value=0;
		int newValue=0;
		try{
			newValue=Layer0Test.layer0.layer0(value);
		}catch(Exception e ){
			assertEquals("Checking the excepton message when the value is 0","Number "+value+" too low, layer0", e.getMessage());
		}finally{
			assertEquals("newValue should be 0",newValue,0);
		}
		
	}
	
	@Test
	public void testLayer0ValueMinusOne() {
		
		int value=-1;
		int newValue=0;
		try{
			newValue=Layer0Test.layer0.layer0(value);
		}catch(Exception e ){
			assertEquals("Checking the excepton message when the value is 0","Number "+value+" too low, layer0", e.getMessage());
		}finally{
			assertEquals("newValue should be 0",newValue,0);
		}
		
	}
	
	@Test
	public void testLayer0ValueOne() {
		
		int value=1;
		int newValue=0;
		try{
			newValue=Layer0Test.layer0.layer0(value);
			assertEquals("Checking the new value should be  value plus ten",newValue,value+10);
		}catch(Exception e ){			
			fail("Should not enter here ");
		}finally{			
			Assert.assertFalse("newValue should not  be 0", newValue==0);
		}
		
	}
	
	
	@Test
	public void testLayer0ValueTen() {
		
		int value=10;
		int newValue=0;
		try{
			newValue=Layer0Test.layer0.layer0(value);
			assertEquals("Checking the new value should be  value plus ten",newValue,value+10);
		}catch(Exception e ){			
			fail("Should not enter here ");
		}finally{			
			Assert.assertFalse("newValue should not  be 0", newValue==0);
		}
		
	}
	
}
