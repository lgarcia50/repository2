/**
 * 
 */
package ut3;
import java.util.Scanner;
/**
 * 
 * @author lucia
 *
 */

public class Elefantes {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int salir = 0;
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int telaraña;
		int elefantes;
		int suma = 0;
		int aux;
		int total_suma = 0;
		

		while (true) {
		System.out.println("Escribe el peso de la telaraña:");
		telaraña = entrada.nextInt();
		do {
		System.out.println("Escribe el peso del elefante");
		elefantes = entrada.nextInt(); 
		 aux = elefantes; 
         suma = aux + total_suma; 
         total_suma = suma; 
         System.out.println(+suma);
		}while (elefantes != 0); 
		
		if( suma <= telaraña) {
		    	System.out.println("La telaraña todavia aguanta");
		    }else {
		    	System.out.println("Uy se ha roto");
		    	}
		 System.out.println("Si quiere poner otros datos pulse(1), si quiere salir pulse(0)");
		 salir = entrada.nextInt();
		while(salir==0);
		 
		}
	}
}