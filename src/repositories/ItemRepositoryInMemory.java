package repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dto.Dish;

public class ItemRepositoryInMemory {

	/*
	 * create retrieve update delete
	 */

	List<Dish> itemList = new ArrayList<>();
	List<Dish> dishes = new ArrayList<Dish>();

	private String[] dishOptions = { "Appetiser", "Spare Ribs", "Soup", "Rice", "Chow Min", "Duck", "Seafood",
			"Chicken", "Beef", "Roast Pork", "Curry", "Lamb", "Sweet Sour", "Chop Suey", "Foo Yung", "Vagetable",
			"Desserts", "Soft Drinks", "Chef Special", "Set Meal", "Special Set Meal", "Others", "Beancurd",
			"Thai Curry", "Extra", "" };

	Map<String, List<Dish>> database = new HashMap<String, List<Dish>>();
	Map<Object, List<Object>> categoriesWithDishesData = new HashMap<Object, List<Object>>();

	

	public void addToMap(String dishCategory, Dish item) {

		if (database.get(dishCategory) != null) {
			dishes = database.get(dishCategory);
			dishes.add(item);
		}
		dishes = new ArrayList<Dish>();
		dishes.add(item);
		database.put(dishCategory, dishes);

	}

	public List<Dish> getDishList(String dishCategory) {

		if (database.get(dishCategory) != null) {
			List<Dish> dishMenu = database.get(dishCategory);
			return dishMenu;

		}

		return null;

	}

	public void addItem(Dish item) {

		itemList.add(item);

	}

	public Dish retrieveItem(String id) {

		for (Dish item : itemList) {
			String itemId = item.getId();
			if (itemId.equalsIgnoreCase(id)) {
				return item;
			}

		}
		System.out.println("Item not found!!");
		return null;
	}

	public void deleteItem(String id) {

		Dish itemToDelete = retrieveItem(id);
		if (itemToDelete != null) {
			itemList.remove(itemToDelete);
		}
		System.out.println("Item not found");
	}

	public List<Dish> retrieveAllItems() {

		if (itemList != null) {
			return itemList;

		}
		System.out.println("List is Empty");
		return null;

	}

	public void addList(String Category, List<Dish> list) {

		database.put(dishOptions[4], itemList);

	}

	public List<Dish> getList(String Category) {
		for (int i = 0; i < 23; i++) {
			Dish item = new Dish("1", "Chow mein", 5.45 + i);
			dishes.add(item);
		}
		database.put("Chow mein", dishes);
		List<Dish> list1 = database.get(Category);
		return list1;
	}

}
