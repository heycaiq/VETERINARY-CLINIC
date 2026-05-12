package PETCARE.MODEL;

public abstract class Professional {

	private int id;
	private String name;
	private String telephone;

	public Professional(int id, String name, String telephone) {
		if (id <= 0)
			throw new IllegalArgumentException("ID must be positive.");
		if (name == null || name.isBlank())
			throw new IllegalArgumentException("Name cannot be empty.");
		if (telephone == null || telephone.isBlank())
			throw new IllegalArgumentException("Contact cannot be empty.");
		this.id = id;
		this.name = name;
		this.telephone = telephone;
	}

	public abstract String getPosition();

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "[" + getPosition() + "] " + name + " | Contact: " + telephone;
	}

}
