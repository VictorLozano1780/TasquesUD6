import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD6_8 {
	public static void main(String[] args) {
	String array[] = new String[9];
	
	rellenarValeores(array);
	mostrarValores(array);
	}

	/**
	 * @param array
	 */
	private static void rellenarValeores(String[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = JOptionPane.showInputDialog("Indice" + i);
		}
	}
	/**
	 * @param array
	 */
	private static void mostrarValores(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " = " + array[i]);
		}
	}



}
