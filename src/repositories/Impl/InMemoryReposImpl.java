package repositories.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dto.Dish;
import repositories.Repository;

public class InMemoryReposImpl implements Repository  {

	private Map<String, List<Dish>> menu = new HashMap<String, List<Dish>>();

	@Override
	public void add(String dishCategory, Dish dish) {
		if (menu.containsKey(dishCategory)) {
			List<Dish> dishesInCategory = menu.get(dishCategory);
			dishesInCategory.add(dish);

		} else {
			List<Dish> dishesInMap = new ArrayList<Dish>();
			dishesInMap.add(dish);
			
			menu.put(dishCategory, dishesInMap);
		}
		
	}

	@Override
	public List<Dish> retrieve(String dishCategory) {
		if (menu.containsKey(dishCategory)) {
			List<Dish> dishesInCategory = menu.get(dishCategory);

			return dishesInCategory;
		}
		return null;
	}

	@Override
	public void delete(String dishCategory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Dish> retrieveAll() {
		
		return null;
	}

}
