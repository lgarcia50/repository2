/**
 * 
 */
package UT5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author anaga
 *
 */
public class Semana5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ncartas = 52;
		int[] lista = new int[4];
		int i;
		int temp = 0;
       
    
	    boolean tipo = true;
		boolean ordenado = true;
			System.out.println("Introduce un numero:");
		for (i=0; i<4;i++ ) {
			System.out.println("Introduce el primer numero" +(i+1)+":"+"");
			lista[i] = sc.nextInt(); 
			
	}
		
		for (i=0; i< lista.length; i++ ) {
			if(i+1 < lista.length) {
				if(lista[i] > lista[i+1]) {
					ordenado = false;
					break;
				}
			}		
	}
		if(ordenado) {
			System.out.println("La lista esta ordenada");
		}else {
			System.out.println("Esta desordenada");
		}
		for (int j=0; j < lista.length; j++) {
			for(int k =j +1; k < lista.length; k++) {
				if (lista [j] < lista[k]) {
					int aux = lista[j];
					lista[j] = lista[k];
					lista[k] = aux;
				}
			}
		}
		System.out.println(Arrays.toString(lista));
		int valor = lista[lista.length - 1];
		System.out.println("Falta el" + (++valor)+ "para ordenar");
		
		
		}
		}
	
