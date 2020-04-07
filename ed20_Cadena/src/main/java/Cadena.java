

/**
 * Aplicación para Strings.
 * @author Diego Sáez
 *
 */
public class Cadena {
	/**
	 * Método que devuelve la longitud de la cadena que se le pasa
	 * @param cadena
	 * @return longitud de la cadena
	 */
	public int longitud(String cadena) {
		return cadena.length();
	}
	/**
	 * Método que devuelve el número de vocales minúsculas que tiene la cadena
	 * @param j2
	 * @return número de vocales
	 */
	public int vocales(String cadena) {
		char[] vocals = {'a','e','i','o','u'};
		int cnt = 0;
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; i < vocals.length; i++) {
				if (cadena.charAt(i) == vocals[j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	/**
	 * Método que devuelve la cadena en orden inverso
	 * @param cadena
	 * @return cadena en orden inverso
	 */
	public String invertir(String cadena) {
		for (int i=cadena.length()-1;i>=0;i--) {
			cadena = cadena + cadena.charAt(i);
		}
		return cadena;
	}
	/**
	 * Método que devuelve el número de veces que aparece el carácter en la cadena
	 * @param cadena
	 * @param caracter
	 * @return número de veces
	 */
	public int contarLetra(String cadena, char caracter) {
		int cnt = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i)== caracter ){
			cnt ++;
			}
		}
		return cnt;
	}
}
