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
public class Ejercicio35 {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner obtenerNumero = new Scanner(System.in);
		        int numero,i,j;
		 
		        System.out.print("indica la tabla de multiplicar: ");
		        numero = obtenerNumero.nextInt();
		 
		        for(i = 1; i<=numero; i++)
		        {
		            for(j = 0; j <= 10; j++)
		            {
		                System.out.println(i + " X " + j + " = " + i*j);
		            }
		            System.out.println();
		        }
		    }
		}
