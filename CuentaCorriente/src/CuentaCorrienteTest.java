import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {
	
	private CuentaCorriente una_cuenta;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		una_cuenta = new CuentaCorriente("Antonio Collado", 25000);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testSetIngreso() {
		// Creamos una instancia de CuentaCorriente
		//System.out.println("Inicio TestSetIngreso");
		CuentaCorriente cuenta = new CuentaCorriente("Belen Tejera", 500);
		double cantidad = 100;
		double resulEsperado = 600;
		cuenta.setIngreso(cantidad);
		assertEquals(resulEsperado, cuenta.getSaldo(), 0);
		//System.out.println("Fin TestSetIngreso");
	}

	@Test
	void testSetIngresoNegativo() {
		//System.out.println("Inicio TestSetIngresoNegativo");
		// Creamos una instancia de CuentaCorriente
		CuentaCorriente cuenta = new CuentaCorriente("Belen Tejera", 500);
		double cantidad = - 300;
		double resulEsperado = 500;
		cuenta.setIngreso(cantidad);
		assertEquals(resulEsperado, cuenta.getSaldo(), 0);
		//System.out.println("Fin TestSetIngresoNegativo");
	}

	@Test
	void testSetReintegro() {
		// Creamos una instancia de CuentaCorriente
		//System.out.println("Inicio TestSetReintegro");
		CuentaCorriente cuenta = new CuentaCorriente("Belen Tejera", 500);
		double cantidad = 300;
		double resulEsperado = 200;
		cuenta.setReintegro(cantidad);
		assertEquals(resulEsperado, cuenta.getSaldo(), 0);
		//System.out.println("FinstestSetReintegro");

	}
	
	@Test
	void testSetReintegroNegativo() {
		// Creamos una instancia de CuentaCorriente
		//System.out.println("Inicio TestSetReintegroNegativo");
		CuentaCorriente cuenta = new CuentaCorriente("Belen Tejera", 500);
		double cantidad = 700;
		double resulEsperado = 500;
		cuenta.setReintegro(cantidad);
		assertEquals(resulEsperado, cuenta.getSaldo(), 0);
		//System.out.println("Fin TestSetReintegroNegativo");
	
	}

	@Test
	void testGetSaldo() {
		// Creamos una instancia de CuentaCorriente
		//System.out.println("\n");
		//System.out.println("Inicio TestGetSaldo");
		//CuentaCorriente cuenta = new CuentaCorriente("Belen Tejera", 500);
		double resulEsperado = 25000;
		double resulResultado = una_cuenta.getSaldo();
		assertEquals(resulEsperado, resulResultado, 0);
		//System.out.println("Fin TestGetSaldo");
	}

	@Test
	void testGetDatosCuenta() {
		// Creamos una instancia de CuentaCorriente
		//System.out.println("Inicio TestGetDatosCuenta");
		//CuentaCorriente cuenta = new CuentaCorriente("Belen Tejera", 500);
		String titularEsperado = "Antonio Collado";
		double saldoEsperado = 25000;
		String datosResultado = una_cuenta.getDatosCuenta();
		
		assertTrue(datosResultado.contains("Titular: " + titularEsperado));
		assertTrue(datosResultado.contains("Saldo: " + saldoEsperado));
		//System.out.println("Fin TestGetDatosCuenta");
				
		
	}

	@Test
	void testTransferenciaOk() {
		//System.out.println("Inicio TestSetTransferencia");
		// Creamos una instancia de CuentaCorriente
		CuentaCorriente cuenta1 = new CuentaCorriente("Belen Tejera", 500);
		CuentaCorriente cuenta2 = new CuentaCorriente("Rosa Maicas", 1000);
		double cantidad = 100;
		double resulEsperadoCuenta1 = 400;
		double resulEsperadoCuenta2 = 1100;
		CuentaCorriente.Transferencia(cuenta1, cuenta2, cantidad);
		assertEquals(resulEsperadoCuenta1, cuenta1.getSaldo(), 0);
		assertEquals(resulEsperadoCuenta2, cuenta2.getSaldo(), 0);
		//System.out.println("Fin TestSetTransferencia");

	}
	
	@Test
	void testTransferenciaNegativa() {
		// Creamos una instancia de CuentaCorriente
		//ystem.out.println("Inicio TestSetTransferenciaNegativa");
		CuentaCorriente cuenta1 = new CuentaCorriente("Belen Tejera", 500);
		CuentaCorriente cuenta2 = new CuentaCorriente("Rosa Maicas", 1000);
		double cantidad = 700;
		double resulEsperadoCuenta1 = 500;
		double resulEsperadoCuenta2 = 1000;
		CuentaCorriente.Transferencia(cuenta1, cuenta2, cantidad);
		assertEquals(resulEsperadoCuenta1, cuenta1.getSaldo(), 0);
		assertEquals(resulEsperadoCuenta2, cuenta2.getSaldo(), 0);
		//System.out.println("Fin TestSetTransferenciaNegativa");

	}

}
