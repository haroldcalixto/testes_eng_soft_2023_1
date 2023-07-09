package vending;

import static org.junit.Assert.*;

import org.junit.Test;

protected VendingMachine vend;

public class VendingMachineTest {

	@Test
	public void inicializacaoMaquinaTeste() {
		vend = new VendingMachine();
		assertEquals("Inicializacao com o valor 0 para curValue", 0, vend.currValue);
	}


}
