/**
 * 
 */
package ej22;
import java.util.Scanner;
/**
 * @author lucia
 *
 */
public class Ejercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Libro libro1= new Libro("La casa de la pradera", "Chiquito de la calzada", 10,9);
		libro1.prestamo();
		System.out.println("Ejemplares del libro 1:" +libro1.getEjemplares());
		libro1.prestamo();
		System.out.println("Ejemplares del libro 2:" +libro1.getEjemplares());
		libro1.devolver();
		libro1.setPrestados(0, 0, 0);
		libro1.devolver();
		System.out.println("Ejemplares prestados del libro 1:" +libro1.getNumPrestados());
		System.out.println("Vamos a introducir tu propio libro:");
		Libro libro3= new Libro();
		Scanner sc= new Scanner (System.in);
		System.out.println("Dime el nombre de tu libro:");
		libro3.setTitulo(sc.nextLine());
		System.out.println("Dime el autor de tu libro:");
		libro3.setAutor(sc.nextLine());
		System.out.println("Dime el numero de libros que tienes:");
		libro3.setEjemplares(sc.nextInt(), 0, 0);
		System.out.println("Dime el numero de ejemplares prestados:");
		libro3.setPrestados(sc.nextInt(), 0, 0);
		System.out.println(libro3.toString());
		sc.close();
		

	}

}
