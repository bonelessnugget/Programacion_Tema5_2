import java.util.Scanner;
public class Main {
/*
 * private String nombre;
private String estadoCivil; C / S
private String turno; D / N
private int titulacion; 0 a 4
private int anosEmpresa;
 */
	public static void main(String[] args) {
	Trabajador trabajador = new Trabajador();
	trabajador.introducirDatos();
	trabajador.verDatos();
	trabajador.calcularNomina();
//	Trabajador danielPaun = new Trabajador();
//	danielPaun.introducirDatos();
//	danielPaun.verDatos();
//	danielPaun.calcularNomina();
	}
}
