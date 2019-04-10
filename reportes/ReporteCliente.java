package reportes;
import java.text.NumberFormat;
import dominio.*;

	public class ReporteCliente {

		  public void generarReporte() {
			  Banco banco = Banco.getBanco();  
		    NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance();
		    Cliente     cliente;

		    System.out.println("\t\t\tREPORTE DE CLIENTES");
		    System.out.println("\t\t\t====================");

		    for ( int indiceCliente = 0; indiceCliente < banco.getNumeroDeClientes(); indiceCliente++ ) {
		      cliente = banco.getCliente(indiceCliente);

		      System.out.println();
		      System.out.println("Cliente: "
					 + cliente.getApellido() + ", "
					 + cliente.getPrimerNombre());

		      for ( int indiceCuenta = 0; indiceCuenta < cliente.getNumeroDeCuentas(); indiceCuenta++ ) {
			Cuenta cuenta = cliente.getCuenta(indiceCuenta);
			String  tipoCuenta = "";

			// Determinar el tipo de cuenta
			if ( cuenta instanceof CajaDeAhorro ) {
			  tipoCuenta = "Caja de Ahorro";
			} else if ( cuenta instanceof CuentaCorriente ) {
			  tipoCuenta = "Cuenta Corriente";
			} else {
			  tipoCuenta = "Tipo de Cuenta Desconocido";
			}

			// Imprimir el balance actual de la cuenta
			System.out.println("    " + tipoCuenta + ": el balance actual es "
					 + formatoMoneda.format(cuenta.getBalance()));
		      }
		    }
		  }


}
