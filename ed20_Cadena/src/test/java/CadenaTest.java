

import static org.junit.jupiter.api.Assertions.*;

import org.cuatrovientos.ed.ed20_Cadena;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CadenaTest {
	
	private Cadena target;
	
	@BeforeEach
	void setUp() throws Exception {
		target = new Cadena();
	}

	@Test
	void testlongitud() {
		int expected = 5;
		int actual = target.longitud("diego");
		assertEquals(expected,actual,"Testing add");
	}

	@Test
	void testvocales() {
		int expected = 3;
		int actual = target.vocales("diego");
		assertEquals(expected,actual,"Testing add");
	}

	@Test
	void testDiv() {
		String expected = "ogeid";
		String actual = target.invertir("diego");
		assertEquals(expected,actual,"Testing add");
	}

	@Test
	void testMul() {
		int expected = 1;
		int actual = target.contarLetra("diego", 'o');
		assertEquals(expected,actual,"Testing add");
	}

}
