package alekseybykov.portfolio.jibx.ex02;

public class Publisher {
	private Owner owner;
	private String city;
	private String state;
	private String street;
	private String phone;
	private Object zip;

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/*the following methods needs only for testing*/
	public Owner getOwner() {
		return owner;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getStreet() {
		return street;
	}

	public String getPhone() {
		return phone;
	}

	public Object getZip() {
		return zip;
	}
}
