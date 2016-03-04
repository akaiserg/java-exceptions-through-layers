package org.myproject.layer1.exception;

/**
 * Exception of the layer1
 * @author Andres
 *
 */
public class ExceptionLayer1 extends Exception {

	private static final long serialVersionUID = 1L;
	private int number;
	/**
	 * Constructor
	 * @param number
	 */
	public ExceptionLayer1(int number) {
		
		this.number=number;
		
	}
	
	/**
	 * Overwrites  the method
	 */
	@Override
	public String getMessage() {
		
		return "Number "+this.number+" too low, layer1";
	}

}
