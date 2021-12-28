

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import components.CustomerDetails;
import components.DishCategories;
import components.ManagementConsole;
import components.OperationsConsole;
import components.OrderDisplay;
import dto.Dish;
import frameTester.FrameTester;
import repositories.ItemRepositoryInMemory;
import repositories.Impl.InMemoryReposImpl;

public class Main {

	public static void main(String[] args) {
		FrameTester frametester = new FrameTester();
	InMemoryReposImpl itemRepost = new InMemoryReposImpl();
		
		for (int i = 0; i < 10; i++) {
			String id = Integer.toString(i+1);
			Dish item = new Dish(id , "Chow Mein", 5.45 + i);
			itemRepost.add("Chow Mein", item);

		}

		List<Dish> list5 = itemRepost.retrieve("Chow Mein");

		System.out.println(list5);
		
		String [] dishOptions = {"Appetiser","Spare Ribs",
				"Soup", "Rice","Chow Min","Duck", "Hot","Seafood",
				"Chicken","Beef","Roast Pork","Curry",
			    "Lamb", "Sweet Sour" ,"Chop Suey", "Foo Yung",
			    "Vagetable", "Desserts", "Soft Drinks", "Chef Special",
			    "Set Meal", "Special Set Meal", "Others", "Beancurd",
			    "Thai Curry", "Extra",""};
		
		int columns = 5;
//		
		DishCategories dishMenu = new DishCategories();
	
		String [] managementOptions = {"Customer","Postcode and Map",
				"Menu Category", "Menu Input","Management","Record","Printer Setting",
				"Operator","Taste Setting","Summary","About"};
		int mcpColumns = 1;
		
		ManagementConsole mc = new ManagementConsole();
		JPanel managementConsolePanel = mc.createManagementConsolePanel(managementOptions, mcpColumns);
		frametester.add(managementConsolePanel , BorderLayout.EAST);

		String [] operationsOptions = {"Clear","Up","Down", "-","+","Home","Cash",
				".","Taste","Cancel","Reciept","Edit","KeyBoard","English","Options"};
		
		int ocpColumns = 1;
		
		frametester.add(new OperationsConsole(operationsOptions , 1), BorderLayout.SOUTH);
		
		CustomerDetails customerDetails = new CustomerDetails();
		JPanel customerDetailsConsole = customerDetails.createCustomerDetailsPanel();
		frametester.add(customerDetailsConsole, BorderLayout.WEST);
//		
//		
		ItemRepositoryInMemory itemRepos = new ItemRepositoryInMemory();
//		
		for(int i=0; i<23 ; i++) {
			Dish item = new Dish("1", "Chow Mein" , 5.45+i);
			itemRepos.addItem(item);			
		}
//		
//		for(int i=0; i<23 ; i++) {
//			Item item = new Item("1", "Chow mein" , 5.45+i);
//			itemRepos.addToMap("Chow mein", item);		
//		}
//		
//		List<Item> list = itemRepos.getDishList("Chow mein");
//		for(Item itemInList : list) {
//			System.out.println(itemInList);
//		}
//		
////		Item item1 = itemRepos.retrieveItem("1");
////		System.out.println(item1.toString());
//		
		List<Dish> allItems = itemRepos.retrieveAllItems();
//		
//		
////		for(Item item : allItems) {
////			
////			System.out.println(item);
////		}
//
		String [] index= new String[]{"ID", "Dish", "Price"};

		Object[][] rawData = new Object[] [] {
			{"1", "Chow mein" , 5.45},
			{"2", "Chow mein" , 5.45},
			{"3", "Chow mein" , 5.45},
			{"4", "Chow mein" , 5.45},
			{"5", "Chow mein" , 5.45},
			{"6", "Chow mein" , 5.45},
			{"7", "Chow mein" , 5.45},
			{"8", "Chow mein" , 5.45},
			{"9", "Chow mein" , 5.45},
			{"10", "Chow mein" , 5.45}
			};
		
		OrderDisplay orderDisplay = new OrderDisplay();
		JScrollPane orderTable = orderDisplay.createOrderDisplay( rawData , index);


		JPanel combinedPanel = new JPanel();
		combinedPanel.setSize(200, 1000);
		combinedPanel.setLayout(new GridLayout(2,1));
		combinedPanel.add(customerDetailsConsole);
		combinedPanel.add(orderTable);
		
		
		JPanel dishCategoriesPanel = dishMenu.createDishMenu(allItems, columns);
		frametester.add(dishCategoriesPanel , BorderLayout.CENTER);
		
//		frametester.add(new DishMenu(list5, columns), BorderLayout.CENTER);
		
		frametester.add(combinedPanel , BorderLayout.WEST);
		frametester.pack();
		frametester.setExtendedState(JFrame.MAXIMIZED_BOTH);

	

	}

}
