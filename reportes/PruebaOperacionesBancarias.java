package reportes;

import dominio.*;

public class PruebaOperacionesBancarias {

  public static void main(String[] args) {
  /*  Cuenta  cuenta;

    // crea una cuenta que tiene 500.00 de balance.
    System.out.println("Creando una cuenta con 500.00 de balance.");
    cuenta = new Cuenta(500.00);
    Cliente cliente = new Cliente("Juan", "Perez");
    cliente.setCuenta(cuenta);

    System.out.println("Retira 150.00");
    cuenta.retira(150.00);

    System.out.println("Deposita 22.50");
    cuenta.deposita(22.50);

    System.out.println("Retira 47.62");
    cuenta.retira(47.62);

    // Imprime el balance final
    System.out.println("La cuenta tiene un balance de " + cuenta.getBalance());
    System.out.println("Cliente [" + cliente.getApellido() +", "
    		+ "" + cliente.getPrimerNombre() + "] tiene un balance de " + cuenta.getBalance());
    System.out.println("Intentando retirar 200:" + cuenta.retira(200));
    
    // Imprime el balance final
    System.out.println("La cuenta tiene un balance de " + cuenta.getBalance());
    System.out.println("Cliente [" + cliente.getApellido() +", " 
    		+ cliente.getPrimerNombre() + "] tiene un balance de " + cuenta.getBalance());
    		*/
	  Banco banco = new Banco();
		Cliente cliente;

	/*	// Crear algunos clientes
		banco.agregaClientes("Juan", "Pérez");
		banco.agregaClientes("Pedro", "García");
		banco.agregaClientes("Oscar", "Toma");
		banco.agregaClientes("Maria", "Soley");
		
		for(int i = 0; i < banco.getNumeroDeClientes(); i++){
			cliente = banco.getCliente(i);
			System.out.println("Cliente [" + i + "] es " 
					+ cliente.getPrimerNombre() + " " + cliente.getApellido());
		}*/
		
		System.out.println("Creando al cliente Juan Perez");
		banco.agregaCliente("Juan", "Pérez");
		cliente = banco.getCliente(0);
		cliente.agregaCuenta(new CajaDeAhorro(500.00, 0.03));
		cliente.agregaCuenta(new CuentaCorriente(200.00));

		System.out.println("Creando al cliente Pedro García.");
		banco.agregaCliente("Pedro", "García");
		cliente = banco.getCliente(1);
		cliente.agregaCuenta(new CuentaCorriente(500.00));
		cliente.agregaCuenta(new CajaDeAhorro(380.00, 0.03));

		System.out.println("Creando al cliente Oscar Toma.");
		banco.agregaCliente("Oscar", "Toma");
		cliente = banco.getCliente(2);
		cliente.agregaCuenta(new CuentaCorriente(500.00, 500.00));
		cliente.agregaCuenta(new CajaDeAhorro(700.00, 0.03));

		System.out.println("Creando a la cliente Maria Soley.");
		banco.agregaCliente("Maria", "Soley");
		cliente = banco.getCliente(3);
		// Maria y Oscar tienen una caja de ahorros en común
		cliente.agregaCuenta(banco.getCliente(2).getCuenta(1));

		System.out.println();

		System.out
				.println("Recuperando al cliente Juan Perez y su caja de ahorro.");
		cliente = banco.getCliente(0);
		Cuenta cuenta = cliente.getCuenta(0);
		System.out.println("Retira 150.00: " + cuenta.retira(150.00));
		System.out.println("Deposita 22.50: " + cuenta.deposita(22.50));
		System.out.println("Retira 47.62: " + cuenta.retira(150.00));
		System.out.println("Retira 400.00: " + cuenta.retira(400.00));

		System.out.println();

		System.out
				.println("Recuperando al cliente Pedro García y su cuenta corriente.");
		cliente = banco.getCliente(1);
		cuenta = cliente.getCuenta(0);
		System.out.println("Retira 150.00: " + cuenta.retira(150.00));
		System.out.println("Deposita 22.50: " + cuenta.deposita(22.50));
		System.out.println("Retira 47.62: " + cuenta.retira(150.00));
		System.out.println("Retira 400.00: " + cuenta.retira(400.00));

		System.out.println();

		System.out
				.println("Recuperando al cliente Oscar Toma y su cuenta corriente.");
		cliente = banco.getCliente(2);
		cuenta = cliente.getCuenta(0);
		System.out.println("Retira 150.00: " + cuenta.retira(150.00));
		System.out.println("Deposita 22.50: " + cuenta.deposita(22.50));
		System.out.println("Retira 47.62: " + cuenta.retira(150.00));
		System.out.println("Retira 400.00: " + cuenta.retira(400.00));

		System.out.println();

		System.out
				.println("Recuperando a la cliente Maria Soley y su caja de ahorro unida a su esposo Oscar.");
		cliente = banco.getCliente(3);
		cuenta = banco.getCliente(2).getCuenta(1);
		System.out.println("Deposita 150.00: " + cuenta.deposita(150.00));
		System.out.println("Retira 750.00: " + cuenta.retira(750.00));
		System.out.println();

		ReporteCliente reporte = new ReporteCliente();
		reporte.generarReporte();
		
  }

  }

