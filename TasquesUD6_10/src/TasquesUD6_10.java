import java.util.Random;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD6_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Cuantas posiciones tiene el array");
		int valores = Integer.parseInt(numero);
		Integer[] array = new Integer[valores];
		
		rellenarArray(array);
		mostrarValores(array);
	}

	/**
	 * @param array
	 */
	private static void rellenarArray(Integer[] array) {
		String numero = JOptionPane.showInputDialog("Cual es el limite más bajo");
		String numero2 = JOptionPane.showInputDialog("Cual es el limite mayor");
		int num1 = Integer.parseInt(numero);
		int num2 = Integer.parseInt(numero2);
		int i = 0;
		
		while(i < array.length) {
			int rand = random(num1, num2);
			boolean correcto = esPrimo(rand);
			if (correcto) {
				array[i] = rand;
				i++;

			} 
		}
		
	}
	
	private static int random(int numeroMin, int numeroMax) {
		Random rand  = new Random();
		int random = rand.nextInt(numeroMax + 1 - numeroMin);
		return random+ numeroMin;
	}
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
	private static void mostrarValores(Integer[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " = " + array[i]);
			
			//Comprueba si es mas grande que el anterior
			if (array[max] < array[i]) {
				max = i;
			}
		}
		System.out.println("El numero mas alto es " + array[max]);
	}


}
