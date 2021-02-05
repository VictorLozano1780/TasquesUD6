import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD6_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teclado = JOptionPane.showInputDialog("Que numero quieres pasar a binario");
		int numero = Integer.parseInt(teclado);
		
		JOptionPane.showMessageDialog(null, convertirBinario(numero));
	}

	/**
	 * @param numero
	 */
	private static String convertirBinario(int numero) {
		String binario = "";
		while (numero != 0){
			binario = numero % 2 + binario;
			numero = numero / 2;
		}
		return binario;
	}

}
