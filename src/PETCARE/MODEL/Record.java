package PETCARE.MODEL;

import java.util.List;
import java.util.ArrayList;

// COMPOSIÇÃO: PRONTUÁRIO SÓ EXISTE VINCULADO A UM ANIMAL
public class Record {

	private List<Service> history;

	public Record() {
		this.history = new ArrayList<>();
	}

	// ENCAPSULAMENTO: SÓ ADICIONA ATENDIMENTO POR ESTE MÉTODO CONTROLADO
	public void addService(Service service) {
		if (service == null) {
			throw new IllegalArgumentException("Service cannot be nonexistent!");
		}
		
		history.add(service);
		System.out.println(" ✔ Service recorded in the medical record.");
	}

	public List<Service> getHistory() {
		return new ArrayList<>(history);
	}

	public void displayHistory() {
		if (history.isEmpty()) {
			System.out.println(" No service was recorded.");
			return;
		}
		for (Service a : history) {
			System.out.println(" - " + a);
		}
	}

	public int getTotalService() {
		return history.size();
	}
}
