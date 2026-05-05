package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.parcial;

public class ParcialTests {
	private parcial Parcial;

	@BeforeEach
	public void setUp() {
		this.Parcial = new parcial();
	
	}
		
	@Test
		public void potenciaTest() throws Exception {
			assertEquals(9, this.Parcial.ejercicio1(3, 2));
			assertThrows(Exception.class, () -> this.Parcial.ejercicio1(0, 0));
			assertThrows(Exception.class, () -> this.Parcial.ejercicio1(2, -1));
			assertThrows(Exception.class, () -> this.Parcial.ejercicio1(2147483647, 2));
		}
	
		

	
	
}
	
	
