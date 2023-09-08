package Banco;

import java.util.ArrayList;
import Banco.Cuenta;

public class Cliente {
	private String nombre;
	private String apellido;
	private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
	public Cliente(String nombre, String apellido, ArrayList<Cuenta> cuentas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuentas = cuentas;
	}
	public void agregarCuenta(Cuenta cuenta) {
		cuentas.add(cuenta);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public ArrayList<Cuenta> getCuentas() {
		return this.cuentas;
	}
}