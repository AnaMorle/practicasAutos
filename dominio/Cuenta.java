package dominio;

public class Cuenta {
	
	protected double balance;
	
	public Cuenta(double balanceInicial) {
		balance=balanceInicial;
	}
	public double getBalance() {
		return balance;
	}
	public boolean deposita(double dineroIn) {
		balance =balance + dineroIn;
		return true;
	}
	 public boolean retira(double cantidad) {
		    boolean resultado = true;
		    if ( balance < cantidad ) {
		      resultado = false;
		    } else {
		      balance = balance - cantidad;
		    }
		    return resultado;
		  }

}
