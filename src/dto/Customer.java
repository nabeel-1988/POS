package dto;

public class Customer {

	String telephone;
	String postcode;
	String address;
	String address2;
	String name;
	String distance;
	String note;

	public Customer(String telephone, String postcode, String address) {
		super();
		this.telephone = telephone;
		this.postcode = postcode;
		this.address = address;
	}

	public Customer(String telephone, String postcode, String address, String address2, String name, String distance,
			String note) {
		super();
		this.telephone = telephone;
		this.postcode = postcode;
		this.address = address;
		this.address2 = address2;
		this.name = name;
		this.distance = distance;
		this.note = note;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
