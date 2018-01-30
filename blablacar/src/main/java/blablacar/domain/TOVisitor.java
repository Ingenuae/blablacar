package blablacar.domain;

public class TOVisitor {

	private Long id;

	private String login;
	private String password;

	private String firstName;
	private String lastName;
	
	private Long birthDate;
	private String email;

	private String rating;
	private boolean confirmed;

	public TOVisitor(Visitor visitor) {

		this.id = visitor.getId();

		this.login = visitor.getLogin();
		this.password = visitor.getPassword();

		this.firstName = visitor.getFirstName();
		this.lastName = visitor.getLastName();
		this.birthDate = visitor.getBirthDate();
		this.email = visitor.getEmail();

		this.rating = visitor.getRating();
		this.confirmed = visitor.isConfirmed();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Long birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
}
