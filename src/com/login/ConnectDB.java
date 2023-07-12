package com.login;

import java.sql.*;

import javax.swing.JOptionPane;

public class ConnectDB {
	
	String dburl = "jdbc:mysql://localhost/studentsdb";
	String dbuser = "root";
	String dbpwd = "";
	
	Connection cnx;
	public Connection dbConnection() {
		
		try {
			cnx = DriverManager.getConnection(dburl, dbuser, dbpwd);	
		 
		 if(cnx!=null) {
			 JOptionPane.showMessageDialog(null,"Db Connected successful" ,"DB found", 1);
		 }
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnx;
		
	}
	

public void addUser(String name,String email,String username,String usertype,String password ) throws SQLException {
	String sql = "INSERT INTO students(Name,Email,Username,Usertype,Password) VALUES (?,?,?,?,?)";
	PreparedStatement st =  cnx.prepareStatement(sql);
	st.setString(1,name);
	st.setString(2,email);
	st.setString(3,username);
	st.setString(4,usertype);
	st.setString(5,password);
	int row = st.executeUpdate();
	
	if(row>0) {
		JOptionPane.showMessageDialog(null,"Db Connected successful" ,"Inserted", 1);
		
	}
}


}
