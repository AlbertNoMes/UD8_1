package main;

public class Persona {

	// Definimos hombre por defecto con una CONSTANTE
	private final char SEXO = 'H';

	// Atributos de clase
	// Definimos los atributos y como no queremos que se acceda desde otra clase,
	// los ponemos en private
	// private bloquea el acceso de estas variables solo al ambito de la clase
	private String nombre; // Podriamos dejarlo asi o en cadena vacia " "
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;

	// Constructor 1 - Por defecto
	// Los constructores de la clase deben ser del tipo public
	public Persona() {
		// Voy a que cuando instancie la clase tenga que pasarle el atributo nombre
		this.nombre = "";
		this.edad = 0;
		this.DNI = "";
		this.sexo = SEXO;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	// Constructor 2
	public Persona(String nombreVal, int edadVal, char sexoVal) {
		this.nombre = nombreVal;
		this.edad = edadVal;
		this.DNI = "12345678X";
		this.sexo = sexoVal;
		this.peso = 90.0;
		this.altura = 173.0;
	}

	// Generar un constructor con boton derecho source generate constructor using
	// fields
	public Persona(String nombre, int edad, String dNI, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	// Getters y setters - source getters and setters. Nos permiten cambiar el valor
	// de determinados atributos cuando ya se ha creado el objeto

	// Generar el metodo toString para pintarlo Source generate tostring
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	// Ya tenemos una clase que define atributos, 3 constructores y el metodo
	// tostring
	// Vamos a instanciarlo en mainAPP
}
