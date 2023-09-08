package Banco;

public abstract class Cuenta {
	protected String numeroCuenta;
	protected String fechaApertura;
	protected String saldo;
	private Sucursal sucursal;
	private Cliente cliente;
	public Cuenta(String numeroCuenta, String fechaApertura, String saldo, Sucursal sucursal, Cliente cliente) {
		this.numeroCuenta = numeroCuenta;
		this.fechaApertura = fechaApertura;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.cliente = cliente;
	}
	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public String getSaldo() {
		return this.saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public abstract String getTipo();

	public Sucursal getSucursal() {
		return this.sucursal;
	}
}