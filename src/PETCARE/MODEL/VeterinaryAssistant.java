package petcaremodel;

public class VeterinaryAssistant extends Professional {

	private String jobFunction;

	public VeterinaryAssistant(int id, String name, String telephone, String jobFunction) {
		super(id, name, telephone);
		if (jobFunction == null || jobFunction.isBlank())
			throw new IllegalArgumentException("Function cannot be empty.");
		this.jobFunction = jobFunction;
	}

	@Override
	public String getPosition() {
		return "Veterinary Assistant";
	}

	public String getFunction() {
		return jobFunction;
	}

	public void setFunction(String jobFunction) {
		this.jobFunction = jobFunction;
	}

	@Override
	public String toString() {
		return super.toString() + " | Function: " + jobFunction;
	}
}
