package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JPanel;

public class OperationsConsole extends JPanel implements ActionListener{
	
	private String [] dishOptions = {"Appetiser","Spare Ribs",
			"Soup", "Rice","Chow Min","Duck", "Hot","Seafood",
			"Chicken","Beef","Roast Pork","Curry",
		    "Lamb", "Sweet Sour" ,"Chop Suey", "Foo Yung",
		    "Vagetable", "Desserts", "Soft Drinks", "Chef Special",
		    "Set Meal", "Special Set Meal", "Others", "Beancurd",
		    "Thai Curry", "Extra",""};
	
	private List<JButton> operationButtons = new ArrayList<>();
	
	public OperationsConsole(String[] operationConsoleOptions , int row) {
			
		this.setSize(1300, 200);
		this.setBackground(Color.WHITE);
		
		int columns = operationConsoleOptions.length;
		
		this.setLayout(new GridLayout(row , columns));
		
		for(int i=0 ; i< operationConsoleOptions.length ; i++) {
			JButton opButton = new JButton(operationConsoleOptions[i]);
			opButton.addActionListener(this);
			operationButtons.add(opButton);
			this.add(opButton);
		}
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(JButton buttonPressed : operationButtons) {
			if(e.getSource() == buttonPressed) {
				String buttonText = buttonPressed.getText();
				if(buttonText.equalsIgnoreCase("Taste")) {
					
					JFrame frame = new JFrame("TasteBuilder");
					frame.setSize(600, 600);
					frame.setBackground(Color.green);
					frame.add(new TasteBuilder(dishOptions, 4));

//					JLabel label = new JLabel("It's Taste Builder Screen");
//					label.setBounds(100, 100, 100, 100);
//					label.setFont(new Font("Ariel", Font.BOLD, 24));
//					frame.add(label, BorderLayout.NORTH);
	
					frame.setVisible(true);
					
			}
				
			}
		}
		
	}

}
