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

public class Ejercicio36 {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el lado del cuadrado: ");
        int lado = entrada.nextInt();
       entrada.close();
 
        System.out.println();
        for(int row=1; row<=lado; row++){
            for(int col=1; col<=lado; col++){
                if(row==1 || row==lado || col==1 || col==lado){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

	}
