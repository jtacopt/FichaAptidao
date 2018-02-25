package Layout.Esquerdo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Esquerdo {

	private String TextodaLabel = "A Catixa é linda!";

	private JButton getFile() {

		ImageIcon icongnr = new ImageIcon("GNR.png");
		Image image = icongnr.getImage();
		Image newimg = image.getScaledInstance(40, 50, java.awt.Image.SCALE_SMOOTH);
		icongnr = new ImageIcon(newimg);
		JButton getfile = new JButton(icongnr);
		getfile.setMaximumSize(new Dimension(50, 50));

		getfile.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("piu piu");
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("xlsx", "xls");
				chooser.setFileFilter(filter);
				chooser.showOpenDialog(null);
			}
		});
		return getfile;
	}

	private JLabel getLabel() {
		JLabel label = new JLabel(TextodaLabel);
		return label;
	}

	public JPanel ComponenteEsquerdo() {
		JPanel painel = new JPanel();
		painel.setLayout(new BorderLayout());
		painel.add(getFile(), BorderLayout.NORTH);
		painel.add(getLabel());
		return painel;
	}

}
