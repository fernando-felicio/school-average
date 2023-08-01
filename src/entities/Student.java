package entities;

public class Student {
	
	public String nameStudent;
	public double firstSemesterGrade;
	public double secondSemesterGrade;
	public double thirdSemesterGrade;
	
	//Criando metodo totalAverage
	public double totalAverage() {
		double totalAverage = 100 - (firstSemesterGrade + secondSemesterGrade + thirdSemesterGrade);
		return totalAverage;
	}
	
	//Criando metodo showResult
	public void showResult() {
		System.out.printf("Student: %s, Final Grade: %.2f%n", nameStudent, totalAverage());
	}

}
