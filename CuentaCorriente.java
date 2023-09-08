package Banco;

public class CuentaCorriente extends Cuenta {
	private int lineaSobregiro;

	public CuentaCorriente(String numeroCuenta, String fechaApertura, String saldo, Sucursal sucursal, Cliente cliente, int lineaSobregiro) {
		super(numeroCuenta, fechaApertura, saldo, sucursal, cliente);
		this.lineaSobregiro = lineaSobregiro;
	}

	public int getLineaSobregiro() {
		return this.lineaSobregiro;
	}

	public void setLineaSobregiro(int lineaSobregiro) {
		this.lineaSobregiro = lineaSobregiro;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

	public void CuentaCorriente(String numeroCuenta, String fechaApertura, String saldo, int lineaSobregiro) {
		throw new UnsupportedOperationException();
	}
}