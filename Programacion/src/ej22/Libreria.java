/**
 * 
 */
package ej22;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author lucia
 *
 */
public class Libreria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu=9;
		int id=0;
		 String titulo, autor;
		 int ejemplares, prestados;
		 Scanner sc = new Scanner(System.in);
			ArrayList<Libro> libreria=new ArrayList<Libro>();
			//Libro libro1 = new Libro(" la casa de la pradera", " Chiquito de la calzada", 10, 9);
			//Libro libro2 = new Libro("el ultimo mohicano ", " kiko rivera", 5, 4);
			Libro nuevolibro= new Libro();
			while(menu!=0) {
				System.out.println("\n0.Salir\n1.Alta libro\n2.Consulta libro\n3. baja libro\n4.prestamos de libro");
				System.out.println("elige una opcion:");
				menu=sc.nextInt();
					if(menu==1) {
						añadirLibro(libreria);
					}
					else if(menu==2) {
						for(int i=0;i<libreria.size();i++){
						System.out.println("id libro: "+i);
						System.out.println("\ntitulo del libro: "+libreria.get(i).getTitulo());
						System.out.println("\nautor del libro: "+libreria.get(i).getAutor());
						System.out.println("\nnumero de ejemplares:"+libreria.get(i).getEjemplares());
						System.out.println("\nnumero de prestados: "+libreria.get(i).getNumPrestados()+"\n\n");
						}	
					}
					else if(menu==3) {
						 System.out.print("dime el id del libro que quieres eliminar: ");
						id=sc.nextInt();
						libreria.remove(id);
						}
					else if(menu==4) {
						int id_max=libreria.size();
						int y=0;
						while(y==0) {
							 System.out.print("dame el id del libro que quieres  coger prestado, debe ser menor que "+id_max+ " : ");
							 id=sc.nextInt();
							if(id<id_max)
								y=1;


						}

						 nuevolibro=libreria.get(id);
						 if (nuevolibro.prestamo()) {
							 System.out.println("Se ha prestado el libro " + nuevolibro.getTitulo());
							 } else {
							 System.out.println("No quedan ejemplares del libro " + nuevolibro.getTitulo() + " para prestar");
							 }

					}
					}
		}
			
	private static void añadirLibro(ArrayList<Libro>l) {
		Scanner sc=new Scanner(System.in);
		Libro nuevolibro=new Libro();
		System.out.print("Introduce titulo: ");
		nuevolibro.setTitulo(sc.next()); 
		 System.out.print("Introduce autor: ");
		 nuevolibro.setAutor(sc.next());  
		 System.out.print("Numero de ejemplares: ");
		 nuevolibro.setEjemplares(sc.nextInt()); 
		 l.add(nuevolibro);
		 System.out.print("has añadido un libro nuevo.");
	}

	}

