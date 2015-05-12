package teste;

import junit.framework.TestCase;
import ui.Cliente;
import ui.Conta;
import ui.ContaCorrente;
import ui.ContaPoupanca;

public class ContaCorrenteTeste extends TestCase {

	private Conta c1;
	private Conta c2;
	private Cliente cliente1;
	
	protected void setUp(){
		cliente1 = new Cliente("jezreel lau","102030");
		c1 = new ContaCorrente("01", 100);
		c1.setCliente(cliente1);
		c2 = new ContaPoupanca("02", 50);
	}
	
	protected void tearDown(){
		c1=null;
		c2=null;
	}
	
	public void testClienteNull(){
		assertNull(c2.getCliente());
	}
	public void testCliente(){
		assertNotNull(c1.getCliente());
	}
	public void testContaCliente(){
		assertSame(c1.getCliente(),cliente1);
	}

}
