package org.myproject.layer1;

import org.myproject.layer0.Layer0;
import org.myproject.layer1.exception.ExceptionLayer1;

/**
 * 
 * @author Andres
 * Layer1
 */
public class Layer1 {

	private Layer0 layer0;
	
	/**
	 * Constructor 
	 * @param layer0
	 */
	public Layer1(Layer0 layer0) {

		this.layer0=layer0;
		
	}
	
	/**
	 *  If the value is greater than 15, it will return the value plus 10
	 * @param number
	 * @return
	 * @throws Exception
	 */
	public int layer1(int number) throws Exception{
		
		int newNumber= this.layer0.layer0(number);
		if(newNumber>15){
			return newNumber+10;
		}else{
			throw (new ExceptionLayer1(newNumber));
		}
		
	}
	
	
	
	/**
	 *  If the value is greater than 15, it will return the value plus 10
	 * @param number
	 * @return
	 * @throws Exception
	 */
	public int layer1If(int number) {
		
		int ReturnValue=0;
		try{
			int newNumber= this.layer0.layer0(number);
			if(newNumber>15){
				ReturnValue=newNumber+10;
			}	
		}catch(Exception e){
			ReturnValue=-1;
		}
		return ReturnValue;
				
	}
	
	

}
