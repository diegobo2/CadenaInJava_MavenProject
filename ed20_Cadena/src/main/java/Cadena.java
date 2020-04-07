

/**
 * Aplicaci�n para Strings.
 * @author Diego S�ez
 *
 */
public class Cadena {
	/**
	 * M�todo que devuelve la longitud de la cadena que se le pasa
	 * @param cadena
	 * @return longitud de la cadena
	 */
	public int longitud(String cadena) {
		return cadena.length();
	}
	/**
	 * M�todo que devuelve el n�mero de vocales min�sculas que tiene la cadena
	 * @param j2
	 * @return n�mero de vocales
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
	 * M�todo que devuelve la cadena en orden inverso
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
	 * M�todo que devuelve el n�mero de veces que aparece el car�cter en la cadena
	 * @param cadena
	 * @param caracter
	 * @return n�mero de veces
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
