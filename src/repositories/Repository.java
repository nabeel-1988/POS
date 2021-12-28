package repositories;

import java.util.List;

import dto.Dish;

public interface Repository {
	

		void add (String dishCategory , Dish dish);
		Object retrieve (String dishCategory);
		void delete(String dishCategory);
		List<Dish> retrieveAll ();
	}

