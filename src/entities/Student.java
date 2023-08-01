package entities;

public class Student {
	
	public String nameStudent;
	public double firstSemesterGrade;
	public double secondSemesterGrade;
	public double thirdSemesterGrade;
	
	//Criando metodo totalAverage
	public double totalAverage() {
		double totalAverage = (firstSemesterGrade + secondSemesterGrade + thirdSemesterGrade);
		return totalAverage;
	}
	
	//Criando metodo showResult
	public void showResult() {
		System.out.printf("Student: %s, Final Grade = %.2f%n", nameStudent, totalAverage());
	}
	
	public double missingPoints() {
		double missingPoints = 60 - totalAverage();
		return missingPoints;
	}
	
	//Criando regra de negócio "condicional"
	public void finalGrade() {
		
		if (totalAverage() >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", missingPoints());
		}
	}
	

}
