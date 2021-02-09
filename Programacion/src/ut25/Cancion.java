/**
 * 
 */
package ut25;

/**
 * @author lucia
 *
 */
public class Cancion {
	private String titulo;
	private String artista;
	private int duracion;
	
	/**
	 * Constructor vacio
	 */
	public Cancion() {}
	/**
	 * Constructor con parametos
	 * @param titulo Nombre de la cancion 
	 * @param artista Nombre del artista 
	 * @param duracion Duracion de la cancion 
	 */
	public Cancion(String titulo, String artista, int d) {
		this.titulo=titulo;
		this.artista=artista;
		this.duracion= d;
	}
	/**
	 * Metodo reproducir
	 * @return Reproduciendo titulo de la cancion
	 */
	public String reproducir() {
		return "Reproduciendo"+getTitulo();
	}
	@Override
	/**
	 * Este metodo nos va a devolver el titulo de la cancion ,el artista y la duracion de una cancion 
	 */
	public String toString() {
		return ""+getTitulo()+"-"+getArtista()+"("+getDuracion()+" minutos)";
	}

	/**
	 * Getters y setters
	 * @return
	 */
	public String getTitulo() {
	return titulo;
}
public String getArtista() {
	return artista;
}
public int getDuracion() {
	return duracion;
}
//Setters privado para todos los atributos.
public void setTitulo(String t) {
	if (t.equals(""))
		this.titulo= "Sin titulo";
	else 
		this.titulo=t;
}
public void setArtista(String a) {
	if (a.equals(""))
		this.artista= "Sin artista";
	else 
		this.artista=a;
}
public void setDuracionMinutos(int d) {
	if (d<0)
		this.duracion= 0;
	else 
		this.duracion=d;
}
}