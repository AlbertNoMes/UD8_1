/*
 * AUTOR: ALBERT NOTARIO MESTRES
 * DATA: 24/01/22
 */

package main;

public class mainAPP {

	public static void main(String[] args) {
		// Instancio la clase persona y creo el objeto persona
		Persona p1 = new Persona(); // Llamada a la clase Persona dentro del mismo package (main)
		// Vamos a crear 2 objetos mas
		Persona p2 = new Persona("Albert Notario", 33, 'H');
		Persona p3 = new Persona("Elena", 27, "12345678E", 'M', 55., 1.60);

		// Imprimimos el metodo tostring para ver los cambios
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}
}
