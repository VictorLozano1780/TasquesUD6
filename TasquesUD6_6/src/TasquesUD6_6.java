import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD6_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean correcto;
		String numero;
		do {
			numero = JOptionPane.showInputDialog("Pon un numero entero positivo");
			correcto = controlNumero(numero);
		} while (correcto == false);
		
		JOptionPane.showMessageDialog(null, "El numero escogido tiene " + numero.length() + " cifras");
	}

	/**
	 * @param numero
	 */
	private static boolean controlNumero(String numero) {
		boolean correcto = false;
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) >= '0' && numero.charAt(i) <= '9') {
				correcto = true;
			} else {
				correcto = false;
				i = numero.length();
			}
		}
		return correcto;
		
	}

}
