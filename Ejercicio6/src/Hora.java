/*
 * Desarrollar un programa en Java que utilice una clase que se llame Hora con
miembros de tipo int para hora, minutos y segundos. Deberá tener un constructor
para inicializar la hora a 0 o a una hora determinada (hora, minutos, segundos).Se
deberá poder sumar y restar horas, así como imprimir y leer una hora. El formato de
impresión y lectura será hh:mm:ss, todo en modo 24 horas.
 */
import java.util.Scanner;
public class Hora {
	private int h;
	private int m;
	private int s;
	private Scanner teclado = new Scanner(System.in);
	
	
	public Hora() {
		System.out.println("Quieres establecer una hora?");
		String op = teclado.next();
		switch (op) {
		case "si":{
			System.out.println("Introduce la hora: ");
			this.h = teclado.nextInt();
			System.out.println("Introduce los minutos: ");
			this.m = teclado.nextInt();
			System.out.println("Introduce los segundos: ");
			this.s = teclado.nextInt();
		}
		
		case "no": {
			this.h = 0;
			this.m = 0;
			this.s = 0;
		}
		}
	}
	
	void leerHora() {
		System.out.println("Introduce la hora:");
		h = teclado.nextInt();
		System.out.println("Introduce los minutos: ");
		m = teclado.nextInt();
		System.out.println("Introduce los segundos:");
		s = teclado.nextInt();
		if (s >= 60) {
			s = 0;
			m +=1;
			if (m >= 60) {
				m = 0;
				h += 1;
			}
		}
	}
	
public void sumarHora() {
		System.out.println("Introduce una hora:");
		h += teclado.nextInt();
		System.out.println("Introduce minutos: ");
		m += teclado.nextInt();
		System.out.println("Introduce segundos: ");
		s += teclado.nextInt();
		if (s >= 60) {
			s = 0;
			m +=1;
			if (m >= 60) {
				m = 0;
				h += 1;
			}
		}
	}
	
	public void restarHora() {
		System.out.println("Introduce una hora:");
		h -= teclado.nextInt();
		System.out.println("Introduce minutos: ");
		m -= teclado.nextInt();
		System.out.println("Introduce segundos: ");
		s -= teclado.nextInt();
		if (m <= 0) {
			m = 0;
			s = 59;
		}
	}
	public void verHora() {
		System.out.println(h+":"+m+":"+s);
	}
	
}
