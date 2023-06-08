import java.util.Random;

public class CuentaCorriente {
	
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;
	
	public CuentaCorriente (String NombreTitular, double saldo) {
		this.saldo =saldo;
		this.nombreTitular = NombreTitular;
		Random rnd = new Random();
		numeroCuenta = Math.abs(rnd.nextLong());
	}
	
	public void setIngreso (double ingreso) {
		 
		if (ingreso < 0)
			System.out.println("No se permiten ingresos negativos");
		else
			saldo += ingreso;
	}
	
	public void setReintegro (double reintegro) {
		
		if (saldo - reintegro < 0) {
			
			System.out.println("Saldo insuficente para realizar el reintegro");
		
		} else
		saldo -=reintegro;
	}
	
	public double getSaldo() {
		
		return saldo;
	}
	
	public String getDatosCuenta() {
		
		return "Titular: " + nombreTitular + "\n" + "Nº de Cuenta: " + numeroCuenta + "\n" + "Saldo: " + saldo;
	}
	
	
	public static void Transferencia (CuentaCorriente titu1, CuentaCorriente titu2, double cantidad) {
		
		if (titu1.saldo - cantidad <0) {
			
			System.out.println("Saldo insuficente para realizar la transferencia");

		} else {
			titu1.saldo -= cantidad;
			titu2.saldo += cantidad;
			System.out.println("Transferencia realizada por " + titu1.nombreTitular + " a la cuenta de " + titu2.nombreTitular + " por el importe de " + cantidad +"€");

		}
	}

}




