package dominio;

public class Banco {
	
	private final int MAX_CLIENTES=10;
	private int numeroDeClientes;
	 private Cliente clientes[];
	 
	 public Banco() {
		clientes=new Cliente[MAX_CLIENTES];
		numeroDeClientes=0;
	 }
	 public static  Banco getBanco() {
		 Banco banco=new Banco();
		 return banco;
	 }
	 public void agregaCliente(String primerNombre, String apellido) {
		 int i = numeroDeClientes++;
		clientes[i] = new Cliente(primerNombre , apellido); 
	 }
	 public Cliente getCliente(int indiceCliente) {
		 return clientes[indiceCliente];
	 }
	 public int getNumeroDeClientes() {
		 return numeroDeClientes;
	 }
}
