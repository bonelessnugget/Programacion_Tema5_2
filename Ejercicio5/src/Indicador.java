
/*
 * Desarrollar un programa en Java que utilice una clase que se llame Indicador que
sea la representación de un indicador de la vida real (indicadores de nivel, de
velocidad, tacómetros, etc.). Deberá tener los mínimos elementos para representar
valores, ajustarlos con un valor de inicio, imprimir el valor, modificarlos a un valor
determinado e incrementar y disminuir el valor con el que cuentan.
 */
import java.util.Scanner;

public class Indicador {
	private float valor = 0;
	private float decremento;
	private float incremento;
	private Scanner teclado = new Scanner(System.in);

//Metodos
	public void setValorInicial() {
		System.out.println("Introduce un valor inicial: ");
		valor = teclado.nextFloat();
	}
	
	public void setValorDeterminado() {
		System.out.println("Introduce un valor: ");
		valor = teclado.nextFloat();
	}
	
	public void disminuirValor() {
		System.out.println("Introduce la cantidad a disminuir: ");
		decremento = teclado.nextFloat();
		valor -= decremento;
		System.out.println("El nuevo valor es " + valor);
	}

	public void aumentarValor() {
		System.out.println("Introduce la cantidad a aumentas: ");
		incremento = teclado.nextFloat();
		valor += incremento;
		System.out.println("El nuevo valor es  " + valor);
	}

//Getters y Setters

	public float getValor() {
		return valor;
	}

}
