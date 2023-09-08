package Banco;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        iniciarGestion();
}

    public static void iniciarGestion() {
        // Crear algunas cuentas
        Cliente cliente1 = new Cliente("Diego", "Poveda" , new ArrayList<>());
        Cliente cliente2 = new Cliente("Maria", "Gomez", new ArrayList<>());

        // Crear algunas sucursales
        Sucursal sucursal1 = new Sucursal(1, "Rodriguez 198", new ArrayList<>());
        Sucursal sucursal2 = new Sucursal(2, "Anibal Pinto 10", new ArrayList<>());
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro("001", "01/01/2023", "150000", sucursal1, cliente1, 0.02);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("002", "01/01/2023", "20000", sucursal2, cliente2, 500);
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro("100", "20/04/2020", "10000", sucursal1, cliente1, 0.03);

        // Agregar cuentas a las sucursales
        sucursal1.getCuentas().add(cuentaAhorro1);
        sucursal2.getCuentas().add(cuentaCorriente1);
        sucursal1.getCuentas().add(cuentaAhorro2);

        // Crear una instancia de GestionBanco
        GestionBanco gestionBanco = new GestionBanco();

        // Agregar sucursales y clientes
        gestionBanco.agregarSucursalBancaria(sucursal1);
        gestionBanco.agregarSucursalBancaria(sucursal2);
        gestionBanco.agregarCliente(cliente1);
        gestionBanco.agregarCliente(cliente2);

        // Asociar cuentas a clientes
        gestionBanco.agregarCuentaBancariaACliente("Juan", cuentaAhorro1);
        gestionBanco.agregarCuentaBancariaACliente("Maria", cuentaCorriente1);
        gestionBanco.agregarCuentaBancariaACliente("Diego", cuentaAhorro1);
        gestionBanco.agregarCuentaBancariaACliente("Diego", cuentaAhorro2);

        // Mostrar cuentas de un cliente
        gestionBanco.mostrarCuentasDeCliente("Juan");
        gestionBanco.mostrarCuentasDeCliente("Diego");
        // Obtener cuentas de ahorro de una sucursal
        ArrayList<CuentaAhorro> cuentasDeAhorro = gestionBanco.obtenerCuentasDeAhorroDeSucursal(1);

        // Obtener cuentas corrientes de una sucursal
        ArrayList<CuentaCorriente> cuentasCorrientes = gestionBanco.obtenerCuentasCorrientesDeSucursal(2);
    }
    }

