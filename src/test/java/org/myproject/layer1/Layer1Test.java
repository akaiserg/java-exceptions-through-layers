package org.myproject.layer1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;
import org.myproject.layer0.Layer0;
import org.myproject.layer1.Layer1;

public class Layer1Test {

	private static Layer0 layer0;
	private static Layer1 layer1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		Layer1Test.layer0= new Layer0();
		Layer1Test.layer1= new Layer1(layer0);
		
	}

	@Test
	public void testLayer1ValueZero() {
		
		int value=0;
		int newValue=0;
		try{
			newValue=Layer1Test.layer1.layer1(value);
		}catch(Exception e ){
			// exception from the layer0
			assertEquals("Checking the excepton message when the value is 0","Number "+value+" too low, layer0", e.getMessage());
		}finally{
			assertEquals("newValue should be 0",newValue,0);
		}
		
	}
	
	@Test
	public void testLayer1ValueOne() {
		
		int value=1;
		int newValue=0;
		try{
			newValue=Layer1Test.layer1.layer1(value);			
		}catch(Exception e ){			
			assertEquals("Checking the excepton message when the value is 0, the exception must come from layer1","Number "+this.returnValueFromLayer0(value)+" too low, layer1", e.getMessage());
		}finally{			
			Assert.assertTrue("newValue should be 0", newValue==0);
		}
		
	}
	
	
	@Test
	public void testLayer1Valuefive() {
		
		int value=5;
		int newValue=0;
		try{
			newValue=Layer1Test.layer1.layer1(value);			
		}catch(Exception e ){			
			assertEquals("Checking the excepton message when the value is 5, the exception must come from layer1","Number "+this.returnValueFromLayer0(value)+" too low, layer1", e.getMessage());
		}finally{			
			Assert.assertTrue("newValue should be 0", newValue==0);
		}
		
	}
	
	
	@Test
	public void testLayer1ValueSix() {
		
		int value=6;
		int newValue=0;
		try{
			newValue=Layer1Test.layer1.layer1(value);
			assertEquals("Checking the new value should be  value plus 20",newValue,this.returnValueFromLayer0(value)+10);
		}catch(Exception e ){			
			fail("Should not enter here ");
		}finally{			
			Assert.assertFalse("newValue should not  be 0", newValue==0);
		}
		
	}
	
	private int  returnValueFromLayer0(int value){
		
		try {
			return Layer1Test.layer0.layer0(value);
		} catch (Exception e) {
			//value of exception
			return -1;
		}
		
	}
	

}
