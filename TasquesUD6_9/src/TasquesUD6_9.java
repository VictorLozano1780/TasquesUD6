import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD6_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Cuantas posiciones tiene el array");
		int valores = Integer.parseInt(numero);
		Double[] array = new Double[valores];

		rellenarValeores(array);
		mostrarValores(array);
	}

	/**
	 * @param array
	 */
	private static void rellenarValeores(Double[] array) {
		String numero;
		for (int i = 0; i < array.length; i++) {
			numero = JOptionPane.showInputDialog("Indice" + i);
			double num = Double.parseDouble(numero);
			array[i] = num;
		}
	}

	/**
	 * @param array
	 */
	private static void mostrarValores(Double[] array) {
		double aux = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " = " + array[i]);
			aux = aux + array[i];
		}
		System.out.println("La suma total es: " + aux);
	}

}
