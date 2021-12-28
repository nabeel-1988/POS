package dto;

public class Dish {
	
	private String id;
	private String name;
	private String imageIconURL;
	private double price;
	private boolean isVageterian;
	private boolean isSpicy;
	
	public Dish(String id, String name, String imageIconURL ,double price) {
		this.id = id;
		this.name = name;
		this.imageIconURL = imageIconURL;
		this.price = price;
	}


	public Dish(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}



	public Dish(String id, String name, String imageIconURL, double price, boolean isVageterian, boolean isSpicy) {
		super();
		this.id = id;
		this.name = name;
		this.imageIconURL = imageIconURL;
		this.price = price;
		this.isVageterian = isVageterian;
		this.isSpicy = isSpicy;
	}


	public boolean isVageterian() {
		return isVageterian;
	}



	public void setVageterian(boolean isVageterian) {
		this.isVageterian = isVageterian;
	}



	public boolean isSpicy() {
		return isSpicy;
	}



	public void setSpicy(boolean isSpicy) {
		this.isSpicy = isSpicy;
	}



	public String getImageIconURL() {
		return imageIconURL;
	}

	public void setImageIconURL(String imageIconURL) {
		this.imageIconURL = imageIconURL;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
	 	
		return (id  +" "+ name + " " + price);
				
	}
	
	

}
