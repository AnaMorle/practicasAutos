package dominio;

public class CajaDeAhorro extends Cuenta{
	
/*  public double interes;
	
	public CajaDeAhorro(double balance, double porcentajeInteres) {
		
		super(balance);
	}  */// Ejercicio 1 Capitulo 4
	
	
//Codigo dado para el ejercicio 2 Capitulo 4
	
	private final double PORCENTAJE_CAJA_AHORRO;

	public CajaDeAhorro(double bal, double porcentaje) {
		super(bal);
		PORCENTAJE_CAJA_AHORRO = porcentaje;
	}

	public double getPorcentajeInteres() {
		return PORCENTAJE_CAJA_AHORRO;
	}

	 public boolean retira(double cantidad) {
		    boolean resultado = true;

		    if ( balance < cantidad ) {
				// No hay suficiente protección de giro para la cantidad solicitada
			resultado = false;
		      } else {

		      // Hay suficiente  para la cantidad solicitada
		      // Proceder normalmente
		      balance = balance - cantidad;
		    }
		    return resultado;
		  }
}
