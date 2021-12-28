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
import javax.swing.JLabel;
import javax.swing.JPanel;

import dto.Dish;

public class DishMenu extends JPanel implements ActionListener{
	
	private JButton dishButton;
	private List<JButton> listOfDishMenuButtons = new ArrayList<>();
	 
	public DishMenu(List<Dish> listOfItems , int columns) {
		
		this.setSize(600, 600);
		this.setBackground(Color.CYAN);
		
		int rows = listOfItems.size() / columns ;
		if (rows % columns != 0) 
			rows = rows + 1;
		
		
		this.setLayout(new GridLayout(rows, columns));
		
		for(int i=0 ; i< listOfItems.size() ; i++) {
			
			Dish item = listOfItems.get(i);
			if(item != null) {
				
				dishButton = new MyCustomisedButton(item);
				dishButton.addActionListener(this);
				listOfDishMenuButtons.add(dishButton);
			}
			this.add(dishButton);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(JButton buttonPressed : listOfDishMenuButtons) {
			if(e.getSource() == buttonPressed) {
				String buttonText = buttonPressed.getText();
				
              if (buttonText.contains("Chow Mein")) {
					
					JFrame frame = new JFrame();
					frame.setSize(400, 400);
					JLabel label = new JLabel("Hello");
					label.setBounds(100, 100, 100, 100);
					label.setFont(new Font("Ariel", Font.BOLD, 24));
					frame.add(label, BorderLayout.NORTH);
					frame.setVisible(true);
					
				}
				
			}
			
		}
		
	}
	 
	

}
