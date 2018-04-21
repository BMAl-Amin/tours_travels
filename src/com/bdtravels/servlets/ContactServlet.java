package com.bdtravels.servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdtravels.dao.impl.ContactInfoDaoImpl;
import com.bdtravels.dao.interfaces.ContactInfoDaoInterface;
import com.bdtravels.models.AutoGettingItemModel;
import com.bdtravels.models.ContactModel;
import com.bdtravels.service.impl.AutoGettingItemImpl;
import com.bdtravels.service.interfaces.AutoGettingItemInterface;

@WebServlet(description = "User Contact Information", urlPatterns = { "/ContactServlet" })
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ContactModel contactModel= new ContactModel();
	ContactInfoDaoInterface contactInfoDao=new ContactInfoDaoImpl();
	private AutoGettingItemModel autoGetModel=new AutoGettingItemModel();
	private AutoGettingItemInterface autoGetImpl=new AutoGettingItemImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		autoGetModel.setToDate(autoGetImpl.countToday());
		
		contactModel.setEmail(request.getParameter("email"));
		contactModel.setTitle(request.getParameter("title"));
		contactModel.setFullName(request.getParameter("uname"));
		contactModel.setPhoneNumber(request.getParameter("pnumber"));
		contactModel.setCountry(request.getParameter("country"));
		contactModel.setTravelTime(request.getParameter("traveltime"));
		contactModel.setDate(autoGetModel.getToDate());
		
		//send data to dao
		contactInfoDao.insertUserInfo(contactModel);
	}

}
