/*
 * Desarrollar un programa en Java que utilice una clase que se llame Hora con
miembros de tipo int para hora, minutos y segundos. Deberá tener un constructor
para inicializar la hora a 0 o a una hora determinada (hora, minutos, segundos).Se
deberá poder sumar y restar horas, así como imprimir y leer una hora. El formato de
impresión y lectura será hh:mm:ss, todo en modo 24 horas.
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		boolean funcionando = true;
		Scanner teclado = new Scanner(System.in);
		int op;
		Hora hora = new Hora();
		do {
			System.out.println("1. Establecer una hora.");
			System.out.println("2. Ver hora.");
			System.out.println("3. Sumar hora.");
			System.out.println("4. Restar hora.");
			System.out.println("5. Salir.");
			op = teclado.nextInt();
			switch(op) {
			case 1: {
				hora.leerHora();
				break;
			}
			case 2: {
				hora.verHora();
				break;
			}
			case 3: {
				hora.sumarHora();
				break;
			}
			case 4: {
				hora.restarHora();
				break;
			}
			case 5: {
				funcionando = false;
			}
			}
		}while (funcionando == true);

	}

}
