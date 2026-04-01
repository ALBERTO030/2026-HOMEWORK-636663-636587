package diadia.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;

class PartitaTest {

	@Test
	void testisFinitaFalse() {
		Partita A1 = new Partita();
		assertFalse(A1.isFinita(), "Il primo test non funziona");
		
	}
	
	@Test
	void testisFinita0CFU() {
		Partita A2 = new Partita();
		A2.getGiocatore().setCfu(0);
		assertTrue(A2.isFinita(),"Il secondo test non funziona");
	}
	
	@Test
	void testisFinitaCFUnon0(){
		Partita A3 = new Partita();
		assertFalse(A3.isFinita(), "Il terzo test non funziona");
	}
	
	@Test
	void testVintaNull() {
		Partita B1 = new Partita();
		B1.setStanzaCorrente(null);
		assertFalse(B1.vinta(), "Il quarto test non funziona");
	}
	
	@Test
	void testVintaTrue() {
		Partita B2 = new Partita();
		B2.setStanzaCorrente(B2.getLab().getUscita());
		assertTrue(B2.vinta(), "Il quinto test non funziona");
	}
	
	@Test
	void testVintaFalse() {
		Partita B3 = new Partita();
		assertFalse(B3.vinta(), "Il sesto test non funziona");
	}
}
