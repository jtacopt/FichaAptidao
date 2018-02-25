package Layout.Rodape;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Rodape {

	public Rodape() {

	}

	private JButton VerInfo() {
		JButton VerInfo = new JButton();
		VerInfo.setText("Ver Informações");
		VerInfo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		return VerInfo;
	}

	private JButton GerarWord() {
		JButton GerarWord = new JButton();
		GerarWord.setText("Gerar Outro");
		GerarWord.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		return GerarWord;

	}

	public JPanel componente() {
		JPanel componente = new JPanel();
		componente.add(VerInfo());
		componente.add(GerarWord());
		return componente;
	}
}
