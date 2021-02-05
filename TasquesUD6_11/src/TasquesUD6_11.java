import java.util.Random;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD6_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Cuantas posiciones tiene el array");
		int valores = Integer.parseInt(numero);

		Integer[] array = new Integer[valores];
		Integer[] array2 = new Integer[valores];

		rellenarArrayRandom(array);
		copiarArray(array, array2);
		rellenarArrayRandom(array2);
		System.out.println("Array 1:");
		mostrarValores(array);
		System.out.println("Array 2:");
		mostrarValores(array2);
		System.out.println("Multiplicacion: ");
		multiplicarArrays(array,array2);
		
		

	}

	/**
	 * @param array
	 * @param array2
	 */
	private static void multiplicarArrays(Integer[] array, Integer[] array2) {
		Integer[] multi = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			multi[i] = array[i] * array2[i];
		}
		mostrarValores(multi);
		
	}

	/**
	 * @param array
	 * @param array2 
	 */
	private static void copiarArray(Integer[] array, Integer[] array2) {
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		
	}

	private static void rellenarArrayRandom(Integer[] array) {
		String numero = JOptionPane.showInputDialog("Cual es el limite más bajo");
		String numero2 = JOptionPane.showInputDialog("Cual es el limite mayor");
		int num1 = Integer.parseInt(numero);
		int num2 = Integer.parseInt(numero2);
		int i = 0;

		while (i < array.length) {
			int rand = random(num1, num2);
			array[i] = rand;
			i++;
		}

	}

	private static int random(int numeroMin, int numeroMax) {
		Random rand = new Random();
		int random = rand.nextInt(numeroMax + 1 - numeroMin);
		return random + numeroMin;
	}

	private static void mostrarValores(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " = " + array[i]);
		}

	}
}
