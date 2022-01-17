/*
 * 
/*
 * Desarrollar un programa en Java que utilice una clase que se llame Indicador que
sea la representación de un indicador de la vida real (indicadores de nivel, de
velocidad, tacómetros, etc.). Deberá tener los mínimos elementos para representar
valores, ajustarlos con un valor de inicio, imprimir el valor, modificarlos a un valor
determinado e incrementar y disminuir el valor con el que cuentan.
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		boolean funcionando = true;
		int op;
		Scanner teclado = new Scanner(System.in);
		Indicador indicador = new Indicador();
		do {
			System.out.println("Que quieres hacer: ");
			System.out.println("1: Valor inicial.");
			System.out.println("2: Incrementar valor.");
			System.out.println("3: Decrementar valor.");
			System.out.println("4: Insertar valor determinado.");
			System.out.println("5: Salir.");
			op = teclado.nextInt();
			switch (op) {
			case 1: {
				indicador.setValorInicial();
				System.out.println("El valor es: " + indicador.getValor());
				break;
			}
			case 2: {
				indicador.aumentarValor();
				System.out.println("El valor es: " + indicador.getValor());
				break;
			}
			case 3: {
				indicador.disminuirValor();
				System.out.println("El valor es: " + indicador.getValor());
				break;
			}
			case 4: {
				indicador.setValorDeterminado();
				System.out.println("El valor es: " + indicador.getValor());
				break;
			}
			case 5: {
				funcionando = false;
			}
			}
		}while (funcionando == true);
	}

}
