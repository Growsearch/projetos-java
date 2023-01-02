
package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;


    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if(finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE : %.2f%n", student.finalGrade());
		
		if(student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}

}


