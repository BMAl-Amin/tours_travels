package com.bdtravels.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bdtravels.dao.interfaces.ViewContactDaoInterface;
import com.bdtravels.models.ContactModel;
import com.bdtravels.utils.DbConnection;

public class ViewContactDaoImpl implements ViewContactDaoInterface {
	private Connection conn;
	private String query="SELECT * FROM client_information";
	private DbConnection db= new DbConnection();
	private ContactModel contactModel;
	
	@Override
	public List<ContactModel> getData() {
		conn=db.getConnection();
		List<ContactModel> modelList=new ArrayList<ContactModel>();
		try {
			PreparedStatement pst= conn.prepareStatement(query);
			ResultSet rs= pst.executeQuery();
			//getting data from database
			while(rs.next()){
				contactModel=new ContactModel();
				contactModel.setFullName(rs.getString(1));
				contactModel.setPhoneNumber(rs.getString(2));
				contactModel.setEmail(rs.getString(3));
				contactModel.setCountry(rs.getString(4));
				contactModel.setTravelTime(rs.getString(5));
				contactModel.setDate(rs.getString(6));
				modelList.add(contactModel);
				
			}
			rs.close();
			pst.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return modelList;
	}

}
