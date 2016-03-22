package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

/**
 * @author DSzczechura
 *
 */
public class Student_Test {

	/**
	 * ArrayLists for Course, Semester, Section, and Student needed for testing
	 */
	static ArrayList<Course> CourseTest = new ArrayList<Course>();
	static ArrayList<Semester> SemesterTest = new ArrayList<Semester>();
	static ArrayList<Section> SectionTest = new ArrayList<Section>();
	static ArrayList<Student> StudentTest = new ArrayList<Student>();
	
	@BeforeClass
	public static void setup() throws PersonException {
		
		// 3 Courses created for testing and added to CourseTestArrayList
		
		Course Chemistry = new Course(UUID.randomUUID(), "Chemistry", 100, eMajor.CHEM);
		CourseTest.add(Chemistry);
		
		Course Calculus = new Course(UUID.randomUUID(), "Calculus", 100, eMajor.COMPSI);
		CourseTest.add(Calculus);
		
		Course Accounting = new Course(UUID.randomUUID(), "Accounting", 100, eMajor.BUSINESS);
		CourseTest.add(Accounting);
		
		// Sets the Start and End Dates for Fall Semester
		
		Calendar cal = Calendar.getInstance();
		cal.set(2015, Calendar.SEPTEMBER, 1);
		Date Start_Fall = cal.getTime();
		
		cal.set(2015, Calendar.DECEMBER, 15);
		Date End_Fall = cal.getTime();
		
		// Fall Semester created for testing and added to SemesterTest ArrayList
		
		Semester Fall = new Semester(UUID.randomUUID(), Start_Fall, End_Fall);
		SemesterTest.add(Fall);
		
		// Sets the Start and End Dates for Spring Semester
		
		cal.set(2016, Calendar.FEBRUARY, 8);
		Date Start_Spring = cal.getTime();
		
		cal.set(2016, Calendar.MAY, 20);
		Date End_Spring = cal.getTime();
		
		// Spring Semester created for testing and added to SemesterTest ArrayList
		
		Semester Spring = new Semester(UUID.randomUUID(), Start_Spring, End_Spring);
		SemesterTest.add(Spring);
		
		// 6 Sections created for testing and added to the SectionTest ArrayList
		
		Section Chemistry_Fall = new Section(Chemistry.getCourseID(), Fall.getSemesterID(), 
				UUID.randomUUID(), 001);
		SectionTest.add(Chemistry_Fall);
		
		Section Chemistry_Spring = new Section(Chemistry.getCourseID(), Spring.getSemesterID(),
				UUID.randomUUID(), 001);
		SectionTest.add(Chemistry_Spring);
		
		Section Calculus_Fall = new Section(Calculus.getCourseID(), Fall.getSemesterID(), 
				UUID.randomUUID(), 002);
		SectionTest.add(Calculus_Fall);
		
		Section Calculus_Spring = new Section(Calculus.getCourseID(), Spring.getSemesterID(),
				UUID.randomUUID(), 002);
		SectionTest.add(Calculus_Spring);
		
		Section Accounting_Fall = new Section(Accounting.getCourseID(), Fall.getSemesterID(), 
				UUID.randomUUID(), 003);
		SectionTest.add(Accounting_Fall);
		
		Section Accounting_Spring = new Section(Accounting.getCourseID(), Spring.getSemesterID(),
				UUID.randomUUID(), 003);
		SectionTest.add(Accounting_Spring);
		
		// Sets the DOB for all the Student objects to use
		
		cal.set(1997,Calendar.OCTOBER, 8);
		Date DOB = cal.getTime();
		
		// 10 Students created for testing and added to StudentsTest ArrayList
		
		Student Student_1 = new Student("Daniel", "Stephen", "Szczechura", DOB, eMajor.COMPSI,
				"316 Peach Peddler Path, Dover, DE 19901", "(302)-423-0336", "danielsz@udel.edu");
		StudentTest.add(Student_1);
		
		Student Student_2 = new Student("Joshua", "Alan", "Diehl", DOB, eMajor.BUSINESS,
				"", "(302)-492-0342", "joshd@udel.edu");
		StudentTest.add(Student_2);
		
		Student Student_3 = new Student("Thomas", "Cole", "Ford", DOB, eMajor.COMPSI,
				"", "(302)-111-3333", "colef@udel.edu");
		StudentTest.add(Student_3);
		
		Student Student_4 = new Student("Julie", "Lynn", "Barnett", DOB, eMajor.CHEM,
				"", "(302)-122-3533", "julieb@udel.edu");
		StudentTest.add(Student_4);
		
		Student Student_5 = new Student("Brad", "Christian", "London", DOB, eMajor.PHYSICS,
				"", "(302)-331-9998", "bradl@udel.edu");
		StudentTest.add(Student_5);
		
		Student Student_6 = new Student("William", "Alex", "Jones", DOB, eMajor.PHYSICS,
				"", "(302)-442-6767", "williamj@udel.edu");
		StudentTest.add(Student_6);
		
		Student Student_7 = new Student("Brandon", "James", "Smith", DOB, eMajor.BUSINESS,
				"", "(302)-102-3641", "brandonsf@udel.edu");
		StudentTest.add(Student_7);
		
		Student Student_8 = new Student("Ashley", "Sarah", "Caspar", DOB, eMajor.NURSING,
				"", "(302)-226-3333", "ashley@udel.edu");
		StudentTest.add(Student_8);
		
		Student Student_9 = new Student("James", "Paul", "Blake", DOB, eMajor.CHEM,
				"", "(302)-099-2121", "colef@udel.edu");
		StudentTest.add(Student_9);
		
		Student Student_10 = new Student("Brooke", "Madison", "Sanders", DOB, eMajor.COMPSI,
				"", "(302)-812-5309", "Brookes@udel.edu");
		StudentTest.add(Student_10);
	}

	@Test
	public void EnrollmentGradeTest() {
		
		// Student 1 and 2 enrolled in Chemistry Section 1(Fall) and Chemistry Section 2(Spring)
		
		Enrollment Enrollment_Student1 = new Enrollment(StudentTest.get(0).getStudentID(), 
				SectionTest.get(0).getSectionID());
		
		// Sets Student 1's Grade
		
		Enrollment_Student1.SetGrade(100);
		
		// Calculates and tests Student 1's GPA
		
		double Enrollment_Student1_GPA = Enrollment_Student1.getGrade()/25;
		assertEquals((Enrollment_Student1_GPA), 4.0, 0.1);
		
		Enrollment Enrollment_Student2 = new Enrollment(StudentTest.get(1).getStudentID(), 
				SectionTest.get(1).getSectionID());
		
		// Sets Student 2's Grade
		
		Enrollment_Student2.SetGrade(50);
		
		// Calculates and tests Student 2's GPA
		
		double Enrollment_Student2_GPA = Enrollment_Student2.getGrade()/25;
		assertEquals((Enrollment_Student2_GPA), 2.0, 0.1);
		
		//Student 3 and 4 enrolled in Calculus Section 1(Fall) and Calculus Section 2(Spring)
		
		Enrollment Enrollment_Student3 = new Enrollment(StudentTest.get(2).getStudentID(), 
				SectionTest.get(2).getSectionID());
		
		// Sets Student 3's Grade
		
		Enrollment_Student3.SetGrade(100);
		
		// Calculates and tests Student 3's GPA
		
		double Enrollment_Student3_GPA = Enrollment_Student3.getGrade()/25;
		assertEquals((Enrollment_Student3_GPA), 4.0, 0.1);
		
		Enrollment Enrollment_Student4 = new Enrollment(StudentTest.get(3).getStudentID(), 
				SectionTest.get(3).getSectionID());
		
		// Sets Student 4's Grade
		
		Enrollment_Student4.SetGrade(90);
		
		// Calculates and tests Student 4's GPA
		
		double Enrollment_Student4_GPA = Enrollment_Student4.getGrade()/25;
		assertEquals((Enrollment_Student4_GPA), 3.6, 0.1);
		
		// Student 5 and 6 enrolled in Accounting Section 1(Fall) and Accounting Section 2(Spring)
		
		Enrollment Enrollment_Student5 = new Enrollment(StudentTest.get(4).getStudentID(), 
				SectionTest.get(4).getSectionID());
		
		// Sets Student 5's Grade
		
		Enrollment_Student5.SetGrade(100);
		
		// Calculates Student 5's GPA
		
		double Enrollment_Student5_GPA = Enrollment_Student5.getGrade()/25;
		assertEquals((Enrollment_Student5_GPA), 4.0, 0.1);
		
		Enrollment Enrollment_Student6 = new Enrollment(StudentTest.get(5).getStudentID(), 
				SectionTest.get(5).getSectionID());
		
		// Sets Student 6's Grade
		
		Enrollment_Student6.SetGrade(70);
		
		// Calculates and tests Student 6's GPA
		
		double Enrollment_Student6_GPA = Enrollment_Student6.getGrade()/25;
		assertEquals((Enrollment_Student6_GPA), 2.8, 0.1);
		
		// Student 7 and 8 enrolled in Chemistry Section 1(Fall) and Chemistry Section 2(Spring)
		
		Enrollment Enrollment_Student7 = new Enrollment(StudentTest.get(6).getStudentID(), 
				SectionTest.get(0).getSectionID());
		
		// Sets Student 7's Grade
		
		Enrollment_Student7.SetGrade(100);
		
		// Calculates Student 7's GPA
		
		double Enrollment_Student7_GPA = Enrollment_Student7.getGrade()/25;
		assertEquals((Enrollment_Student7_GPA), 4.0, 0.1);
		
		Enrollment Enrollment_Student8 = new Enrollment(StudentTest.get(7).getStudentID(), 
				SectionTest.get(1).getSectionID());
		
		// Sets Student 8's Grade
		
		Enrollment_Student8.SetGrade(60);
		
		// Calculates and tests Student 9's GPA
		
		double Enrollment_Student8_GPA = Enrollment_Student8.getGrade()/25;
		assertEquals((Enrollment_Student8_GPA), 2.4, 0.1);
		
		// Student 9 and 10 enrolled in Calculus Section 1(Fall) and Calculus Section 2(Spring)
		
		Enrollment Enrollment_Student9 = new Enrollment(StudentTest.get(8).getStudentID(), 
				SectionTest.get(2).getSectionID());
		
		// Sets Student 9's Grade
		
		Enrollment_Student9.SetGrade(100);
		
		// Calculates and tests Student 9's GPA
		
		double Enrollment_Student9_GPA = Enrollment_Student9.getGrade()/25;
		assertEquals((Enrollment_Student9_GPA), 4.0, 0.1);
		
		Enrollment Enrollment_Student10 = new Enrollment(StudentTest.get(9).getStudentID(), 
				SectionTest.get(3).getSectionID());
		
		// Sets Student 10's Grade
		
		Enrollment_Student10.SetGrade(80);
		
		// Calculates and tests Student 10's GPA
		
		double Enrollment_Student10_GPA = Enrollment_Student10.getGrade()/25;
		assertEquals((Enrollment_Student10_GPA), 3.2, 0.1);
		
		// Calculates and tests the Chemistry Course's average GPA
		
		double chemistry_total_grade =(Enrollment_Student1_GPA + Enrollment_Student2_GPA + 
									Enrollment_Student7_GPA + Enrollment_Student8_GPA);
		
		double chemistry_gpa = (chemistry_total_grade/4);
		
		assertEquals(chemistry_gpa, 3.1, 0.1);
		
		// Calculates and tests the Calculus Course's average GPA
		
		double calculus_total_grade =(Enrollment_Student3_GPA + Enrollment_Student4_GPA + 
				Enrollment_Student9_GPA + Enrollment_Student10_GPA);

		double calculus_gpa = (calculus_total_grade/4);
		
		assertEquals(calculus_gpa, 3.7, 0.1);
		
		// Calculates and tests the Accounting Course's average GPA
		
		double accounting_total_grade =(Enrollment_Student5_GPA + Enrollment_Student6_GPA);

		double accounting_gpa = (accounting_total_grade/2);
		
		assertEquals(accounting_gpa, 3.4, 0.1);
			
	}
	
	/**
	 * Tests if a Student's Major can be properly changed
	 */
	@Test
	public void MajorChangeTest() {
		StudentTest.get(0).setMajor(eMajor.NURSING);
		assertEquals(StudentTest.get(0).getMajor(), eMajor.NURSING);
	}
}