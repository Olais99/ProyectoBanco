package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Clientes;
import Interface.Metodos;

public class LogicaMetodos implements Metodos {
	List<Clientes> lista = new ArrayList<Clientes>();

	@Override
	public void altaCuenta(Clientes cliente) {
		// TODO Auto-generated method stub

		// Validar que no se repita el numCuenta
		for (Clientes c : lista) {
			if (c.getNumCuenta() == cliente.getNumCuenta()) {
				System.out.println("❌ Ya existe un cliente con ese número de cuenta.");
				return;
			}
		}

		lista.add(cliente);
		System.out.println("✅ Cliente registrado exitosamente.");
	}

	@Override
	public void consultarSaldo(int numCuenta) {
		// TODO Auto-generated method stub

		for (Clientes f : lista) {
			if (f.getNumCuenta() == numCuenta) {
				System.out.println("Cliente: " + f.getNombre());
				System.out.println(" Saldo actual: $" + f.getSaldo());
				return;
			}
		}
		System.out.println("❌ No se encontró un cliente con ese número de cuenta.");
	}

	@Override
	public void depositar(int numCuenta, double cantidad) {
		for (Clientes c : lista) {
			if (c.getNumCuenta() == numCuenta) {
				if (cantidad <= 0) {
					System.out.println("❌ La cantidad a depositar debe ser mayor que cero.");
					return;
				}

				double nuevoSaldo = c.getSaldo() + cantidad;
				c.setSaldo(nuevoSaldo);
				System.out.println("✅ Depósito exitoso. Nuevo saldo: $" + nuevoSaldo);
				return;
			}
		}
		System.out.println("❌ No se encontró un cliente con ese número de cuenta.");
	}

	@Override
	public void retirar(int numCuenta, double cantidad) {
		for (Clientes c : lista) {
			if (c.getNumCuenta() == numCuenta) {
				if (cantidad <= 0) {
					System.out.println("La cantidad a retirar debe ser mayor que cero.");
					return;
				}

				if (c.getSaldo() < cantidad) {
					System.out.println("❌ Fondos insuficientes. Saldo disponible: $" + c.getSaldo());
					return;
				}

				c.setSaldo(c.getSaldo() - cantidad);
				System.out.println(" Retiro exitoso. Nuevo saldo: $" + c.getSaldo());
				return;
			}
		}
		System.out.println(" No se encontró un cliente con ese número de cuenta.");
	}

}
