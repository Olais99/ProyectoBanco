package Dominio;

public class Clientes {
	private int numCuenta;
	private String nombre;
	private String correo;
	private double saldo;
	private String estatus;
	public Clientes(int numCuenta, String nombre, String correo, double saldo, String estatus) {
		this.numCuenta = numCuenta;
		this.nombre = nombre;
		this.correo = correo;
		this.saldo = saldo;
		this.estatus = estatus;
	}
	@Override
	public String toString() {
		return "Clientes [numCuenta=" + numCuenta + ", nombre=" + nombre + ", correo=" + correo + ", saldo=" + saldo
				+ ", estatus=" + estatus + "]\n";
		
	}
	public int getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

}
