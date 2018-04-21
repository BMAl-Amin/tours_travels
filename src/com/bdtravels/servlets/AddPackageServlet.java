package com.bdtravels.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.bdtravels.dao.impl.AddPackageDaoImpl;
import com.bdtravels.dao.interfaces.AddPackageDaoInterface;
import com.bdtravels.models.AddPackageModel;
import com.bdtravels.models.AutoGettingItemModel;
import com.bdtravels.service.impl.AutoGettingItemImpl;
import com.bdtravels.service.interfaces.AutoGettingItemInterface;

@WebServlet("/AddPackageServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*2, //2MB size defined
				 maxFileSize=1024*1024*10, //10MB size defined
				 maxRequestSize=1024*1024*50 /*50MB size defined*/)
public class AddPackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//variable declaration
	private AddPackageModel addPackageModel;
	private AddPackageDaoInterface addPackageDao;
	private AutoGettingItemModel autoGetModel;
	private AutoGettingItemInterface autoGetItem;
	//private Part filePart;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		addPackageModel=new AddPackageModel();
		addPackageDao=new AddPackageDaoImpl();
		autoGetModel=new AutoGettingItemModel();
		autoGetItem=new AutoGettingItemImpl();
		
		//making file path or url
		autoGetModel.setFileName(request.getPart("pimage"));
		
		addPackageModel.setTourName(request.getParameter("tour_name"));
		addPackageModel.setActivity(request.getParameter("activity"));
		addPackageModel.setCategory(request.getParameter("category"));
		addPackageModel.setTourDetail(request.getParameter("tour_detail"));
		addPackageModel.setImagePath(autoGetItem.makeFileUrl(autoGetModel));
		addPackageDao.insertData(addPackageModel);
		request.getRequestDispatcher("/addpackageimg.jsp").forward(request, response);
	}

}
