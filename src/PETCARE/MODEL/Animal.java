package PETCAREMODEL;

// ANIMAL POSSUI (COMPOSIÇÃO) UM PRONTUÁRIO
public class Animal {

	private int id;
	private String name;
	private String species;
	private String breed;
	private int ageYears;
	private double weightKg;
	private Record record;

	public Animal(int id, String name, String species, String breed, int ageYears, double weightKg, Record record) {
		this.id = id;
		this.name = name;
		this.species = species;
		this.breed = breed;
		this.ageYears = ageYears;
		this.weightKg = weightKg;
		this.record = (record != null) ? record : new Record();
	}

	public void registerService(Service service) {
		record.addService(service);
	}

	public void displayService() {
		System.out.println("--- Medical Record " + name + "'s (" + species + ") ---");
		record.displayHistory();
		System.out.println(" Total Service: " + record.getTotalService());
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}

	public String getBreed() {
		return breed;
	}

	public int getAgeYears() {
		return ageYears;
	}

	public double getWeightKg() {
		return weightKg;
	}

	public Record getRecord() {
		return record;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeightKg(double weightKg) {
		if (weightKg <= 0)
			throw new IllegalArgumentException("Weight must be positive.");
		this.weightKg = weightKg;
	}

	public void setAgeYears(int ageYears) {
		if (ageYears < 0)
			throw new IllegalArgumentException("Age cannot be negative.");
		this.ageYears = ageYears;
	}

	@Override
	public String toString() {
		return name + " | " + species + " ( " + breed + ") | " + ageYears + " year(s) | "
				+ String.format("%.2f", weightKg) + " KG";
	}

}
