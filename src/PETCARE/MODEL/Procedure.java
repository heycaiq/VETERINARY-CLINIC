package PETCARE.MODEL;

import java.time.LocalDateTime;

public class Procedure extends Service {

	private String descProcedure;
	private double cost;

	public Procedure(LocalDateTime dateTime, Professional professional, String descProcedure, double cost, String obs) {
		super(dateTime, professional, obs);
		this.descProcedure = descProcedure;
		this.cost = cost;
	}

	@Override
	public String getServiceType() {
		return "Procedure";
	}

	@Override
	public void execute() {
		System.out.println(" >> Procedure performed by " + getProfessional().getName());
		System.out.println(" Description: " + descProcedure);
		System.out.printf(" Cost: $ %.2f%n", cost);
	}

	public String getDescProcedure() {
		return descProcedure;
	}

	public double getCost() {
		return cost;
	}

	public void setDescProcedure(String desc) {
		this.descProcedure = desc;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
