package dominio;

public class CuentaCorriente extends Cuenta{
	
/*	double proteccionSobregiro;
	private static final double SIN_PROTECTION = -1.0;

public CuentaCorriente(double balance) {
		
		super(balance);
	}
public CuentaCorriente(double balance, double proteccion) {
	
	super(balance);
	proteccionSobregiro=proteccion;
}
public boolean retira(double dineroOut) {
	boolean resultado =true;
	
	if(balance < dineroOut) {
		// No hay suficiente saldo para el retiro solicitado
		// Verificar que en caso que exista haya suficiente protección de
		// sobregiro
		double sobregiroNecesario = dineroOut - balance;
		if ((proteccionSobregiro == SIN_PROTECTION)
				|| (proteccionSobregiro < sobregiroNecesario)) {

			// No hay suficiente protección de giro para la cantidad
			// solicitada
			resultado = false;
		} else {

			// Hay suficiente protección de giro para la cantidad solicitada
			// y cubre
			balance = 0.0;
			proteccionSobregiro = proteccionSobregiro - sobregiroNecesario;
		}

	} else {

		// Hay suficiente para la cantidad solicitada
		// Proceder normalmente
		balance = balance - dineroOut;
	}

	return resultado;
}  */
	
	//Codigo para ejercicio 2 Capitulo 4
	
	private static final double SIN_PROTECTION = -1.0;

	  private double proteccionSobregiro;

	  public CuentaCorriente(double bal, double proteccion) {
	    super(bal);
	    proteccionSobregiro = proteccion;
	  }
	  public CuentaCorriente(double bal) {
	    this(bal, SIN_PROTECTION);
	  }

	  public boolean retira(double cantidad) {
	    boolean resultado = true;

	    if ( balance < cantidad ) {

	      // No hay suficiente saldo para el retiro solicitado
	      // Verificar que en caso que exista haya suficiente protección de sobregiro
	      double sobregiroNecesario = cantidad - balance;
	      if (   (proteccionSobregiro == SIN_PROTECTION)
		  || (proteccionSobregiro < sobregiroNecesario)   ) {

		// No hay suficiente protección de giro para la cantidad solicitada
		resultado = false;
	      } else {

		// Hay suficiente protección de giro para la cantidad solicitada y cubre
		balance = 0.0;
		proteccionSobregiro = proteccionSobregiro - sobregiroNecesario;
	      }

	    } else {

	      // Hay suficiente  para la cantidad solicitada
	      // Proceder normalmente
	      balance = balance - cantidad;
	    }

	    return resultado;
	  }
}

