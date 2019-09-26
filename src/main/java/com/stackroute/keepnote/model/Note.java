package com.stackroute.keepnote.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * The class "Note" will be acting as the data model for the Note data in the ArrayList.
 */
public class Note {
	/*
	 * This class should have five fields (noteId, noteTitle, noteContent,
	 * noteStatus and createdAt). This class should also contain the getters and
	 * setters for the fields. The value of createdAt should not be accepted from
	 * the user but should be always initialized with the system date
	 */
	private int noteId;
	private String noteTitle;
	private String noteContent;
	private String noteStatus;
	private  String createdAt;
	public Note() {
	}


	public void setCreatedAt() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		this.createdAt = now.toString();
	}

	public String getCreatedAt() {
		return createdAt;
	}

	/* All the getters/setters definition should be implemented here */
	public int getNoteId() {
		return noteId;

	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
		System.out.println(noteId);
	}

	public String getNoteTitle() {
		return noteTitle;
	}

	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
		System.out.println(noteTitle);
	}

	public String getNoteContent() {
		return noteContent;
	}

	public void setNoteContent(String notContent) {
		this.noteContent = notContent;
		System.out.println(noteContent);
	}

	public String getNoteStatus() {
		return noteStatus;
	}

	public void setNoteStatus(String noteStatus) {
		this.noteStatus = noteStatus;
		System.out.println(noteStatus);
	}


	/* Override the toString() method */

	@Override
	public String toString() {
		return ""+this.noteId+" "+this.noteStatus+" "+this.noteContent+ " "+ this.noteTitle;
	}
}