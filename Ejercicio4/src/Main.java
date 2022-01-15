import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opciones;
		boolean funcionando = true;
		CuentaCorriente banco = new CuentaCorriente();
		banco.ingresarDatos();
		do {
				System.out.println("Que operacion quieres hacer: ");
				System.out.println("1: Consultar saldo.");
				System.out.println("2: Ingresar dinero.");
				System.out.println("3: Retirar dinero.");
				System.out.println("4: Salir.");
				opciones = teclado.nextInt();	
					switch (opciones) {
					case 1: {
						System.out.println("Tu saldo es " + banco.getSaldo());
						break;
					}
					case 2: {
						banco.ingresarSaldo();
						break;
					}
					case 3: {
						banco.retirarSaldo();
						break;
					}
					case 4: {
						funcionando = false;
					}
				}
			}while (funcionando == true);
			}
}

