package dominio;

public class Cliente {
	
	private String primerNombre;
	private String apellido;
	// Atributos para la agregación
	private Cuenta[] cuentas = new Cuenta[5];
	private int numeroDeCuentas = 0;
	
	public Cliente(String p, String a) {
		primerNombre=p;
		apellido=a;
	}
	public  String getPrimerNombre() {
		return primerNombre;
	}
	public String getApellido() {
		return apellido;
	}

	public Cuenta getCuenta(int indiceCuenta) {
		return cuentas[indiceCuenta];
	}
	public void agregaCuenta(Cuenta cuenta) {
		int i = numeroDeCuentas++;
		cuentas[i] = cuenta;
	}
	public int getNumeroDeCuentas() {
		return numeroDeCuentas;
	}
}
