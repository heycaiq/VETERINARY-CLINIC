package PETCARE.MODEL;

import java.time.LocalDateTime;

public class Exam extends Service {

	private String typeExam;
	private String result;

	public Exam(LocalDateTime dateTime, Professional professional, String typeExam, String result, String obs) {
		super(dateTime, professional, obs);
		this.typeExam = typeExam;
		this.result = (result != null) ? result : "Waiting";
	}

	@Override
	public String getServiceType() {
		return "Examination";
	}

	@Override
	public void execute() {
		System.out.println(" >> Examination performed by " + getProfessional().getName());
		System.out.println(" Type: " + typeExam);
		System.out.println(" Result: " + result);
	}

	public String getTypeExam() {
		return typeExam;
	}

	public String getResult() {
		return result;
	}

	public void setTypeExam(String typeExam) {
		this.typeExam = typeExam;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return super.toString() + " | Exam: " + typeExam + " | Result: " + result;
	}
}
