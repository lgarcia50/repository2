/**
 * 
 */
package ut621;

import java.util.ArrayList;


/**
 * @author lucia
 *
 */

	public class Actividad21 {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			contador c1= new contador();
			contador c2= new contador(5);
			c1.cont = 2;
			System.out.println("Valor del contador 1: " + c1.getCont());
			System.out.println("Valor del contador 2: " + c2.getCont());
			c2.incrementar();
			System.out.println("Valor del contador 2 tras incrementar: " + c2.getCont());
			c2.decrementar();
			System.out.println("Valor del contador 2 tras decrementar: " + c2.getCont());
			contador c3= new contador(2);
			contador c4 = new contador(c3);
			System.out.println("Valor del contador 3: " + c3.getCont());
			System.out.println("Valor del contador 4: " + c4.getCont());
			c3.incrementar();
			System.out.println("Valor del contador 3 tras incrementar: " + c3.getCont());
			
			ArrayList<contador> contadores= new ArrayList<contador>();
			contadores.add(c1);
			contadores.add(c2);
			contadores.add(c3);
			for (int i=0; i<contadores.size();i++){
				contadores.get(i).decrementar();
				System.out.println("Valor del contador " + (i+1) + " - " +contadores.get(i).getCont());
			}

		}

	}

