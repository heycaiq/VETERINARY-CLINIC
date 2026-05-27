package petcaremodel;

import java.util.ArrayList;
import java.util.List;

// AGREGAÇÃO: CLIENTE POSSUI VÁRIOS ANIMAIS (1 PARA MUITOS (1:N)) 
public class Customer {

	private int id;
	private String name;
	private String cpf;
	private String telephone;
	private String email;
	private List<Animal> animals;

	public Customer(int id, String name, String cpf, String telephone, String email) {
		if (name == null || name.isBlank())
			throw new IllegalArgumentException("Name cannot be empty.");
		if (cpf == null || cpf.isBlank())
			throw new IllegalArgumentException("CPF cannot be empty.");
		if (telephone == null || telephone.isBlank())
			throw new IllegalArgumentException("Telephone cannot be empty.");
		if (email == null || email.isBlank())
			throw new IllegalArgumentException("Email cannot be empty.");

		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.telephone = telephone;
		this.email = email;
		this.animals = new ArrayList<>();
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
		System.out.println(" ✓ Animal '" + animal.getName() + "' linked to the customer " + name + ".");
	}

	public void removeAnimal(Animal animal) {
		if (animals.remove(animal)) {
			System.out.println(" ✓ Animal '" + animal.getName() + "' removed from customer " + name + ".");
		} else {
			System.out.println(" ✗ Animal not found.");
		}
	}

	public List<Animal> getAnimals() {
		return new ArrayList<>(animals);
	}

	public Animal searchAnimalPerName(String name) {
		for (Animal a : animals) {
			if (a.getName().equalsIgnoreCase(name))
				return a;
		}
		return null;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer #" + id + " | " + name + " | CPF: " + cpf + " | Tel: " + telephone + " | Email: " + email
				+ " | Animals: " + animals.size();
	}
}
