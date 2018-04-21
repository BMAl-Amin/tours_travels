package com.bdtravels.dao.impl;

import java.sql.Connection;

import com.bdtravels.dao.interfaces.ContactInfoDaoInterface;
import com.bdtravels.models.ContactModel;
import com.bdtravels.utils.DbConnection;
import com.mysql.jdbc.PreparedStatement;

public class ContactInfoDaoImpl implements ContactInfoDaoInterface {
	private Connection conn;
	private String warnMsg;
	private DbConnection db= new DbConnection();
	@Override
	public String insertUserInfo(ContactModel contactModel) {
		conn=db.getConnection();
		String query = "INSERT INTO client_information(c_name, phone_number,email_add, country, travel_time,submission_date) VALUES(?,?,?,?,?,?)";
		try{
			PreparedStatement pst=(PreparedStatement) conn.prepareStatement(query);
			pst.setString(1, contactModel.getTitle()+" "+contactModel.getFullName());
			pst.setString(2, contactModel.getPhoneNumber());
			pst.setString(3, contactModel.getEmail());
			pst.setString(4, contactModel.getCountry());
			pst.setString(5, contactModel.getTravelTime());
			pst.setString(6, contactModel.getDate());
			pst.executeUpdate();
			warnMsg="Thanks"+contactModel.getTitle()+" "+contactModel.getFullName()+"to join with us";
			pst.close();
			conn.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
			warnMsg=e.getMessage();
		}
		return warnMsg;
	}

}
