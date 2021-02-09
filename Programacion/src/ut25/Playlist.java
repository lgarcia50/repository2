/**
 * 
 */
package ut25;
import java.util.ArrayList;
/**
 * @author lucia
 *
 */
public class Playlist {
	
String nombre_playlist;
ArrayList<Cancion> Playlist;

public Playlist() {	
	this.Playlist=new ArrayList<Cancion>();
}
public Playlist(String n) {
	this.nombre_playlist=n;
	this.Playlist=new ArrayList<Cancion>();	}

public void anyadirCancion(Cancion c) {
	this.Playlist.add(c);
}
public Cancion obtieneCancion(int posición) {
	return this.Playlist.get(posición);
	 
}
public int obtieneTotalCanciones() {
	return this.Playlist.size();
	 
}
public void mostrarPlaylist() {
	System.out.println("El nombre de playlist es: "+nombre_playlist);
}
public int totalDuracionPlaylist() {
	int sum=0;
	
	for (Cancion c: Playlist) sum=sum+c.getDuracion();
	
	return sum; 
}
public void reproducirPlaylist() {
	Cancion c;
	if(Playlist.size()!=0) {
		for (int i=0;i<Playlist.size();i++) {
		c= Playlist.get(i);
		System.out.println(c.reproducir());
		}
	}
	else
		System.out.println("No tiene canciones introducidas");
}
public void limpiarPlaylist() {
}
}
