package com.cisc181.core;

import java.util.UUID;

/**
 * @author DSzczechura
 *
 */
public class Enrollment {

	/**
	 * Attributes for Enrollment class
	 */
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	/**
	 * No-arg constructor for Enrollment
	 */
	public Enrollment() {

	}

	/**
	 * Constructor for Enrollment
	 * @param StudentID - represents the unique StudentID associated with the particular enrollment
	 * @param SectionID - represents the unique SectionID associated with the particular enrollment
	 */
	public Enrollment(UUID StudentID, UUID SectionID) {
		this();
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = UUID.randomUUID();
	}

	/**
	 * @return - Getter for SectionID, returns SectionID
	 */
	public UUID getSectionID() {
		return SectionID;
	}

	/**
	 * @return - Getter for StudentID, returns StudentID
	 */
	public UUID getStudentID() {
		return StudentID;
	}

	/**
	 * @return - Getter for EnrollmentID, returns EnrollmentID
	 */
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	/**
	 * @return - Getter for Grade, returns Grade
	 */
	public double getGrade() {
		return Grade;
	}

	/**
	 * @param Grade - Setter for Grade
	 */
	public void SetGrade(double Grade) {
		this.Grade = Grade;
	}

}
