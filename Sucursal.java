package Banco;

import java.io.DataInput;
import java.util.ArrayList;
import Banco.Cuenta;

public class Sucursal {
	private int idSucursal;
	private String direccion;
	private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
	public Sucursal(int idSucursal, String direccion, ArrayList<Cuenta> cuentas){
		this.idSucursal = idSucursal;
		this.direccion = direccion;
		this.cuentas = cuentas;
	}

	public int getIdSucursal() {
		return this.idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Cuenta> getCuentas() {
		return this.cuentas;
	}

}