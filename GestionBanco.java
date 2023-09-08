package Banco;

import java.util.ArrayList;
import Banco.Sucursal;
import Banco.Cliente;

public class GestionBanco {
	private ArrayList<Sucursal> sucursal = new ArrayList<Sucursal>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	public void agregarSucursalBancaria(Sucursal sucursal) {
		this.sucursal.add(sucursal);
	}

	public void agregarCuentaBancariaACliente(String nombreCliente, Cuenta cuenta) {
		for (Cliente cliente : clientes) {
			if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
				for (Sucursal sucursal : sucursal) {
					ArrayList<Cuenta> cuentasSucursal = sucursal.getCuentas();
					if (cuentasSucursal.contains(cuenta)) {
						cliente.agregarCuenta(cuenta);
						return;
					}
				}
			}
		}
		System.out.println("El cliente con nombre " + nombreCliente + " no se encuentra en la lista o la cuenta no está en la sucursal.");
	}


	public void mostrarCuentasDeCliente(String nombreCliente) {
		for (Cliente cliente : clientes) {
			if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
				System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
				ArrayList<Cuenta> cuentasCliente = cliente.getCuentas();

				for (Cuenta cuenta : cuentasCliente) {
					System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
					System.out.println("Saldo: " + cuenta.getSaldo());
					System.out.println("Esta cuenta está asociada a la Sucursal " + cuenta.getSucursal().getIdSucursal());
					System.out.println("---");
				}
				return;
			}
		}
		System.out.println("El cliente con nombre " + nombreCliente + " no se encuentra en la lista.");
	}



	public ArrayList<CuentaAhorro> obtenerCuentasDeAhorroDeSucursal(int idSucursal) {
		ArrayList<CuentaAhorro> cuentasDeAhorro = new ArrayList<>();

		for (Sucursal sucursal : sucursal) {
			if (sucursal.getIdSucursal() == idSucursal) {
				ArrayList<Cuenta> cuentasSucursal = sucursal.getCuentas();

				for (Cuenta cuenta : cuentasSucursal) {
					if (cuenta instanceof CuentaAhorro) {
						cuentasDeAhorro.add((CuentaAhorro) cuenta);
					}
				}

				return cuentasDeAhorro; // Retorna la lista de cuentas de ahorro de la sucursal
			}
		}

		// Manejo de casos donde la sucursal no se encuentra
		System.out.println("La sucursal " + idSucursal + " no se encuentra en la lista.");
		return cuentasDeAhorro; // Retorna una lista vacía si la sucursal no se encuentra
	}


	public ArrayList<CuentaCorriente> obtenerCuentasCorrientesDeSucursal(int idSucursal) {
		ArrayList<CuentaCorriente> cuentasCorrientes = new ArrayList<>();

		for (Sucursal sucursal : sucursal) {
			if (sucursal.getIdSucursal() == idSucursal) {
				ArrayList<Cuenta> cuentasSucursal = sucursal.getCuentas();

				for (Cuenta cuenta : cuentasSucursal) {
					if (cuenta instanceof CuentaCorriente) {
						cuentasCorrientes.add((CuentaCorriente) cuenta);
					}
				}

				return cuentasCorrientes; // Retorna la lista de cuentas corrientes de la sucursal
			}
		}

		// Manejo de casos donde la sucursal no se encuentra
		System.out.println("La sucursal con ID " + idSucursal + " no se encuentra en la lista.");
		return cuentasCorrientes; // Retorna una lista vacía si la sucursal no se encuentra
	}

}
