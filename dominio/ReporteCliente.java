package dominio;

public class ReporteCliente {

	public void generarReporte() {
		Banco banco = Banco.getBanco();
	//	NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance();
		Cliente cliente;

		System.out.println("\t\t\tREPORTE DE CLIENTES");
		System.out.println("\t\t\t====================");

		for (int indiceCliente = 0; indiceCliente < banco.getNumeroDeClientes(); indiceCliente++) {
			cliente = banco.getCliente(indiceCliente);

			System.out.println();
			System.out.println("Cliente: " + cliente.getApellido() + ", "
					+ cliente.getPrimerNombre());

			for (int indiceCuenta = 0; indiceCuenta < cliente
					.getNumeroDeCuentas(); indiceCuenta++) {
				Cuenta cuenta = cliente.getCuenta(indiceCuenta);
				String tipoCuenta;
				
				if(cuenta instanceof CuentaCorriente) {
					
					tipoCuenta=" Cuenta Corriente: ";
					System.out.println(tipoCuenta + "el balance actual es " + cuenta.getBalance());
				}else if(cuenta instanceof CajaDeAhorro) {
					tipoCuenta=" Caja de ahorro: ";
					System.out.println(tipoCuenta + "el balance actual es " + cuenta.getBalance());
				}else {
					System.out.println("Cuenta descanocida");
				}

			}
		}
	}

}
