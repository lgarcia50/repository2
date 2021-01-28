/**
 * 
 */
package ej22;
/**
 * @author lucia
 *
 */
public class Libro {
	private String Titulo;
   private String Autor;
   private int NumEjemplares;
   private int NumPrestados;
   /**
    * Constructor
    */
   public Libro() {}
   /**
    * 
    * @param titulo
    * @param autor
    * @param numeroEjemplares
    * @param numPrestados
    */
   public Libro(String titulo, String autor, int numeroEjemplares, int numPrestados) {
	  this.Titulo=titulo;
	  this.Autor=autor;
	  this.NumEjemplares=numeroEjemplares;
	  this.NumPrestados=numPrestados;
}

	public void prestamo() {
		if(NumEjemplares>NumPrestados) {
			NumPrestados++;
			System.out.println("El prestamo se ha efectuado");
		}else {
			System.out.println("No se puede prestar el libro");
		}
			
		
	}
	public void devolver() {
		if(NumPrestados==0) {
			System.out.println("Este libro no se ha prestado, no se ha devuelto");
		}else {
			NumPrestados--;
			System.out.println("Devolucion con exito");
	}
	}
	/**
	*@Override
	*/
	@Override
    public String toString() {
    	return "Titulo del Libro:" +getTitulo() +"\nNombre del autor:" +getAutor() +"\nEjemplares del libro:" +getEjemplares() +"\nLibros prestados:" +getNumPrestados();
    }
    
   
	// metodos
        // metodos Setters/getters
    /**
     * 
     * @return titulo
     */
public String getTitulo() {
		return Titulo;
	}
 public void setTitulo(String titulo) {
	 Titulo=titulo;
 }
 /**
  * 
  * @return autor
  */
 public String getAutor() {
	 return Autor;
   }
 public void setAutor(String autor) {
	 Autor=autor;
 }
 /**
  * 
  * @return Ejemplares
  */
 public int getEjemplares( ) {
	 return NumEjemplares;
 }
 public void setEjemplares(int i, int j, int NumEjemplares) {
	 this.NumEjemplares= NumEjemplares;
 }
	/**
	 * 
	 *  @return Pretados
	 */
 public int getNumPrestados() {
	 return NumPrestados;
 }
 public void setPrestados(int i, int j, int NumPrestados) {
	this.NumPrestados= NumPrestados;
 }
 //Comprobaciones
 public void prestamos(int prestados){
	 if(prestar() == true) {
		 prestados++;
	 }
 }
	public boolean prestar() {
		boolean dp = false;
		int prestados = 0;
		if(prestados < getEjemplares()) {
			dp = true;
			prestados ++;
		}else {
			dp = false;
		}
		return dp;
}
		public boolean devolucion(int prestamo) {
			boolean dp = false;
			if(getNumPrestados() >0) {
				dp =true;
			}else {
				dp=false;
			}
			return dp;
		}
		// Funciones calculo datos
			public int Restantes() {
				int rest= getEjemplares() - getNumPrestados();
				return rest;
			}
}
			

