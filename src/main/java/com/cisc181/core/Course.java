package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

/**
 * @author DSzczechura
 *
 */

public class Course {
	/**
	 * Attributes for Course Class
	 */
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;

	/**
	 * No-arg Constructor for Course
	 */
	public Course() {

	}

	/**
	 * Constructor for Course
	 * @param CourseID - UUID represents the Course's unique ID
	 * @param CourseName - String that represents the Course's name
	 * @param GradePoints - int that represents the courses total grade points
	 * @param Major - eMajor that represents the major the course falls under
	 */
	public Course(UUID CourseID, String CourseName, int GradePoints, eMajor Major) {
		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.Major = Major;
	}

	/**
	 * @return - Getter for CourseID, returns CourseID
	 */
	public UUID getCourseID() {
		return CourseID;
	}

	/**
	 * @param courseID - Setter for CourseID
	 */
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	/**
	 * @return - Getter for CourseName, returns CourseName
	 */
	public String getCourseName() {
		return CourseName;
	}

	/**
	 * @param courseName - Setter for CourseName
	 */
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	/**
	 * @return - Getter for GradePoints, returns GradePoints
	 */
	public int getGradePoints() {
		return GradePoints;
	}

	/**
	 * @param gradePoints - Setter for GradePoints
	 */
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	/**
	 * @return - Getter for Major, returns Major
	 */
	public eMajor getMajor() {
		return Major;
	}

	/**
	 * @param major - Setter for Major
	 */
	public void setMajor(eMajor major) {
		Major = major;
	}

}
