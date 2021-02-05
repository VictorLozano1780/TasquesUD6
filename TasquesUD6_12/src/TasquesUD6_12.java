import java.util.Random;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD6_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Cuantas posiciones tiene el array");
		int valores = Integer.parseInt(numero);
		numero = JOptionPane.showInputDialog("En que numero tiene que acabar?");
		int num = Integer.parseInt(numero);
		
		Integer[] array = new Integer[valores];
		
		rellenarArray(array);
		mostrarCorrectas(array, num);



	}
	
	/**
	 * @param array
	 */
	private static void mostrarCorrectas(Integer[] array, int numero) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 == numero) {
				System.out.println(array[i]);
			}
		}
		
	}

	private static void rellenarArray(Integer[] array) {
		int num1 = 1;
		int num2 = 300;
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


}
