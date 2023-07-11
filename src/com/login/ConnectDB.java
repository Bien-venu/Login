package com.login;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectDB {
	
	String dburl="jdbc:mysql://localhost/studentsdb";
	String dbusr="root";
	String dbpwd="";
	
	Connection cnx;
	
	public Connection dbConnection() {
		try{
			cnx = DriverManager.getConnection(dburl,dbusr,dbpwd);
			if(cnx != null) {
				JOptionPane.showMessageDialog(null, "DB connected successfully", "DB found", 1);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return cnx;
	}
//	public void addUser(String name)

}
