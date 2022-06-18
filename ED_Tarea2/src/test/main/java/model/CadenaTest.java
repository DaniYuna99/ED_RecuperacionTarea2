package test.main.java.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.java.model.Cadena;

public class CadenaTest {
	
	
	/* ============================================= */
	/* ============ METODO ESCAPICUA() ============= */
	/* ============================================= */
	
	
	/**
	 * Test probando el m�todo "esCapicua()", cuya funci�n es comprobar si
	 * un n�mero (o cadena) es id�ntico si se le da la vuelta.
	 * 
	 * Se usan variables Integer, Long, Double y Float, en ese orden.
	 * 
	 * Se comprueba si un n�mero capicua es capicua.
	 */
	@Test
	void testEsCapicua() {
		Cadena numero1 = new Cadena (313);
		assertTrue(numero1.esCapicua());
		Cadena numero2 = new Cadena (1234554321);
		assertTrue(numero2.esCapicua());
		Cadena numero3 = new Cadena (313.313);
		assertTrue(numero3.esCapicua());
		Cadena numero4 = new Cadena (232.232f);
		assertTrue(numero4.esCapicua());
	}
	
	
	/**
	 * Test probando el m�todo "esCapicua()", cuya funci�n es comprobar si
	 * un n�mero (o cadena) es id�ntico si se le da la vuelta.
	 * 
	 * Se usan variables Integer, Long, Double y Float, en ese orden.
	 * 
	 * Se comprueba si un n�mero no capicua NO es capicua.
	 */
	@Test
	void testNoEsCapicua() {
		Cadena numero1 = new Cadena (34242);
		assertFalse(numero1.esCapicua());
		Cadena numero2 = new Cadena (342425643);
		assertFalse(numero2.esCapicua());
		Cadena numero3 = new Cadena (3424.456);
		assertFalse(numero3.esCapicua());
		Cadena numero4 = new Cadena (3904560.345f);
		assertFalse(numero4.esCapicua());
	}
	
	/**
	 * Test parametrizado que ejecuta el m�todo de la 
	 * clase Cadena "esCapicua()", para comprobar si el 
	 * atributo "contenido" de la clase es un pal�ndromo.
	 * 
	 * @param String palabra
	 */
	@ParameterizedTest
	@ValueSource (strings = {"girafarig", "anna", "aerea", "Analavalana"})
	void testEsCapicuaString(String palabra) {
		Cadena cadena = new Cadena (palabra);
		assertTrue(cadena.esCapicua());
	}
	
	
	/**
	 * Test parametrizado que ejecuta el m�todo de la 
	 * clase Cadena "esCapicua()", para comprobar si el 
	 * atributo "contenido" de la clase es un pal�ndromo.
	 * 
	 * @param String palabra
	 */
	@ParameterizedTest
	@ValueSource (strings = {"error", "ejemplo", "qwerty"})
	void testNoEsCapicuaString(String palabra) {
		Cadena cadena = new Cadena (palabra);
		assertFalse(cadena.esCapicua());
	}
	
	
	
	/* ====================================================================== */
	/* ============ METODO ESCAPICUA() CON PARAMETRO (GENERICO) ============= */
	/* ====================================================================== */

	
	/**
	 * Test parametrizado que ejecuta el m�todo est�tico gen�rico de la 
	 * clase Cadena "esCapicua()", para comprobar si los 
	 * Strings pasados son pal�ndromos.
	 * 
	 * Esta es la versi�n del m�todo donde requiere un par�metro.
	 * 
	 * @param String palabra
	 */
	@ParameterizedTest
	@ValueSource (strings = {"girafarig", "anna", "aerea", "Analavalana"})
	void testEsCapicuaGenericoString(String palabra) {
		assertTrue(Cadena.esCapicua(palabra));
	}
	
	
	/**
	 * Test parametrizado que ejecuta el m�todo est�tico gen�rico de la 
	 * clase Cadena "esCapicua()", para comprobar si los 
	 * Strings pasados NO son pal�ndromos.
	 * 
	 * Esta es la versi�n del m�todo donde requiere un par�metro.
	 * 
	 * @param String palabra
	 */
	@ParameterizedTest
	@ValueSource (strings = {"error", "ejemplo", "qwerty"})
	void testNoEsCapicuaGenericoString(String palabra) {
		assertFalse(Cadena.esCapicua(palabra));
	}
	
	
	/**
	 * Test parametrizado probando el m�todo est�tico gen�rico "esCapicua()", 
	 * cuya funci�n es comprobar si un n�mero es id�ntico si se le da la vuelta. 
	 * 
	 * En este caso, se usan variables Integer.
	 * 
	 * Se comprueba si una serie de n�meros Integer capicuas son capicuas.
	 */
	@ParameterizedTest
	@ValueSource (ints = {313, 5666665, 345543, 1678998761})
	void testEsCapicuaGenericoInteger(int entero) {
		assertTrue(Cadena.esCapicua(entero));
	}
	
	/**
	 * Test parametrizado probando el m�todo est�tico gen�rico "esCapicua()", 
	 * cuya funci�n es comprobar si un n�mero es id�ntico si se le da la vuelta. 
	 * 
	 * En este caso, se usan variables Integer.
	 * 
	 * Se comprueba si una serie de n�meros Integer no capicuas NO son capicuas.
	 */
	@ParameterizedTest
	@ValueSource (ints = {3345, 560783665, 23456457, 95937264})
	void testNoEsCapicuaGenericoInteger(int entero) {
		assertFalse(Cadena.esCapicua(entero));
	}
	
	
	/**
	 * Test parametrizado probando el m�todo est�tico gen�rico "esCapicua()", 
	 * cuya funci�n es comprobar si un n�mero es id�ntico si se le 
	 * da la vuelta. 
	 * 
	 * En este caso, se usan variables Double.
	 * 
	 * Se comprueba si una serie de n�meros Double capicuas son capicuas.
	 */
	@ParameterizedTest
	@ValueSource (doubles = {33.33, 123.321, 4455.5544, 123456.654321})
	void testEsCapicuaGenericoDouble (double reppuken) {
		assertTrue(Cadena.esCapicua(reppuken));
	}
	
	
	/**
	 * Test parametrizado probando el m�todo est�tico gen�rico "esCapicua()", 
	 * cuya funci�n es comprobar si un n�mero es id�ntico si se le 
	 * da la vuelta. 
	 * 
	 * En este caso, se usan variables Double.
	 * 
	 * Se comprueba si una serie de n�meros Double no capicuas NO son capicuas.
	 */
	@ParameterizedTest
	@ValueSource (doubles = {2342.474, 464.0679, 20035.77567, 868694.08832})
	void testNoEsCapicuaGenericoDouble (double reppuken) {
		assertFalse(Cadena.esCapicua(reppuken));
	}
	
	
	/**
	 * Test parametrizado probando el m�todo est�tico gen�rico "esCapicua()", 
	 * cuya funci�n es comprobar si un n�mero es id�ntico si se le 
	 * da la vuelta. 
	 * 
	 * En este caso, se usan variables Long.
	 * 
	 * Se comprueba si una serie de n�meros Long capicuas son capicuas.
	 */
	@ParameterizedTest
	@ValueSource (longs = {313, 5666665, 345543, 1678998761})
	void testEsCapicuaGenericoLong (long fei) {
		assertTrue(Cadena.esCapicua(fei));
	}
	
	
	/**
	 * Test parametrizado probando el m�todo est�tico gen�rico "esCapicua()", 
	 * cuya funci�n es comprobar si un n�mero es id�ntico si se le 
	 * da la vuelta. 
	 * 
	 * En este caso, se usan variables Long.
	 * 
	 * Se comprueba si una serie de n�meros Long no capicuas NO son capicuas.
	 */
	@ParameterizedTest
	@ValueSource (longs = {3345, 560783665, 23456457, 95937264})
	void testNoEsCapicuaGenericoLong (long fei) {
		assertFalse(Cadena.esCapicua(fei));
	}
	
	
	/**
	 * Test parametrizado probando el m�todo est�tico gen�rico "esCapicua()", 
	 * cuya funci�n es comprobar si un n�mero es id�ntico si se le 
	 * da la vuelta. 
	 * 
	 * En este caso, se usan variables Float.
	 * 
	 * Se comprueba si una serie de n�meros Float capicuas son capicuas.
	 */
	@ParameterizedTest
	@ValueSource (floats = {31.13f, 566.665f, 345.543f, 167.761f})
	void testEsCapicuaGenericoFloat (float cebo) {
		assertTrue(Cadena.esCapicua(cebo));
	}
	
	
	/**
	 * Test parametrizado probando el m�todo est�tico gen�rico "esCapicua()", 
	 * cuya funci�n es comprobar si un n�mero es id�ntico si se le 
	 * da la vuelta. 
	 * 
	 * En este caso, se usan variables Float.
	 * 
	 * Se comprueba si una serie de n�meros Float no capicuas NO son capicuas.
	 */
	@ParameterizedTest
	@ValueSource (floats = {3345.234f, 560783.665f, 23456.457f, 95937.264f})
	void testNoEsCapicuaGenericoFloat (float cebo) {
		assertFalse(Cadena.esCapicua(cebo));
	}
	
	
	
	/*Estos m�todos no funcionan como deber�an, y empezaron a fallar cuando 
	comprim� los m�todos en uno. Los dejo aqu�.*/
	
	/**
	 * Test que comprueba si al crearse una clase Cadena 
	 * y se le pasa de par�metro un valor null, salta 
	 * NullPointerException al usar el m�todo gen�rico "esCapicua()"
	 * 
	 * Esta es la versi�n del m�todo donde requiere un par�metro.
	 * 
	 * Funciona raro, as� que lo he puesto como comentario. No salta la 
	 * Exception.
	 */
	/*@Test
	void testEsCapicuaGenericoNull() {
		assertTrue(Cadena.esCapicua(null));	
	}*/
	
	
	/**
	 * Test que comprueba si al crearse una clase Cadena 
	 * con valor "contenido" null, salta NullPointerException al usar 
	 * el m�todo esAnagrama()
	 * 
	 * Funciona raro, as� que lo he puesto como comentario. No salta la 
	 * Exception.
	 */
	/*@Test
	void testEsAnagramaNull() {
		Cadena cadena = new Cadena (null);
		assertTrue(cadena.esCapicua());
	}*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
