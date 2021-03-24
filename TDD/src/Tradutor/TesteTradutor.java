package Tradutor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteTradutor {

	private Tradutor t = new Tradutor();

	@Before
	void criarTradutor() {

	}
	
	@Test
	void tradutorSemPalavras() {
		assertTrue(t.estaVazio());
	}
	
	@Test
	void umaTradução() {
		t.adicionaTradução("bom","good");
		assertFalse(t.estaVazio());
		assertEquals("good", t.traduzir("bom"));
	}
	
	@Test
	void duasTraduções() {
		t.adicionaTradução("bom","good");
		t.adicionaTradução("mau","bad");
		assertEquals("good", t.traduzir("bom"));
		assertEquals("bad", t.traduzir("mau"));
	}
	
	@Test
	void duasTraduçõesMesmaPalavra() {
		t.adicionaTradução("bom","good");
		t.adicionaTradução("bom","nice");
		assertEquals("good, nice", t.traduzir("bom"));
	}
	
	@Test
	void traduzirFrase() {
		t.adicionaTradução("guerra","war");
		t.adicionaTradução("ruim","bad");
		t.adicionaTradução("é","is");
		assertEquals("war is bad", t.traduzirFrase("guerra é ruim"));
	}
	
	@Test
	void traduzirFraseComDuasTraduçõesParaMesmaPalavra() {
		t.adicionaTradução("paz","peace");
		t.adicionaTradução("bom","good");
		t.adicionaTradução("bom","nice");
		t.adicionaTradução("é","is");
		assertEquals("peace is good", t.traduzirFrase("paz é bom"));
	}

}
