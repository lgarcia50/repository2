/**
 * 
 */
package ut621;

/**
 * @author lucia
 *
 */
public class contador {

public int cont;
	
	public  contador() {}
	
	public  contador(int cont) {
		setCont(cont);
	}
	
	public contador(contador contador2) {
		this.cont=contador2.cont;
	}
	
	public int getCont() {
		return cont;
	}
	
	public void setCont(int cont) {
		if(cont<0) {
			this.cont=0;
		}else {
			this.cont=cont;
		}
	}
	public void incrementar() {
		cont++;
	}
	public void decrementar() {
		cont--;
		if(cont<0) {
			cont=0;
		}
	}
	
	
	
}
