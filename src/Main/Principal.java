package Main;

import java.util.Scanner;
import Dominio.Clientes;
import Implementacion.LogicaMetodos;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reserva de espacio de memoria
		Scanner lectura = null;
		int numCuenta, menuPrin;
		String nombre;
		String correo;
		double saldo = 0.0;
		String estatus = "Activo";
		// nueva funcion 
		float numero1=3.1416f;
				System.out.println("el resultado de pi es =" + numero1);
				System.out.println("otra modificacion más ");
	float numero2=3.1416f;
				System.out.println("el resultado de pi es =" + numero1);

		Clientes cliente;
		LogicaMetodos imp = new LogicaMetodos();
		do {
			System.out.println("Menú BANCOMER Bienvenido");
			System.out.println("1--- Alta cliente");
			System.out.println("2--- consultar saldo ");
			System.out.println("3--- deposito de efectivo ");
			System.out.println("4---Retiro de efectivo");
			System.out.println("5--- salir");
			System.out.println("Fin del proyecto");

			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();
			switch (menuPrin) {
			case 1:
				try {
					System.out.print("Ingresa número de cuenta: ");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					System.out.print("Ingresa nombre: ");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					System.out.print("Ingresa correo: ");
					lectura = new Scanner(System.in);
					correo = lectura.nextLine();

					;

					cliente = new Clientes(numCuenta, nombre, correo, saldo, estatus);
					imp.altaCuenta(cliente);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("error al guardar " + e.getMessage());
				}
				break;

			case 2:
				System.out.println("introduce el numero de cuenta");
				lectura = new Scanner(System.in);
				numCuenta = lectura.nextInt();
				imp.consultarSaldo(numCuenta);
				break;
			case 3:
				try {
					System.out.print("Introduce el número de cuenta para depositar: ");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					System.out.print("Introduce la cantidad a depositar: ");
					lectura = new Scanner(System.in);
					double cantidad = lectura.nextDouble();

					imp.depositar(numCuenta, cantidad);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Deposito erroneo");
				}
				break;
			case 4:
				try {
					System.out.print("Introduce el número de cuenta para retirar: ");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					System.out.print("Introduce la cantidad a retirar: ");
					lectura = new Scanner(System.in);
					double retiro = lectura.nextDouble();

					imp.retirar(numCuenta, retiro);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Retiro Invalido");
				}
				break;
			case 5 :
				break;
			}
		} while (menuPrin < 6);

	}

}

