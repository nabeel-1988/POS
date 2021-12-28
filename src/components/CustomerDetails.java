package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class CustomerDetails extends JPanel{
	
//	public CustomerDetails(JFrame frame) {
//		
//		JLabel tel = new JLabel("Tel");
//		tel.setBounds(0, 0, 40, 20);
//
//		JLabel postcode = new JLabel("Postcode");
//		postcode.setBounds(0, 20, 40, 20);
//		
//		JLabel address = new JLabel("Address");
//		address.setBounds(0, 40, 40, 20);
//
//		JLabel address2 = new JLabel("Address");
//		address2.setBounds(0, 120, 40, 20);
//
//		JLabel name = new JLabel("Name");
//		name.setBounds(0, 160, 40, 20);
//		
//		JLabel distance = new JLabel("Distance");
//		distance.setBounds(0, 360, 40, 20);
//		
//		JLabel note = new JLabel("Note");
//		note.setBounds(0, 220, 40, 60);
//
//		
//		
//		JTextField telTextField = new JTextField();
//		telTextField.setBounds(90, 0, 360, 20);
//		telTextField.setBorder(BorderFactory.createLineBorder(Color.green));
//
//		JTextField postcodeTextField = new JTextField();
//		postcodeTextField.setBounds(90, 20, 360, 20);
//		postcodeTextField.setBorder(BorderFactory.createLineBorder(Color.blue));
//		
//		JTextField addressTextField = new JTextField();
//		addressTextField.setBounds(90, 40, 360, 20);
//		addressTextField.setBorder(BorderFactory.createLineBorder(Color.green));
//
//		JTextField address2TextField = new JTextField();
//		address2TextField.setBounds(90, 120, 360, 20);
//		address2TextField.setBorder(BorderFactory.createLineBorder(Color.blue));
//		
//		JTextField nameTextField = new JTextField();
//		nameTextField.setBounds(90, 160, 360, 20);
//		nameTextField.setBorder(BorderFactory.createLineBorder(Color.green));
//
//		JTextField distanceTextField = new JTextField();
//		distanceTextField.setBounds(90, 360, 360, 20);
//		distanceTextField.setBorder(BorderFactory.createLineBorder(Color.blue));
//		
//		JTextField noteTextField = new JTextField();
//		noteTextField.setBounds(90, 220, 360, 20);
//		noteTextField.setBorder(BorderFactory.createLineBorder(Color.green));
//
//		
//		this.setBounds(0, 0, 300, 200);
//		this.setBackground(Color.gray);
//		this.setLayout(new BorderLayout());
//		
//		this.add(tel);
//		this.add(telTextField);
//		this.add(postcode);
//		this.add(postcodeTextField);
//		this.add(address);
//		this.add(addressTextField);
//		this.add(address2);
//		this.add(address2TextField);
//		this.add(name);
//		this.add(nameTextField);
//		this.add(distance);
//		this.add(distanceTextField);
//		this.add(note);
//		this.add(noteTextField);
//		this.add(note);
//		
//		frame.add(this);
//		
//	}
	
	public JPanel createCustomerDetailsPanel() {
		JPanel customerDetailsConsole = new JPanel();
		customerDetailsConsole.setPreferredSize(new Dimension(400,400));
		customerDetailsConsole.setBackground(Color.gray);
		customerDetailsConsole.setLayout(new GridLayout(7,2));
		
		JLabel telephone = new JLabel("Telephone");
		telephone.setSize(40, 20);
//		telephone.setPreferredSize(new Dimension(40,20));
		telephone.setHorizontalTextPosition(JLabel.RIGHT);
		telephone.setAlignmentX(JLabel.RIGHT_ALIGNMENT);


		JLabel postcode = new JLabel("Postcode");
		postcode.setSize(40, 20);
		postcode.setHorizontalTextPosition(JLabel.RIGHT);
		
		JLabel address = new JLabel("Address");
		address.setSize(40, 20);
		address.setHorizontalTextPosition(JLabel.RIGHT);

		JLabel address2 = new JLabel("Address");
		address2.setSize(40, 20);
		address2.setHorizontalTextPosition(JLabel.RIGHT);

		JLabel name = new JLabel("Name");
		name.setSize(40, 20);
		name.setAlignmentX(LEFT_ALIGNMENT);
		name.setHorizontalTextPosition(JLabel.RIGHT);
		
		JLabel distance = new JLabel("Distance");
		distance.setSize(40, 20);
		distance.setAlignmentX(LEFT_ALIGNMENT);
		distance.setHorizontalTextPosition(JLabel.RIGHT);
		
		JLabel note = new JLabel("Note");
		note.setSize(40, 20);
		note.setAlignmentX(LEFT_ALIGNMENT);
		note.setHorizontalTextPosition(JLabel.RIGHT);

		
		
		JTextField telephoneTextField = new JTextField(20);
		telephoneTextField.setPreferredSize(new Dimension(360,20));
		telephoneTextField.requestFocus();
		telephoneTextField.setBorder(BorderFactory.createLineBorder(Color.green));

		JTextField postcodeTextField = new JTextField();
		postcodeTextField.setPreferredSize(new Dimension(360,20));
		postcodeTextField.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		JTextField addressTextField = new JTextField();
		addressTextField.setPreferredSize(new Dimension(360,20));
		addressTextField.setBorder(BorderFactory.createLineBorder(Color.green));

		JTextField address2TextField = new JTextField();
		address2TextField.setPreferredSize(new Dimension(360,20));
		address2TextField.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		JTextField nameTextField = new JTextField();
		nameTextField.setPreferredSize(new Dimension(360,20));
		nameTextField.setBorder(BorderFactory.createLineBorder(Color.green));

		JTextField distanceTextField = new JTextField();
		distanceTextField.setPreferredSize(new Dimension(360,20));
		distanceTextField.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		JTextField noteTextField = new JTextField();
		JScrollBar sb = new JScrollBar();
		sb.setVisible(true);
		noteTextField.add(sb);
		noteTextField.setPreferredSize(new Dimension(360,20));
		noteTextField.setBorder(BorderFactory.createLineBorder(Color.green));

		
		
		customerDetailsConsole.add(telephone);
		customerDetailsConsole.add(telephoneTextField);
		customerDetailsConsole.add(postcode);
		customerDetailsConsole.add(postcodeTextField);
		customerDetailsConsole.add(address);
		customerDetailsConsole.add(addressTextField);
		customerDetailsConsole.add(address2);
		customerDetailsConsole.add(address2TextField);
		customerDetailsConsole.add(name);
		customerDetailsConsole.add(nameTextField);
		customerDetailsConsole.add(distance);
		customerDetailsConsole.add(distanceTextField);
		customerDetailsConsole.add(note);
		customerDetailsConsole.add(noteTextField);
		
		
		
		return customerDetailsConsole;
	}

}
