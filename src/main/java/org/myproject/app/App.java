package org.myproject.app;

import org.myproject.layer0.Layer0;
import org.myproject.layer1.Layer1;
import org.myproject.layer2.Layer2;

public class App {

	

	public static void main(String[] args) {
		
		App.application();

	}

	/**
	 * Test of  the layers
	 */
	static void application(){
		
		layer0(0);
		layer1(0);
		layer2(0);
		System.out.println("-------------------------------------");
		layer0(1);
		layer1(1);
		layer2(1);
		System.out.println("-------------------------------------");
		layer0(1);
		layer1(6);
		layer2(6);
		System.out.println("-------------------------------------");
		layer0(1);
		layer1(6);
		layer2(13);
		
	}
	
	/**
	 * Calls the layer0
	 * @param number
	 */
	static void layer0(int number){
		
		Layer0 layer0= new Layer0();
		try {
			System.out.println(layer0.layer0(number));
		} catch (Exception e) {			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	/**
	 * 
	 * Calls the layer1
	 * @param number
	 */
	static void layer1(int number){
		
		Layer0 layer0= new Layer0();
		Layer1 layer1= new Layer1(layer0);		
		try {
			System.out.println(layer1.layer1(number));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} 		
		
	}
	
	/**
	 * Calls  layer2
	 * @param number
	 */
	static void layer2(int number){
		
		Layer0 layer0= new Layer0();
		Layer1 layer1= new Layer1(layer0);
		Layer2 layer2= new Layer2(layer1);
		try {
			System.out.println(layer2.layer2(number));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} 		
		
	}
	
}
