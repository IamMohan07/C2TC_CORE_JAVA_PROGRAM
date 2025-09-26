package com.tnsif.entityassignment;

public class Student {
	private int SId;
	private String SName;
	private String SContact;
	
	public int getSId() {
		return SId;
	}
	public void setSId(int SId) {
		this.SId = SId;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String SName) {
		this.SName =SName;
	}
	public String getSContact() {
		return SContact;
	}
	public void setSContact(String SContact) {
		this.SContact = SContact;
	}
	@Override
	public String toString() {
		return "Product [id=" + SId + ", cname=" + SName + ", city=" + SContact + "]";
	}

}
