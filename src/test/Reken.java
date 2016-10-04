package test;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Reken extends JFrame implements ActionListener {

	JTextField field = new JTextField();
	private String operator;
	private String getal2;
	private String getal1;
	
	public Reken() {
		// TODO Auto-generated constructor stub

	
		field.setText("");
		field.setFont(new Font("Arial", Font.PLAIN, 40));
		getContentPane().add(field, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(4, 4));
		
		String[] lijstje = { 
				"7", "8", "9", "/",
				"4", "5", "6", "*",
				"1", "2", "3", "+",
				"C", "0", "=", "-",
		};
		
		for (int i = 0; i < 16; i++) {
			JButton button = new JButton();
			button.setText(lijstje[i]);		
			button.setFont(new Font("Arial", Font.PLAIN, 40));
			button.addActionListener(this);	
			panel.add(button);
		}
		
		getContentPane().add(panel, BorderLayout.CENTER);
	}
	
	
	

	
	
	
	
	
	
	public static void main(String[] args) {
		Reken reken = new Reken();
		reken.setSize(500, 500);
		reken.setVisible(true);
	}






	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		
		case "0": case "1": case "2": case "3":
		case "4": case "5": case "6": case "7":
		case "8": case "9":
					// getal state
			
			field.setText(field.getText() + e.getActionCommand());
		break;
		
		case "+": case "-": case "*": case "/":
			//operator state
			operator = e.getActionCommand();
			getal1= field.getText();
			field.setText("");
		
		break;
		
		case "=":
			//reken state
			getal2 = field.getText();
			
			// string --> int
			
			int g1 = Integer.parseInt(getal1);
			int g2 = Integer.parseInt(getal2);
			
			int antwoord = 0;
			
			// switch operator
			
			switch(operator) {
			
			case "+":
				antwoord = g1 + g2;
				break;
				
			case "-":
				antwoord = g1 - g2;
			break;
			
			case"*":
				antwoord = g1 * g2;
			break;
			
			case "/":
				antwoord = g1 / g2;
			break;
			
			}
		
			
			// antwoord
			
			// antwoord tonen
			
			field.setText("" + antwoord);
			
		break;
		}
		
//		case "C":
//			// clear
		switch(e.getActionCommand()){
		
		case "C":
	// 		getal1 = 0;
	//		getal2 = 0;
			field.setText("");
			break;
		
		
		}
		
		
	}
	
	
	 
	
}
