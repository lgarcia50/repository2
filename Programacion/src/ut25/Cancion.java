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
	private double duracion;
	
	/**
	 * Constructor vacio
	 */
	public Cancion() {}
	/**
	 * Constructor con parametos
	 * @param titulo Nombre cancion 
	 * @param artista Nombre artista 
	 * @param duracion Duracion de la cancion 
	 */
	public Cancion(String titulo, String artista, float duracion) {
		this.titulo=titulo;
		this.artista=artista;
		this.duracion= duracion;
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

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	}