/*
 * Sea la clase CuentaCorriente, cuyos atributos son, al menos: titular (string), saldo
(float) y codigo (único para cada cuenta, string de 8 dígitos numéricos, filtrado).
Diseñar la clase para poder realizar las siguientes operaciones:
 IngresarDinero, actualizando el saldo.
 RetiraDinero, actualizando el saldo siempre que sea posible; para ello habrá otro
método llamado PuedoSacar que devolverá true si hay saldo suficiente y false si
no lo hay. En caso de no haber saldo se avisará con un mensaje indicando el
hecho y un "pulse return".
 */
import java.util.Scanner;
public class CuentaCorriente {
private String titular;
private float saldo;
private String codigo;
private Scanner teclado = new Scanner(System.in);
private float cantidad;
//Constructor
public CuentaCorriente() {
}
//Metodos

public void ingresarDatos() {
	System.out.println("Introduce el nombre: ");
	titular = teclado.next();
	System.out.println("Introduce el saldo: ");
	saldo = teclado.nextFloat();
	System.out.println("Introduce tu código: ");
	codigo = teclado.next();
	while (codigo.length()<8 || codigo.length() > 8) {
		System.out.println("El codigo tiene menos de 8 caracteres," + "\n" +
	"vuelve a introducirlo.");
		codigo = teclado.next();
	}
}

public void ingresarSaldo() {
	System.out.println("Tu saldo es " + saldo);
	System.out.println("Introduce la cantidad: ");
	cantidad = teclado.nextFloat();
	saldo += cantidad;
	System.out.println("Tu nuevo saldo es: " + saldo);
}

public void retirarSaldo() {
	System.out.println("Tu saldo es: " + saldo);
	System.out.println("Introduce la cantidad a retirar:");
	cantidad = teclado.nextFloat();
	saldo -= cantidad;
	System.out.println("Tu nuevo saldo es: " + saldo);
}

//Getters y Setters

public String getTitular() {
	return titular;
}

public void setTitular(String nombre) {
	
}

public float getSaldo() {
	return saldo;
}

public void setSaldo(float cantidad) {
	
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String cod) {
	
}

}
