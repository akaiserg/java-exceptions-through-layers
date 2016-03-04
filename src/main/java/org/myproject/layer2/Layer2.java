package org.myproject.layer2;

import org.myproject.layer1.Layer1;
import org.myproject.layer2.exception.ExceptionLayer2;

/**
 * 
 * @author Andres
 * layer2
 */
public class Layer2 {

	private Layer1 layer1;
	
	/**
	 * Constructor
	 * @param layer1
	 */
	public Layer2(Layer1 layer1) {

		this.layer1=layer1;
		
	}
	
	/**
	 *  If the value is greater than 30, it will return the value plus 10
	 * @param number
	 * @return
	 * @throws Exception
	 */
	public int layer2(int number) throws Exception{
		
		int newNumber= this.layer1.layer1(number);
		if(newNumber>30){
			return newNumber+10;
		}else{
			throw (new ExceptionLayer2(newNumber));
		}
		
	}
	
	
	/**
	 *  If the value is greater than 30, it will return the value plus 10
	 * @param number
	 * @return
	 * @throws Exception
	 */
	public int layer2If(int number) throws Exception{
		
		int newNumber= this.layer1.layer1If(number);
		if(newNumber>30){
			return newNumber+10;
		}else{
			throw (new ExceptionLayer2(newNumber));
		}
		
	}
	

}
