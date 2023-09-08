package Banco;

public class CuentaAhorro extends Cuenta {
	private double reajusteAnual;

	public CuentaAhorro(String numeroCuenta, String fechaApertura, String saldo, Sucursal sucursal, Cliente cliente, double reajusteAnual) {
		super(numeroCuenta, fechaApertura, saldo, sucursal, cliente);
		this.reajusteAnual = reajusteAnual;
	}

	public double getReajusteAnual() {
		return this.reajusteAnual;
	}

	public void setReajusteAnual(double reajusteAnual) {
		this.reajusteAnual = reajusteAnual;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

}