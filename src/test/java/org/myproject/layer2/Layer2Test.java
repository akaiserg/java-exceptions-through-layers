package org.myproject.layer2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;
import org.myproject.layer0.Layer0;
import org.myproject.layer1.Layer1;
import org.myproject.layer2.Layer2;

public class Layer2Test {

	private static Layer0 layer0;
	private static Layer1 layer1;
	private static Layer2 layer2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		Layer2Test.layer0= new Layer0();
		Layer2Test.layer1= new Layer1(layer0);
		Layer2Test.layer2= new Layer2(layer1);
		
	}
	

	@Test
	public void testLayer2ValueZero() {
		
		int value=0;
		int newValue=0;
		try{
			newValue=Layer2Test.layer2.layer2(value);
		}catch(Exception e ){
			// exception from the layer0
			assertEquals("Checking the excepton message when the value is 0","Number "+value+" too low, layer0", e.getMessage());
		}finally{
			assertEquals("newValue should be 0",newValue,0);
		}
		
	}
	
	
	@Test
	public void testLayer2ValueFour() {
		
		int value=4;
		int newValue=0;
		try{
			newValue=Layer2Test.layer2.layer2(value);
		}catch(Exception e ){
			// exception from the layer1
			assertEquals("Checking the excepton message when the value is 4","Number "+this.returnValueFromLayer0(value)+" too low, layer1", e.getMessage());
		}finally{
			assertEquals("newValue should be 0",newValue,0);
		}
		
	}
	
	@Test
	public void testLayer2ValueSeven() {
		
		int value=7;
		int newValue=0;
		try{
			newValue=Layer2Test.layer2.layer2(value);
		}catch(Exception e ){
			// exception from the layer2
			assertEquals("Checking the excepton message when the value is 7","Number "+this.returnValueFromLayer1(value)+" too low, layer2", e.getMessage());
		}finally{
			assertEquals("newValue should be 0",newValue,0);
		}
		
	}
	
	@Test
	public void testLayer2ValueTen() {
		
		int value=10;
		int newValue=0;
		try{
			newValue=Layer2Test.layer2.layer2(value);
		}catch(Exception e ){
			assertEquals("Checking the excepton message when the value is 7","Number "+this.returnValueFromLayer1(value)+" too low, layer2", e.getMessage());
		}finally{
			assertEquals("newValue should be 0",newValue,0);
		}
		
	}
	
	
	@Test
	public void testLayer2ValueEleven() {
		
		int value=11;
		int newValue=0;
		try{
			newValue=Layer2Test.layer2.layer2(value);
			assertEquals("Checking the new value should be  value plus 30",newValue,this.returnValueFromLayer1(value)+10);
		}catch(Exception e ){			
			fail("Should not enter here ");
		}finally{			
			Assert.assertFalse("newValue should not  be 0", newValue==0);
		}
		
	}
	
	@Test
	public void testLayer2ValueTwenty() {
		
		int value=20;
		int newValue=0;
		try{
			newValue=Layer2Test.layer2.layer2(value);
			assertEquals("Checking the new value should be  value plus 30",newValue,this.returnValueFromLayer1(value)+10);
		}catch(Exception e ){			
			fail("Should not enter here ");
		}finally{			
			Assert.assertFalse("newValue should not  be 0", newValue==0);
		}
		
	}
	
	
	private int  returnValueFromLayer1(int value){
		
		try {
			return Layer2Test.layer1.layer1(value);
		} catch (Exception e) {
			//value of exception
			return -1;
		}
		
	}
	
	private int  returnValueFromLayer0(int value){
		
		try {
			return Layer2Test.layer0.layer0(value);
		} catch (Exception e) {
			//value of exception
			return -1;
		}
		
	}
	

}
