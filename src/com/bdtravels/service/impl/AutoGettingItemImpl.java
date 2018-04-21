package com.bdtravels.service.impl;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Part;

import com.bdtravels.models.AutoGettingItemModel;
import com.bdtravels.service.interfaces.AutoGettingItemInterface;

public class AutoGettingItemImpl implements AutoGettingItemInterface {

	private String pattern; // it defines date pattern which will be shown
	private String imgFolder;
	private String fileName;
	private String savePath;
	//make any file path
	@Override
	public String makeFileUrl(AutoGettingItemModel autoGetModel) {
		imgFolder="\\home\\al-amin\\workspace\\bdtravels\\WebContent\\images";
		fileName=autoGetModel.getFileName().getSubmittedFileName();
		savePath=imgFolder+File.separator+fileName;
		return savePath;
	}
	
	//capture today's date from system
	@Override
	public String countToday(){
		pattern="dd/MM/yyyy";
		DateFormat dateFormat= new SimpleDateFormat(pattern);
		Date date=new Date();
		return dateFormat.format(date);
	}
	
//	private String extractFileName(Part part){
//		String contentDisp=part.getHeader("content-disposition");
//		String[] items=contentDisp.split(";");
//		for(String s:items){
//			if(s.trim().startsWith("filename"))
//				return s.substring(s.indexOf("=")+2, s.length()-1);
//		}
//		return "";
//	}
}
