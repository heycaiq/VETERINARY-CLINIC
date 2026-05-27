package petcareservice;

import java.util.ArrayList;
import java.util.List;
import petcaremodel.Customer;
import petcaremodel.Professional;
import petcaremodel.Appointment;

public class ClinicalService {

	private List<Customer> customers;
	private List<Professional> professionals;
	private List<Appointment> appointments;

	public ClinicalService() {
		this.customers = new ArrayList<>();
		this.professionals = new ArrayList<>();
		this.appointments = new ArrayList<>();
	}

	public void registerCustomer(Customer customer) {
		customers.add(customer);
		System.out.println("✔ Customer registered: " + customer.getName());
	}

	public Customer searchCustomerID(int id) {
		for (Customer c : customers) {
			if (c.getId() == id)
				return c;
		}
		return null;
	}

	public void listCustomers() {
		System.out.println("\n--- CUSTOMER REGISTERED --- ");
		if (customers.isEmpty()) {
			System.out.println(" No customer. ");
			return;
		}
		for (Customer c : customers)
			System.out.println("  " + c);
	}

	public void registerProfessional(Professional p) {
		professionals.add(p);
		System.out.println("✔ Professional registered " + p.getName() + " (" + p.getPosition() + ")");
	}

	public void listProfessionals() {
		System.out.println("\n--- PROFESSIONAL REGISTERED --- ");
		if (professionals.isEmpty()) {
			System.out.println(" No professional. ");
			return;
		}
		for (Professional p : professionals)
			System.out.println("  " + p);
	}

	public void addAppointment(Appointment appointment) {
		appointments.add(appointment);
		System.out.println("✔ " + appointment);
	}

	public void performAppointment(int id) {
		Appointment ap = searchAppointmentID(id);
		if (ap == null) {
			System.out.println("✖ Appointment #" + id + " not found.");
			return;
		}
		ap.perform();
	}

	public void listAppointments() {
		System.out.println("\n--- APPOINTMENTS. ---");
		if (appointments.isEmpty()) {
			System.out.println(" No appointment");
			return;
		}
		for (Appointment a : appointments)
			System.out.println("  " + a);
	}

	private Appointment searchAppointmentID(int id) {
		for (Appointment a : appointments) {
			if (a.getId() == id)
				return a;
		}
		return null;
	}
}
