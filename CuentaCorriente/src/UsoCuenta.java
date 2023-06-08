public class UsoCuenta {
	
	public static void main(String[] args) {
		
		CuentaCorriente cuenta1 = new CuentaCorriente ("Juan Gómez", 1500);
		CuentaCorriente cuenta2 = new CuentaCorriente ("María López", 2500);
		CuentaCorriente.Transferencia(cuenta1, cuenta2, 200);
		System.out.println(cuenta1.getDatosCuenta());
		System.out.println(cuenta2.getDatosCuenta());
		
	}
}