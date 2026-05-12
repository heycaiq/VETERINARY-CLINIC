package PETCARE.MODEL;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Service {

	private static int counterId = 1;

	private int id;
	private LocalDateTime dateTime;
	private Professional professional;
	private String obs;

	public Service(LocalDateTime dateTime, Professional professional, String obs) {
		this.id = counterId++;
		this.dateTime = dateTime;
		this.professional = professional;
		this.obs = obs;
	}

	// POLIMORFISMO: CADA SUBTIPO IMPLEMENTA SUA PRÓPRIA DESCRIÇÃO
	public abstract String getServiceType();

	public abstract void execute();

	public int getId() {
		return id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public Professional getProfessional() {
		return professional;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return "Service #" + id + " | Type: " + getServiceType() + " | Date: " + dateTime.format(fmt)
				+ " | Professional: " + professional.getName()
				+ (obs != null && !obs.isEmpty() ? " | OBS: " + obs : "");
	}
}
