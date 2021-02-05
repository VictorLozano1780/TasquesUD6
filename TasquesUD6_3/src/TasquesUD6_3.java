import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD6_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Que numero quieres saber si es primo");
		int numeroPrimo = Integer.parseInt(numero);
		JOptionPane.showMessageDialog(null, esPrimo(numeroPrimo));

	}

	/**
	 * @param numeroPrimo
	 */
	private static boolean esPrimo(int numeroPrimo) {
		boolean result = true;
		for (int i = 2; i < numeroPrimo; i++) {
			if (numeroPrimo %i == 0) {
				result = false;
				i = numeroPrimo;
			}
		}

		return result;
	}

}
