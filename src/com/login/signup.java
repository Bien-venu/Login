package com.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

public class signup extends JFrame implements ActionListener {
	
	JFrame Form = new JFrame();
	
	JLabel lbName = new JLabel("Name:");
	JLabel lbEmail = new JLabel("Email:");
	JLabel lbUsername = new JLabel("Username:");
	JLabel lbUsertype = new JLabel("Usertype:");
	JLabel lbPassword= new JLabel("Password:");
	
	JTextField txtName = new JTextField();
	JTextField txtEmail = new JTextField();
	JTextField txtUsername = new JTextField();
	JTextField txtUsertype = new JTextField();
	JPasswordField pass = new JPasswordField();
	
	JButton btnSend = new JButton("Send");
	JButton btnCancel = new JButton("Cancel");
	
	String Name,Email,Username,Usertype,Password;
	
	signup(){
		setForm();
		setObj();
		addObj();
        setObjAction();
	}

	private void setObjAction() {
		// TODO Auto-generated method stub
		btnSend.addActionListener(this);
		btnCancel.addActionListener(this);
		
	}

	private void addObj() {
		// TODO Auto-generated method stub
		Form.add(lbName);
		Form.add(lbEmail);
		Form.add(lbUsername);
		Form.add(lbUsertype);
		Form.add(lbPassword);
		
		Form.add(txtName);
		Form.add(txtEmail);
		Form.add(txtUsername);
		Form.add(txtUsertype);
		Form.add(pass);
		
		Form.add(btnSend);
		Form.add(btnCancel);
		
		
	}

	private void setObj() {
		// TODO Auto-generated method stub
		lbName.setBounds(50,30,100,30);
		lbEmail.setBounds(50,70,100,30);
		lbUsername.setBounds(50,110,100,30);
		lbUsertype.setBounds(50,150,100,30);
		lbPassword.setBounds(50,190,100,30);
		
		txtName.setBounds(160,30,200,30);
		txtEmail.setBounds(160,70,200,30);
		txtUsername.setBounds(160,110,200,30);
		txtUsertype.setBounds(160,150,200,30);
		pass.setBounds(160,190,200,30);
		
		btnSend.setBounds(160,230,100,30);
		btnCancel.setBounds(280,230,90,30);
		
		
	}

	private void setForm() {
		// TODO Auto-generated method stub
		Form.setTitle("Student Login Form");
		Form.setBounds(500, 500, 400, 500);
		Form.setDefaultCloseOperation(3);
		Form.getContentPane().setLayout(null);
		Form.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnCancel) {
			
			txtName.setText("");
			txtEmail.setText("");
			txtUsername.setText("");
			txtUsertype.setText("");
			pass.setText("");
			
		}
		else if(e.getSource()==btnSend)
		{
			ConnectDB con =new ConnectDB();
			con.dbConnection();
			Name =txtName.getText();
			Email = txtEmail.getText();
			Username =txtUsername.getText();
			Usertype =txtUsertype.getText();
			Password =pass.getText();
			
			try {
				con.addUser(Name,Email,Username,Usertype,Password);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	
		
	}

}
