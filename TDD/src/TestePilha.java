import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestePilha {

	private Pilha p = new Pilha(10);
	
	@Before
	public void inicializaPilha() {
	}
	@Test
	public void pilhaVazia() {
		assertTrue(p.estaVazia());
		assertEquals(0,p.tamanho());
	}
	
	@Test
	public void empilhaElemento(){
		p.empilha("primeiro");
		assertFalse(p.estaVazia());
		assertEquals(1,p.tamanho());
		assertEquals("primeiro",p.topo());

	}
	
	@Test
	public void empilha2ElementoEDesenpilha(){
		p.empilha("primeiro");
		p.empilha("segundo");
		
		assertFalse(p.estaVazia());
		assertEquals(2,p.tamanho());
		assertEquals("segundo",p.topo());

		Object desempilhado = p.desempilha();
		assertEquals(1,p.tamanho());
		assertEquals("primeiro",p.topo());
		assertEquals("segundo", desempilhado);
	}
	/*

	@Test(excepted=PilhaVaziaException.class)
	public void removeDaPilhaVazia(){
		p.desempilha();
	}
	*/
}
