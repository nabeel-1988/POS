package components;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import dto.Dish;
import repositories.Impl.InMemoryReposImpl;

public class DishCategories extends JPanel implements ActionListener {


	private List<JButton> listOfDishCategoryButtons = new ArrayList<JButton>();
	private InMemoryReposImpl inMemoryRepos = new InMemoryReposImpl();


	public JPanel createDishMenu(List<Dish> dishList, int columns) {
		JButton customButton = null;
		JPanel dishCategories = new JPanel();
		dishCategories.setSize(600, 600);
		dishCategories.setBackground(Color.lightGray);

		int rows = (dishList.size() / columns);

		if (rows % columns != 0) {
			rows = rows + 1;
		}

		dishCategories.setLayout(new GridLayout(rows, columns));

		for (int i = 0; i < dishList.size(); i++) {
			JButton tempButton = new JButton(dishList.get(i).getName());

			if (!(tempButton.getText().equalsIgnoreCase(""))) {

				customButton = new MyCustomisedButton(dishList.get(i), "../POS/images/chow-mein.jpg");
				customButton.addActionListener(this);
				listOfDishCategoryButtons.add(customButton);

			}

			dishCategories.add(customButton);
		}

		return dishCategories;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (JButton buttonPressed : listOfDishCategoryButtons) {

			if (e.getSource() == buttonPressed) {
				String buttonText = buttonPressed.getText();
					
					JFrame frame = new JFrame();
					frame.setSize(600, 600);
					frame.add(new DishMenu(inMemoryRepos.retrieve(buttonText) , 5));
					frame.setVisible(true);

			}
		}

	}
}
