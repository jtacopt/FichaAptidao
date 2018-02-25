package Layout.Central;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Central {
	
	private String jlabel = "Numero de Pepino";
	private JTextField textfield;
	
	public Central() {
		generateLabel();
		InputTextField();
	}
	
	private JLabel generateLabel(){
		JLabel label = new JLabel(); 
		label.setText(jlabel);
		return label;
	}
	
	private void InputTextField() {
		textfield = new JTextField(10);
	}
	
	//o João é o meu verdadeiro amor
	public JPanel ComponenteCentral() {
		JPanel panel = new JPanel();
		panel.add(generateLabel());
		panel.add(getTextfield());
		return panel;
	}

	public JTextField getTextfield() {
		return textfield;
	}

	public void setTextfield(JTextField textfield) {
		this.textfield = textfield;
	}
		
}
