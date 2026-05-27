package petcaremodel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {

	public enum Status {
		SCHEDULED, PERFORMED, CANCELED
	}

	private static int counterId = 1;

	private int id;
	private Animal animal;
	private Service service;
	private LocalDateTime dateTime;
	private Status status;

	public Appointment(Animal animal, Service service, LocalDateTime dateTime) {
		this.id = counterId++;
		this.animal = animal;
		this.service = service;
		this.dateTime = dateTime;
		this.status = Status.SCHEDULED;
	}

	public void perform() {
		if (status == Status.CANCELED) {
			System.out.println(" → Appointment #" + id + " is canceled and cannot be carried out. ");
			return;
		}
		System.out.println("\n--- Making an appointment #" + id + "---");
		service.execute(); // POLIMORFISMO: CHAMA O MÉTODO CORRETO DO SUBTIPO
		animal.registerService(service);
		this.status = Status.PERFORMED;
		System.out.println(
				" ✔ Appointment #" + id + " completed and recorded in medical record " + animal.getName() + ".");
	}

	public void cancel() {
		this.status = Status.CANCELED;
		System.out.println(" ✔ Appointment #" + id + " canceled.");
	}

	public int getId() {
		return id;
	}

	public Animal getAnimal() {
		return animal;
	}

	public Service getService() {
		return service;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public Status getStatus() {
		return status;
	}

	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return "Appointment #" + id + " | Animal: " + animal.getName() + " | Date: " + dateTime.format(fmt)
				+ " | Status: " + status;
	}
}
