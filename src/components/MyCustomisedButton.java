package components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import dto.Dish;

public class MyCustomisedButton extends JButton {

//	public JButton customisedButton(String text, String imagepath) {
//
//		ImageIcon imageIcon = new ImageIcon(
//				new ImageIcon(imagepath).getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
//
//		JButton myCustomButton = new JButton(text);
//		myCustomButton.setSize(40, 40);
//		myCustomButton.setIcon(imageIcon);
//		myCustomButton.setBorder(BorderFactory.createEtchedBorder());
//		myCustomButton.setBackground(Color.white);
//		myCustomButton.setForeground(Color.black);
//		myCustomButton.setFont(new Font("Ariel Black", Font.BOLD, 16));
//		myCustomButton.setVerticalTextPosition(JButton.BOTTOM);
//		myCustomButton.setHorizontalTextPosition(JButton.CENTER);
//		myCustomButton.setIconTextGap(5);
//
//		return myCustomButton;
//	}

	public MyCustomisedButton(Dish item) {

		String name = item.getName();
		String id = item.getId();
		double price = item.getPrice();

//		String buttonText =   id + "\n" + name + "\n" + price;
		String buttonText = "<html>" + id + "<br>" + name + "<br>" + price;

		this.setText(buttonText);
		this.setBackground(Color.white);
		this.setForeground(Color.black);
		this.setFont(new Font("Ariel Black", Font.BOLD, 16));
//		this.setVerticalTextPosition(JButton.BOTTOM);
		this.setHorizontalTextPosition(JButton.CENTER);
		this.setBorder(BorderFactory.createEtchedBorder());

	}

	public MyCustomisedButton(Dish item, String imagepath) {

		ImageIcon imageIcon = new ImageIcon(
				new ImageIcon(imagepath).getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));

//		String name = item.getName();
//		String id = item.getId();
//		double price = item.getPrice();

//		String buttonText = id + "\n" + name + "\n" + price;
//		String buttonText = "<html>" + id + "<br>" + name + "<br>" + price;
		
		this.setText(item.getName());
		this.setSize(50, 50);
		this.setIcon(imageIcon);
		this.setBackground(Color.white);
		this.setForeground(Color.black);
		this.setFont(new Font("Ariel Black", Font.BOLD, 12));
		this.setVerticalTextPosition(JButton.BOTTOM);
		this.setHorizontalTextPosition(JButton.CENTER);
		this.setBorder(BorderFactory.createEtchedBorder());
		this.setIconTextGap(5);

	}
}
