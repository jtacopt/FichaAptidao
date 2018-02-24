package Layout.Rodape;

import java.time.temporal.JulianFields;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Rodape {

	public Rodape() {
		// TODO Auto-generated constructor stub
	}
	
	private JButton VerInfo() {
		JButton VerInfo = new JButton();
		VerInfo.setText("Ver Informações");
		VerInfo.addActionListener(null);
		return VerInfo;
	}
	
	private JButton GerarOutro() {
		JButton GerarOutro = new JButton();
		GerarOutro.setText("Gerar Outro");
		GerarOutro.addActionListener(null);
		return GerarOutro;
		
	}
	
	private JPanel componente() {
		JPanel componente = new JPanel();
		return componente;
	}
}
