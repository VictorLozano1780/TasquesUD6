import java.util.Random;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD6_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String total = JOptionPane.showInputDialog("Cuantos numeros aleatorios quieres?");
		String numMin = JOptionPane.showInputDialog("Numero minimo");
		String numMax = JOptionPane.showInputDialog("Numero maximo");
				
		//Convierte los numeros en Integers
		int numeros = Integer.parseInt(total);
		int numeroMax = Integer.parseInt(numMax);
		int numeroMin = Integer.parseInt(numMin);
		
		for (int i = 1; i <= numeros; i++) {
			JOptionPane.showMessageDialog(null, "El numero " + i + " es " + random(numeroMin, numeroMax));
		}
		
	}

	/**
	 * @param numeroMin
	 * @param numeroMax
	 * @return numero aleatorio entre numero minimo y maximo
	 */
	private static int random(int numeroMin, int numeroMax) {
		Random rand  = new Random();
		int random = rand.nextInt(numeroMax + 1 - numeroMin);
		return random+ numeroMin;
	}

}
