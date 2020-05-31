package alekseybykov.portfolio.jibx.ex02;

/**
 * @author Aleksey Bykov
 * @since 05.05.2020
 */
public class Owner {
	private int id;
	private String firstName;
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*the following methods needs only for testing*/

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
