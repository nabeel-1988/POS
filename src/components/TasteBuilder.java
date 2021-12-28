package components;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
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

public class TasteBuilder extends JPanel implements ActionListener{

	private List<JButton> tasteButtons = new ArrayList<JButton>();

	public TasteBuilder(String[] tasteIngrediants, int columns) {
		
		this.setPreferredSize(new Dimension(600, 600));
		this.setBackground(Color.yellow);
		
		int rows = tasteIngrediants.length / columns;
		if (rows % columns != 0) {
			rows = rows + 1;
		}
		this.setLayout(new GridLayout(rows, columns));

		for (int i = 0; i < tasteIngrediants.length ; i++) {
			JButton tButton = new JButton(tasteIngrediants[i]);
			tButton.addActionListener(this);
			tasteButtons.add(tButton);
			this.add(tButton);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(JButton buttonPressed : tasteButtons) {
			if(e.getSource() == buttonPressed) {
				String buttonText = buttonPressed.getText();
				
				if(buttonText.equalsIgnoreCase("hot")) {
					JFrame frame = new JFrame();
					frame.setSize(400, 400);
					frame.setBackground(Color.DARK_GRAY);
					JLabel label = new JLabel("This Dish is Spicy");
					label.setBounds(100, 100, 100, 100);
					label.setFont(new Font("Ariel", Font.BOLD, 24));
					frame.add(label, BorderLayout.NORTH);
					frame.setVisible(true);
					
				}
			}
		}
		
	}

}
