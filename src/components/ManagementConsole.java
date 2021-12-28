package components;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ManagementConsole extends JPanel {


	public JPanel createManagementConsolePanel(String[] managementOptions, int columns) {

		JPanel managementConsolePanel = new JPanel();
		managementConsolePanel.setSize(200, 500);
		managementConsolePanel.setBackground(Color.pink);
		
		int rows = (managementOptions.length / columns);

		if (rows % 2 != 0) {
			rows = rows + 1;
		}

		managementConsolePanel.setLayout(new GridLayout(rows, columns));

		for (int i = 0; i < managementOptions.length; i++) {
			managementConsolePanel.add(new JButton(managementOptions[i]));
		}

		return managementConsolePanel;

	}
}
