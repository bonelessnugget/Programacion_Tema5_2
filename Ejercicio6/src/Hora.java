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
			while (m >= 60) {
				m --;
				s ++;
			}
			while (s >= 60) {
				s--;
				m++;
			}
			break;
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
		while (m >= 60) {
			m --;
			s ++;
		}
		while (s >= 60) {
			s--;
			m++;
		}
	}
	
public void sumarHora() {
		System.out.println("Introduce una hora:");
		h += teclado.nextInt();
		System.out.println("Introduce minutos: ");
		m += teclado.nextInt();
		System.out.println("Introduce segundos: ");
		s += teclado.nextInt();
		while (m > 60) {
			m -= 60;
			h++;
		}
		while (s > 60) {
			s-= 60;
			m++;
		}
	}
	
	public void restarHora() {
		System.out.println("Introduce una hora:");
		h -= teclado.nextInt();
		System.out.println("Introduce minutos: ");
		int min = teclado.nextInt();
		System.out.println("Introduce segundos: ");
		int seg = teclado.nextInt();
		while (s < seg) {
			m--;
			s += 60;
		}
		System.out.println(s);
		s = s -seg;
		while (m < min) {
			h--;
			m += 60;
		}
		System.out.println(m);
		m = m - min;
	}
	public void verHora() {
		if (h < 10 && m < 10 && s < 10) {
			System.out.println("0"+h + ":"+"0"+m+":"+"0"+s);
		}else {
			System.out.println(h+":"+m+":"+s);
		}
	}
	
}
