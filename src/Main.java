import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		Conversor conversor = new Conversor();
		
		String[] conversores = {"Conversor de monedas", "Conversor de temperatura"};
		
		boolean flag = true;
		while (flag){
			
			Object chooseConversor = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Conversor", JOptionPane.DEFAULT_OPTION, null, conversores, args);
			
			if(chooseConversor == "Conversor de monedas"){
					String valor;
					valor = JOptionPane.showInputDialog("¿Cuánto dinero desea convertir?");
					if(conversor.validarNumero(valor)) {
						double miValor = Double.parseDouble(valor);
						conversor.convertirMonedas(miValor);
						
						int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Selecciones una opción", 1);
						if(respuesta == 0) {
							System.out.println("Desea continuar");
						}else {
							flag = false;
							JOptionPane.showMessageDialog(null, "Programa finilizado");
						} 
					}	else {
						JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
					}		
			} else if(chooseConversor == "Conversor de temperatura"){
				flag = false;
				JOptionPane.showMessageDialog(null, "Todavía no hemos desarrolado este Conversor");
				JOptionPane.showMessageDialog(null, "Programa finilizado");
			} else {
				flag = false;
				JOptionPane.showMessageDialog(null, "Programa finilizado");
			}
			
		} 
				
	}

}
