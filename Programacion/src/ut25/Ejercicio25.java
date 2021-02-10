/**
 * 
 */
package ut25;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lucia
 *
 */

public class Ejercicio25  {

	public static void main(String[] args) {
		int opcion;
		ArrayList <Playlist> playlists = new ArrayList <Playlist>();
		ArrayList <Cancion>canciones = new ArrayList <Cancion>();
		do {
			opcion=menu();
			switch(opcion) {
			case 0:adios();break;
			case 1:crearPlaylist(playlists);;break;
			case 2:anyadirCancion(playlists,canciones);break;
			case 3:verCancion(playlists);;break;
			case 4:totalPlaylist(playlists);;break;
			case 5:reproducirPlaylist(playlists);;break;
			
			}
		} while (opcion!=0);



		Cancion cancion1=new Cancion();

		System.out.println(cancion1.reproducir()); 
		
		
		
	}
	/**
	 * Funcion para dar un menu al usario simpre que lo necesite
	 * @return Vamos a devilver el valor de la opcion que vamos a necesitar para el menu
	 */
	
	public static int menu () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenidos a mi playlist");
		System.out.println("Estas son las opciones que tienes:");
		System.out.println("1. Crear Playlist");
		System.out.println("2. Añadir una cancion a una Playlist.");
		System.out.println("3. Ver una cancion en una Playlist");
		System.out.println("4. Ver las canciones totales de una Playlist");
		System.out.println("5. Ver lo que dura una Playlist");
		System.out.println("6. Reproducir una Playlist");
		System.out.println("7. Reproducir una cancion de una Playlist");
		System.out.println("8. Limpiar una Playlist de canciones");
		System.out.println("9. Eliminar una cancion de una Playlist");
		System.out.println("10.Buscar por titulo.");

		System.out.println("0. Salir del programa");
		int opcion=sc.nextInt();
		return opcion;

	}
	/**
	 * Funcion para crear una playlist que quiera el usuario con el nombre que el desee
	 * @param playlists Arraylist de todas las playList que va a tener el progrma
	 */
	public static void crearPlaylist(ArrayList <Playlist> playlists) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Que nombre quieres dar a la playlist?");
		Playlist playlist =new Playlist();
		playlist.setNombrePlaylist(sc.nextLine());
		playlists.add(playlist);
		System.out.println(playlist.getNombrePlaylist());
	}
	/**
	 * 
	 * @param playlists Array de todas las playlists
	 * @param canciones Array de todas las canciones
	 */
	public static void anyadirCancion(ArrayList <Playlist> playlists,ArrayList <Cancion>canciones){
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < playlists.size(); i++) {
			System.out.println(i+". "+playlists.get(i).getNombrePlaylist());
		}
		int opcionP=sc.nextInt();
		System.out.println("Que cancion quieres meter?");
		for (int i = 0; i < canciones.size(); i++) {
			System.out.println(i+". "+canciones.get(i).getTitulo());
		}
		int opcionC=sc.nextInt();
		playlists.get(opcionP).anyadirCancion(canciones.get(opcionC));
	}
	/**
	 * 
	 * @param playlists Array de todas las playlists
	 */
	public static void verCancion(ArrayList <Playlist> playlists) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime playlist que quieras:");
		mostrarPlaylists(playlists);
		int playlistDeseada=sc.nextInt();
		System.out.println("Que posicion quieres ver?");
		int posDeseada=sc.nextInt();
		System.out.println(playlists.get(playlistDeseada).obtenerCancion(posDeseada));
	}
	public static void totalPlaylist(ArrayList <Playlist> playlists) {
		Scanner sc = new Scanner (System.in);
		System.out.println("De que playlist quieres ver las canciones que tienes?");
		mostrarPlaylists(playlists);
		int opcion=sc.nextInt();
		System.out.println(playlists.get(opcion).totalCanciones());
	}
	public static void totalDuracionPlaylist(ArrayList <Playlist> playlists) {
		Scanner sc = new Scanner (System.in);
		System.out.println("De que playlist quieres ver la duracion total?");
		mostrarPlaylists(playlists);
		int opcion=sc.nextInt();
		System.out.println("Tu playlist dura "+playlists.get(opcion).totalDuracionPlaylist()+" minutos");
	}
	public static void reproducirPlaylist(ArrayList <Playlist> playlists) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Que Playlist quieres reproducir?");
		mostrarPlaylists(playlists);
		int opcion=sc.nextInt();
		System.out.println(playlists.get(opcion).reproducirPlaylist());
	}
	public static void reproducirCancionPlaylist(ArrayList <Playlist> playlists,ArrayList <Cancion>canciones) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Que Playlist quieres reproducir?");
		mostrarPlaylists(playlists);
		int opcionP=sc.nextInt();
		System.out.println("Que cancion quieres que te reproduzaca?");
		mostrarCancionesPlaylist(canciones);
		int opcionC=sc.nextInt();
		System.out.println(playlists.get(opcionP).reproducirCancion(opcionC));
	}
	public static void borrarContenidoPlaylist(ArrayList <Playlist> playlists) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que Playlist quieres dejarla vacia?");
		mostrarPlaylists(playlists);
		int opcion=sc.nextInt();
		playlists.get(opcion).limpiarPlaylist();
		sc.close();
	}
	public static void eliminarCancion(ArrayList <Playlist>playlists,ArrayList <Cancion>canciones) {
		Scanner sc=new Scanner (System.in);
		System.out.println("De que Playlist quieres borrar una cancion?");
		mostrarPlaylists(playlists);
		int opcionP=sc.nextInt();
		System.out.println("Que cancion quieres borrar?");
		mostrarCancionesPlaylist(canciones);
		int opcionC=sc.nextInt();
		playlists.get(opcionP).eliminarCancion(opcionC);
	}
	public static void buscarPorTitulo(ArrayList <Playlist>playlists) {
		Scanner sc=new Scanner (System.in);
		Scanner sc2=new Scanner (System.in);
		System.out.println("Que cancion quieres buscar?");
		String titulo=sc.nextLine();
		System.out.println("En que playlist quieres buscarla?");
		mostrarPlaylists(playlists);
		int playl=sc2.nextInt();
		for (int i = 0; i < playlists.size(); i++) {
			if (playlists.get(playl) != null) {
				
			}
		}
	}
	public static void mostrarCancionesPlaylist(ArrayList <Cancion>canciones) {
		for (int i = 0; i < canciones.size(); i++) {
			System.out.println(i+". "+canciones.get(i).getTitulo());
		}
	}
	public static void mostrarPlaylists(ArrayList <Playlist> playlists) {
		for (int i = 0; i < playlists.size(); i++) {
			System.out.println(i+". "+playlists.get(i).getNombrePlaylist());
		}
	}
	public static void adios() {
		System.out.println("Muchas gracias por usar esta aplicacion.");
	}


}