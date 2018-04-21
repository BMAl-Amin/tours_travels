package com.bdtravels.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bdtravels.dao.interfaces.AddPackageDaoInterface;
import com.bdtravels.models.AddPackageModel;
import com.bdtravels.utils.DbConnection;

public class AddPackageDaoImpl implements AddPackageDaoInterface {
	
	private DbConnection conn;
	private String query;

	@Override
	public void insertData(AddPackageModel addPackageModel) {
		
		conn=new DbConnection();
		query="INSERT INTO package_information(tour_name, activities, category, tour_detail, img_path) VALUES(?,?,?,?,?)";
		try {
			PreparedStatement pst= conn.getConnection().prepareStatement(query);
			pst.setString(1, addPackageModel.getTourName());
			pst.setString(2, addPackageModel.getActivity());
			pst.setString(3, addPackageModel.getCategory());
			pst.setString(4, addPackageModel.getTourDetail());
			pst.setString(5, addPackageModel.getImagePath());
			pst.executeUpdate();
			
			pst.close();
			conn.getConnection().close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
