import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD6_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String calcular = JOptionPane.showInputDialog("Que quieres calcular: Circulo, Triangulo o Cuadrado");
		String numero;
		double resultado = 0;
		
		switch (calcular.toLowerCase()) {
		case "circulo":
			numero = JOptionPane.showInputDialog("Que radio tiene el circulo?");
			double radio = Double.parseDouble(numero);
			resultado = circulo(radio);
			break;
		case "triangulo":
			numero = JOptionPane.showInputDialog("Que base tiene el triangulo?");
			String numero2 = JOptionPane.showInputDialog("Que altura tiene el triangulo?");
			double base = Double.parseDouble(numero);
			double altura = Double.parseDouble(numero2);
			resultado = triangulo(base, altura);
			break;
		case "cuadrado":
			numero = JOptionPane.showInputDialog("Cuanto mide un lado?");
			double lado = Double.parseDouble(numero);
			resultado = cuadrado(lado);
			break;
		default:
			JOptionPane.showMessageDialog(null, "No esta en las opciones");
		}
		
		JOptionPane.showMessageDialog(null, resultado);

	}
	
	/**
	 * @param lado
	 * @return resultado
	 */
	private static double cuadrado(double lado) {
		return lado * lado;
	}

	/**
	 * @param base
	 * @param altura
	 * @return resultado
	 */
	private static double triangulo(double base, double altura) {
		return (base * altura) / 2;
	}
	/**
	 * @param radio
	 * @return resultado
	 */
	private static double circulo(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}

}
