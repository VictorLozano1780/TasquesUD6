import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD6_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = JOptionPane.showInputDialog("Que numero quieres saber el factorial");
		int numero = Integer.parseInt(num);
		
		calculaFactorial(numero);
	}

	/**
	 * @param numero
	 */
	private static void calculaFactorial(int numero) {
		int resultado = numero;
		for (int i = numero -1; i > 0; i--) {
			resultado = resultado * i;
		}
		JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
	}

}
