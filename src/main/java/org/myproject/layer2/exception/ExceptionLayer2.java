package org.myproject.layer2.exception;

/**
 * Exception of the layer2
 * @author Andres
 *
 */
public class ExceptionLayer2	extends Exception {

		private static final long serialVersionUID = 1L;
		private int number;
		/**
		 * Constructor
		 * @param number
		 */
		public ExceptionLayer2(int number) {
			
			this.number=number;
			
		}
		
		/**
		 * Overwrites  the method
		 */
		@Override
		public String getMessage() {
			
			return "Number "+this.number+" too low, layer2";
		}


}