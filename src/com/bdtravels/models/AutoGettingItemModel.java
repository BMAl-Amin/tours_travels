package com.bdtravels.models;

import javax.servlet.http.Part;

public class AutoGettingItemModel {
	Part fileName;
	String toDate;

	public Part getFileName() {
		return fileName;
	}

	public void setFileName(Part fileName) {
		this.fileName = fileName;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
}
