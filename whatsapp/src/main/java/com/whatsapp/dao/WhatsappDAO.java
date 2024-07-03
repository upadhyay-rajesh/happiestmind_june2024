package com.whatsapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.whatsapp.entity.WhatsappUser;

public class WhatsappDAO implements WhatsappDAOInterface {

	@Override
	public int createProfileDAO(WhatsappUser wu) {
		int i=0;
		try {
		// step 1 load driver
		Class.forName("com.mysql.jdbc.Driver"); //type 4 driver, ClassNotFoundException
		
		//step 2 create connection with database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestminddb","root","root");
		
		//step 3 create query
		//2 type of query
		//a. static query will be created using Statement
		//b. dynamic query will be created using PreparedStatement
		PreparedStatement ps=con.prepareStatement("insert into whatsappuser values(?,?,?,?)");
		ps.setString(1,wu.getName() );
		ps.setString(2, wu.getPassword());
		ps.setString(3, wu.getEmail());
		ps.setString(4,wu.getAddress() );
		
		//execute query
		//for DML(insert, delete, update) we will use executeUpdate() method and 
		//return type of executeUpdate() method will be int.
		//it says no of rows affected by query
		//for select query we will use executeQuery() method and
		//return type of executeQuery() method will be ResultSet.
		i=ps.executeUpdate();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		return i;
	}

	@Override
	public WhatsappUser viewProfileDAO(WhatsappUser wu) {
		WhatsappUser w1=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestminddb","root","root");
			PreparedStatement ps=con.prepareStatement("select * from whatsappuser where email=?");
			ps.setString(1, wu.getEmail());
			
			ResultSet res=ps.executeQuery();
			
			if(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				//DTO
				w1=new WhatsappUser();
				w1.setName(n);
				w1.setPassword(p);
				w1.setEmail(e);
				w1.setAddress(a);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return w1;
	}

}











