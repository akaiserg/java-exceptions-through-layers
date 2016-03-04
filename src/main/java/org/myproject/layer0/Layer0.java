package org.myproject.layer0;

import org.myproject.layer0.exception.ExceptionLayer0;

/**
 * 
 * @author Andres
 * Layer 0
 *
 */
public class Layer0 {

	/**
	 *  If the value is greater than 0, it will return the value plus 10
	 * @param number
	 * @return
	 * @throws Exception
	 */
	public int layer0(int number) throws Exception {
		
		if (number > 0) {
			return number + 10;
		} else {
			throw (new ExceptionLayer0(number));
		}

	}

}
