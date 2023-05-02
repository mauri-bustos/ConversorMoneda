import javax.swing.JOptionPane;

public class Conversor {
	
	Conversores conversores = new Conversores();
	
	String[] conversiones = {"Peso a Dólar", "Peso a Euro", "Peso a Libra Esterlina", "Peso a Yen", "Peso a Won-sul", "Dólar a Peso", "Euro a Peso", "Libra Esterlina a Peso", "Yen a Peso", "Won-sul a Peso"};
	
	
	public void convertirMonedas(double input) {
		String eleccion = (JOptionPane.showInputDialog(null, "Seleccione la moneda a la que desea convertir su dinero", "Moneda", JOptionPane.DEFAULT_OPTION, null, conversiones, "Selección")).toString();
		
		switch(eleccion) {
		case "Peso a Dólar":
			conversores.pesoADolar(input);
			break;
		case "Peso a Euro":
			conversores.pesoAEuro(input);
			break;
		case "Peso a Libra Esterlina":
			conversores.pesoALibra(input);
			break;
		case "Peso a Yen":
			conversores.pesoAYen(input);
			break;
		case "Peso a Won-sul":
			conversores.pesoAWonCoreano(input);
			break;
		case "Dólar a Peso":
			conversores.dolarAPeso(input);
			break;
		case "Euro a Peso":
			conversores.euroAPeso(input);
			break;
		case "Libra Esterlina a Peso":
			conversores.libraAPeso(input);
			break;
		case "Yen a Peso":
			conversores.yenAPeso(input);
			break;
		case "Won-sul a Peso":
			conversores.wonCoreanoAPeso(input);
			break;
		}

	}
	
	
	public boolean validarNumero (String valor) {
	    double v;
	    try {
	      v = Double.parseDouble(valor);
	      return true;
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}
}
