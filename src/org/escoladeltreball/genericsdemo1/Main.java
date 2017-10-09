/**
 * 
 */
package org.escoladeltreball.genericsdemo1;

import java.util.ArrayList;

/**
 * @author iaw21752927
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Box box1 = new Box(new Sabata());
//		Box box2 = new Box(new Bota());
//		
//		System.out.println(box1.getContent()); //sin el metodo getContent(), sale la dirección del objeto => org.escoladeltreball.genericsdemo1.Box@15db9742
//		System.out.println(box2.getContent());
//		
//		//Sabata sabata = box1.getContent(); 
//		//Bota bota = box2.getContent();
//		//Dará error porque Box contiene un objeto Object, por lo que la solución seria
//		
//		Sabata sabata = (Sabata) box1.getContent();
//		Bota bota = (Bota) box2.getContent();
		
		GenericBox<Sabata> sabates = new GenericBox(new Sabata());
		GenericBox<Bota> botes = new GenericBox(new Bota());
		
		Sabata sabata = sabates.getContent();
		Bota bota = botes.getContent();
		System.out.println(sabata);
		System.out.println(bota);
				
	}

}
