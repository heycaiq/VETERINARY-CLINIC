package petcaremodel;

import java.time.LocalDateTime;

public class Consultation extends Service {

	private String diagnosis;
	private String prescTreatment;

	public Consultation(LocalDateTime dateTime, Professional professional, String diagnosis, String prescTreatment,
			String obs) {
		super(dateTime, professional, obs);
		this.diagnosis = diagnosis;
		this.prescTreatment = prescTreatment;
	}

	@Override
	public String getServiceType() {
		return "Consultation";
	}

	@Override
	public void execute() {
		System.out.println(" >> Consultation carried out by " + getProfessional().getName());
		System.out.println(" Diagnosis: " + diagnosis);
		System.out.println(" Treatment: " + prescTreatment);
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public String getPrescTreatment() {
		return prescTreatment;
	}

	public void setDiagnosis(String diagnosis) {
		if (diagnosis == null || diagnosis.isBlank())
			throw new IllegalArgumentException("Diagnosis cannot be empty.");
		this.diagnosis = diagnosis;
	}

	public void setPrescTreatment(String treatment) {
		this.prescTreatment = treatment;
	}

}
