package blablacar.domain;

public class TOVisitor {

	private Long id;

	private String login;
	private String password;

	private String firstName;
	private String lastName;
	private Long birthDate;
	private String email;

	private Long rating;
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
}
