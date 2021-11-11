package br.com.gilmar;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class AvaliacaoTest {
	
	private Avaliacao avaliacao;
		
	
	@Test (expected = ValoresInvalidosException.class)
	public void testCargaMaior0(){
		
		avaliacao.avalia(3, 7, 2, -1);
		
	}
	
	@Test (expected = ValoresInvalidosException.class)
	public void testeFaltas() {
		
		avaliacao.avalia(5, 9, 2, 2);
		
	}
	
	@Test (expected = ValoresInvalidosException.class)
	public void testeNota() {
		
		avaliacao.avalia(10, 8, 2, 2);
		
	}
	
	@Test (expected = ValoresInvalidosException.class)
	public void segundoTesteNota() {
		
		avaliacao.avalia(6, -1, 3, 2);
		
	}
	
	@Test 
	public void testQuantidadeFaltas() {
		var test = avaliacao.avalia(5, 6, 3, 9);
		
        assertEquals(test, "Reprovado por Média.");
		
	}
	
	@Test 
	public void segundoTestQuantidadeFaltas() {
		avaliacao.avalia(2, 2, 3, 11);
		
        assertEquals(test, "Reprovado por falta.");
	}
	
	@Test 
	public void testProvaExtra() {
		avaliacao.avalia(4, 5, 2, 10);
	}
	
	@Test 
	public void testNotaMedia() {
		
		avaliacao.avalia(6, 7, 2, 10);
		
	}
}