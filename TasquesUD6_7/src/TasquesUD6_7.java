import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD6_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String euros =JOptionPane.showInputDialog("Cuantos € quieres en otra moneda?");
		String moneda = JOptionPane.showInputDialog("QUe moneda quieres? (Libras, dolares o yenes)");
		double dinero = Double.parseDouble(euros);
		moneda = moneda.toLowerCase();
		
		convertirMoneda(dinero,moneda);
	}

	/**
	 * @param dinero
	 * @param moneda
	 */
	private static void convertirMoneda(double dinero, String moneda) {
		if (moneda.equals("libras")) {
			JOptionPane.showMessageDialog(null, dinero * 0.86 + "libras");
		} else if(moneda.equals("yenes")) {
			JOptionPane.showMessageDialog(null, dinero * 129.852 + "yenes");
		} else if(moneda.equals("dolares")) {
			JOptionPane.showMessageDialog(null, dinero * 1.28611 + "dolares");
		} else {
			JOptionPane.showMessageDialog(null, "Esta moneda no existe");
		}
		
	}

}
