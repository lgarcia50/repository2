/**
 * 
 */
package UT6;

/**
 * @author anaga
 *
 */
public class Actividad20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			Persona yo = new Persona();
		yo.setNombre("lucia");
		System.out.println(yo.getNombre());
        yo.setApellidos("GARCIA GarCia");
        System.out.println(yo.getApellidos());
        yo.setAnio(2002);
        yo.setMes(4);
		yo.setDia(13);
		yo.setSexo('M');
		yo.saludar();
		System.out.println(yo.mostrarEdad());
		
		Persona invento = new Persona("PEPE", "lopez garcia", 8000, 34, -3, 'G');
		invento.saludar();
		}
	
	}


