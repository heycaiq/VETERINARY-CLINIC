package petcaremodel;

public class Veterinary extends Professional {

	private String crmv;
	private String specialty;

	public Veterinary(int id, String name, String telephone, String crmv, String specialty) {
		super(id, name, telephone);
		if (crmv == null || crmv.isBlank())
			throw new IllegalArgumentException("CRMV cannot be empty.");
		if (specialty == null || specialty.isBlank())
			throw new IllegalArgumentException("Specialty cannot be empty.");
		this.crmv = crmv;
		this.specialty = specialty;
	}

	@Override
	public String getPosition() {
		return "Veterinary";
	}

	public String getCrmv() {
		return crmv;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return super.toString() + " | CRMV: " + crmv + " | SPECIALTY: " + specialty;
	}

}
