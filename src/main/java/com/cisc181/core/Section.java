package com.cisc181.core;

import java.util.UUID;

/**
 * @author DSzczechura
 *
 */
public class Section {

	/**
	 * Attributes for the Section Class
	 */
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;

	/**
	 * No-arg Constructor for Section Class
	 */
	public Section() {

	}

	/**
	 * Constructor for Section class
	 * @param CourseID - represents the unique ID of the Course tied with the particular Section 
	 * @param SemesterID - represents the unique ID of the Semester tied with the particular Section
	 * @param SectionID - represents  the unique ID of the Section
	 * @param RoomID - represents the room number where the Section is held
	 */
	public Section(UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID) {
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.SectionID = SectionID;
		this.RoomID = RoomID;
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
	 * @return - Getter for SectionID, returns SectionID
	 */
	public UUID getSectionID() {
		return SectionID;
	}

	/**
	 * @param sectionID - Setter for SectionID
	 */
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	/**
	 * @return - Getter for RoomID, returns RoomID
	 */
	public int getRoomID() {
		return RoomID;
	}

	/**
	 * @param roomID - Setter for RoomID
	 */
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

}
