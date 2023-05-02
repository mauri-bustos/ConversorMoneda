import javax.swing.JOptionPane;

public class Conversores {
	
	double equivalencia;
	
	public void pesoADolar(double valor) {
		equivalencia = valor / 221.57;
		equivalencia = (double)Math.round(equivalencia * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes U$S " + equivalencia + " dólares");
	}
	
	public void dolarAPeso(double valor) {
		equivalencia = valor * 221.57;
		equivalencia = (double)Math.round(equivalencia * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + equivalencia + " pesos");
	}
	
	public void pesoAEuro(double valor) {
		equivalencia = valor / 243.83;
		Math.round(equivalencia);
		JOptionPane.showMessageDialog(null, "Tienes EUR " + equivalencia + " euros");
	}
	
	public void euroAPeso(double valor) {
		equivalencia = valor * 243.83;
		Math.round(equivalencia);
		JOptionPane.showMessageDialog(null, "Tienes $ " + equivalencia + " pesos");
	}
	
	public void pesoALibra(double valor) {
		equivalencia = valor / 278.17;
		Math.round(equivalencia);
		JOptionPane.showMessageDialog(null, "Tienes L " + equivalencia + " libras esterlinas");
	}
	
	public void libraAPeso(double valor) {
		equivalencia = valor * 278.17;
		Math.round(equivalencia);
		JOptionPane.showMessageDialog(null, "Tienes $ " + equivalencia + " pesos");
	}
	
	public void pesoAYen(double valor) {
		equivalencia = valor / 1.62;
		Math.round(equivalencia);
		JOptionPane.showMessageDialog(null, "Tienes JPY " + equivalencia + " yenes");
	}
	
	public void yenAPeso(double valor) {
		equivalencia = valor * 1.62;
		Math.round(equivalencia);
		JOptionPane.showMessageDialog(null, "Tienes $ " + equivalencia + " pesos");
	}
	
	public void pesoAWonCoreano(double valor) {
		equivalencia = valor / 0.17;
		Math.round(equivalencia);
		JOptionPane.showMessageDialog(null, "Tienes W " + equivalencia + " wones");
	}
	
	public void wonCoreanoAPeso(double valor) {
		equivalencia = valor * 0.17;
		Math.round(equivalencia);
		JOptionPane.showMessageDialog(null, "Tienes $ " + equivalencia + " pesos");
	}
	

	
	
	
}	

	