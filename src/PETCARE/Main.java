package petcare;

import java.time.LocalDateTime;
import PETCARE.MODEL.*;
import PETCARE.SERVICE.ClinicalService;

public class Main {

	public static void main(String[] args) {

		ClinicalService clinic = new ClinicalService();

		// 1 - CADASTRO DE PROFISSIONAIS (HERANÇA)
		System.out.println(" --- - ---   --- - ---");
		System.out.println(" PETCARE MANAGER - VETERINARY SYSTEM ");
		System.out.println(" --- - ---   --- - ---\n");

		System.out.println(" >>> Registering professionals... <<<< ");
		Veterinary vet1 = new Veterinary(1, "Doctor Clarke", "(77) 99123-4567", "CRMV-BA 12345",
				"General Practitioner");
		Veterinary vet2 = new Veterinary(2, "Doctor Bellamy", "(77) 98765-4321", "CRMV-BA 10101", "Surgeon");
		VeterinaryAssistant va1 = new VeterinaryAssistant(3, "Octavia", "(77) 91234-5670", "Vaccination and Screening");

		clinic.registerProfessional(vet1);
		clinic.registerProfessional(vet2);
		clinic.registerProfessional(va1);

		clinic.listProfessionals();

		// 2 - CADASTRO DE CLIENTES E ANIMAIS (AGREGAÇÃO)
		System.out.println("\n>>> Registering clients and animals... <<<");

		Customer customer1 = new Customer(1, "Abgail G", "123.456.789-00", "(77) 91999-9999", "aby@email.com");
		Animal lully = new Animal(1, "Lully", "Cat", "Maine Coon", 1, 7.0, new MedicalRecord());
		Animal wendy = new Animal(2, "Wendy", "Cat", "Maine Coon", 1, 5.8, new MedicalRecord());
		customer1.addAnimal(lully);
		customer1.addAnimal(wendy);

		Customer customer2 = new Customer(1, "Finn H", "987.654.321-10", "(77) 91999-9191", "finny@email.com");
		Animal bambam = new Animal(1, "Bambam", "Dog", "Chihuahua", 2, 2.6, new MedicalRecord());
		customer2.addAnimal(bambam);

		clinic.registerCustomer(customer1);
		clinic.registerCustomer(customer2);

		clinic.listCustomers();

		// 3 - AGENDAMENTOS (POLIMORFISMO EM AÇÃO)
		System.out.println("\n>>> Creating appointments... <<<");

	}
}
