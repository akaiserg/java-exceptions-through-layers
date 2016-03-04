package org.myproject.layer0.exception;

/**
 * Exception of the layer0
 * @author Andres
 *
 */
public class ExceptionLayer0 extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private int number;
	
	/**
	 * Constructor 
	 * @param number
	 */
	public ExceptionLayer0(int number) {
		
		this.number=number;
		
	}
	/**
	 * Overwrites  the method 
	 */
	@Override
	public String getMessage() {
		
		return "Number "+this.number+" too low, layer0";
	}

}
