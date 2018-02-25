package Layout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Layout.Central.Central;
import Layout.Esquerdo.Esquerdo;
import Layout.Rodape.Rodape;

public class MainLayout {

	private JFrame janela;
	private String tituloJanela = "Titulo Janela";

	public MainLayout() {
		SetUpJanela();
		escleto();
		TearDown();
	}

	private void escleto() {
		janela.add(getRodape(), BorderLayout.PAGE_END);
		janela.add(getCompCentral());
		janela.add(getCompEsquerdo(),BorderLayout.WEST);
	}

	private void SetUpJanela() {
		janela = new JFrame();
		janela.setTitle(tituloJanela);
		janela.setLayout(new BorderLayout());
	}

	private void TearDown() {
		janela.setSize(500, 400);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private JPanel getRodape() {
		Rodape rodape = new Rodape();
		JPanel painelinf = rodape.componente();
		return painelinf;
	}
	
	private JPanel getCompCentral() {
		Central central = new Central ();
		JPanel painel = central.ComponenteCentral();
		return painel;
	}
	
	private JPanel getCompEsquerdo() {
		Esquerdo esquerdo = new Esquerdo();
		JPanel painel = esquerdo.ComponenteEsquerdo();
		return painel;
	}
}
