import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TesteParaTabuleiro {

	@Test
	void TabuleiroVazio() {
		Tabuleiro t = new Tabuleiro();
		int[][] tabuleiroVazio = new int[10][10];
		assertArrayEquals(tabuleiroVazio, t.tabuleiro);
	}
	
	@Test
	void IncluiCélula() {
		Tabuleiro t = new Tabuleiro();
		t.incluiCélula(0,0);
		assertEquals(1, t.tabuleiro[0][0]);
	}
	
	@Test
	void RemoveCélula() {
		Tabuleiro t = new Tabuleiro();
		int[][] tabuleiroVazio = new int[10][10];

		t.incluiCélula(0,0);
		t.incluiCélula(0,0);
		assertEquals(tabuleiroVazio[0][0], t.tabuleiro[0][0]);
	}
	
	@Test
	void retornaQuantidadeDeVizinhos() {
		Tabuleiro t = new Tabuleiro();
		t.incluiCélula(1,1);
		t.incluiCélula(0,0);
		assertEquals(1, t.quantidadeDeVizinhos(1,1));
	}
	
	@Test
	void retornaQuantidadeDeVizinhosDeUmaBorda() {
		Tabuleiro t = new Tabuleiro();
		t.incluiCélula(0,0);
		t.incluiCélula(1,1);
		t.incluiCélula(1,0);
		assertEquals(2, t.quantidadeDeVizinhos(0,0));
	}
	
	@Test
	void testaONascimentoDeCélulas() {
		Tabuleiro t = new Tabuleiro();
		t.incluiCélula(1,2);
		t.incluiCélula(2,2);
		t.incluiCélula(3,2);
		
		t.nascerCélulas(2,1);
		t.nascerCélulas(2,3);
		t.nascerCélulas(3,3);
		
		t.converterCélulasVivas();
		
		assertEquals(4, t.quantidadeDeVizinhos(2,2));
	}
	
	@Test
	void testaAMorteDeCélulas() {
		Tabuleiro t = new Tabuleiro();
		t.incluiCélula(1,2);
		t.incluiCélula(2,2);
		t.incluiCélula(3,2);
		
		t.matarCélulas(1,2);
		t.matarCélulas(2,2);
		t.matarCélulas(3,2);
		
		t.converterCélulasMortas();
		
		assertEquals(1, t.quantidadeDeVizinhos(2,3));
	}

}
