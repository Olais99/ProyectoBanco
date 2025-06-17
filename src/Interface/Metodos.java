package Interface;

import Dominio.Clientes;

public interface Metodos {
	
public void altaCuenta (Clientes cliente);

public void consultarSaldo (int numCuenta);

public void depositar(int numCuenta, double cantidad);

public void retirar(int numCuenta, double cantidad);


}
