package com.bdtravels.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdtravels.dao.impl.ViewContactDaoImpl;
import com.bdtravels.dao.interfaces.ViewContactDaoInterface;
import com.bdtravels.models.ContactModel;

@WebServlet("/ViewContactServlet")
public class ViewContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ViewContactDaoInterface viewContactDao;
	private ContactModel contactModel;

	// get method
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		viewContactDao = new ViewContactDaoImpl();
		contactModel = new ContactModel();
		contactModel.setContactInfo(viewContactDao.getData());
		// getting data from dao
		request.setAttribute("clientinfo", contactModel);
		request.getRequestDispatcher("/viewcontact.jsp").forward(request, response);
	}
}
