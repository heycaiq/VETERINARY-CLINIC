package PETCARE.MODEL;

import java.time.LocalDateTime;

public class Vaccine extends Service {

	private String vaccineName;
	private LocalDateTime nextDose;

	public Vaccine(LocalDateTime dateTime, Professional professional, String vaccineName, LocalDateTime nextDose,
			String obs) {
		super(dateTime, professional, obs);
		this.vaccineName = vaccineName;
		this.nextDose = nextDose;

	}

	@Override
	public String getServiceType() {
		return "Vaccine";
	}

	@Override
	public void execute() {
		System.out.println(" >> Vaccine administered by " + getProfessional().getName());
		System.out.println(" Vaccine: " + vaccineName);
		if (nextDose != null) {
			System.out.println(" Next dose: " + nextDose.toLocalDate());

		}
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public LocalDateTime getNextDose() {
		return nextDose;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public void setNextDose(LocalDateTime nextDose) {
		this.nextDose = nextDose;
	}

	@Override
	public String toString() {
		return super.toString() + " | Vaccine: " + vaccineName
				+ (nextDose != null ? " | Next dose: " + nextDose.toLocalDate() : "");
	}
}
