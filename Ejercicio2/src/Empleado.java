/*
 * Crear una clase llamada Empleado que contenga como datos miembro el nombre y
el n�mero de empleado, y como m�todos miembro leerDatos( ) para leer los datos
desde teclado y verDatos( ) para mostrarlos en pantalla, adem�s de los getters y
setters que sean necesarios.
 */
import java.util.Scanner;
public class Empleado {
private String nombre;
private int numeroEmpleado;
Scanner teclado = new Scanner(System.in);

//Getters y Setters

String getNombre() {
	return nombre;
}

void setNombre(String nombre) {
this.nombre = nombre;
}

void setNumeroEmpleado (int numeroEmpleado) {
this.numeroEmpleado = numeroEmpleado;
}

int getNumeroEmpleado() {
	return numeroEmpleado;
}

//Metodos

void verDatos() {
	System.out.println("El nombre del empleado es: " + nombre  + " y su n�mero"
			+ " de empleado es: " + numeroEmpleado);
}

void leerDatos() {
	System.out.println("Introduce el nombre del empleado: ");
	nombre = teclado.nextLine();
	setNombre(nombre);
	System.out.println("Introduce el n�mero del empleado: ");
	numeroEmpleado = teclado.nextInt();
	setNumeroEmpleado(numeroEmpleado);
	
}
}
