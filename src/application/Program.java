package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		Student student = new Student();
		
		System.out.println("Student Name: ");
		student.nameStudent = sc.nextLine();
		
		System.out.println("Grade First Semester: ");
		student.firstSemesterGrade = sc.nextDouble();
		
		System.out.println("Grade Second Semester: ");
		student.secondSemesterGrade = sc.nextDouble();
		
		System.out.println("Grade Third Semester: ");
		student.thirdSemesterGrade = sc.nextDouble();
		
		student.showResult();
		student.finalGrade();
		
		sc.close();

	}

}
