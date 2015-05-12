package teste;

import ui.Cliente;
import ui.Conta;
import ui.ContaCorrente;
import ui.ContaPoupanca;
import junit.framework.TestCase;

public class ContaPoupancaTeste extends TestCase {

	private Conta c1;
	private Conta c2;
	private Cliente cliente;
	
	protected void setUp(){
		cliente = new Cliente("jezreel lau","102030");
		c1 = new ContaCorrente("01", 100);
		c1.setCliente(cliente);
		c2 = new ContaPoupanca("02", 50);
	}
	
	protected void tearDown(){
		c1=null;
		c2=null;
	}
	
	public void testCompararNumConta(){	
		assertEquals(c1,c1);
	}
	public void testCreditarNumNegativo(){
		assertFalse(c1.creditarConta(-10));
	}
	public void testCreditarNumPositivo(){
		assertTrue(c1.creditarConta(10));
	}
	public void testTipoContaDiferente(){
		assertNotSame(c1, c2);
	}
	public void testContaCliente(){
		assertSame(c1.getCliente(),cliente);
	}
	public void testFalha(){
		fail();
	}
}
