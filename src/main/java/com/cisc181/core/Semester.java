package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

/**
 * @author DSzczechura
 *
 */
public class Semester {

	/**
	 * Attributes for Semester class
	 */
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;

	/**
	 * No-arg constructor for Semester
	 */
	public Semester() {

	}

	/**
	 * Constructor for Semester
	 * @param SemesterID - represents the unique SemesterID
	 * @param StartDate - represents the Semester's start date
	 * @param EndDate - represents the Semester's end date
	 */
	public Semester(UUID SemesterID, Date StartDate, Date EndDate) {
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}

	/**
	 * @return - Getter for SemesterID, returns SemesterID
	 */
	public UUID getSemesterID() {
		return SemesterID;
	}

	/**
	 * @param semesterID - Setter for SemesterID
	 */
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	/**
	 * @return - Getter for StartDate, returns StartDate
	 */
	public Date getStartDate() {
		return StartDate;
	}

	/**
	 * @param startDate - Setter for StartDate
	 */
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	/**
	 * @return - Getter for EndDate, returns EndDate
	 */
	public Date getEndDate() {
		return EndDate;
	}

	/**
	 * @param endDate - Setter for EndDate
	 */
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

}
