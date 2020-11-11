/**
 * 
 */
package ut3;
import java.util.Scanner;
/**
 * 
 * @author anaga
 *
 */

public class Ejercicio37 {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el numero de columnas: ");
        int columna = entrada.nextInt();
        System.out.println("Introduzca el numero de filas");
        int filas = entrada.nextInt();
       entrada.close();
 
        System.out.println();
        for(int row=1; row<=columna; row++){
            for(int col=1; col<=filas; col++){
                if(row==1 || row==columna || col==1 || col==filas){
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

