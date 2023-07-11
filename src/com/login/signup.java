package com.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class signup extends JFrame implements ActionListener{
	JFrame Form =new JFrame();
	JLabel name = new JLabel("Name:");
	JLabel email = new JLabel("Email:");
	JLabel username = new JLabel("Username:");
	JLabel usertype = new JLabel("UserType:");
	JLabel password = new JLabel("Password:");
	
	JTextField tName = new JTextField();
	JTextField tEmail = new JTextField();
	JTextField tUsername = new JTextField();
	JPasswordField tPassword =new JPasswordField();
	JTextField tUsertype = new JTextField();
	
	JButton btn = new JButton("Signup");
	JButton btn2 = new JButton("Cancel");
	
	signup(){
		setForm();
		setObj();
		addObj();
		getObAction();
	}
	
	private void getObAction() {
		btn.addActionListener(this);
		btn2.addActionListener(this);	
		
	}

	private void addObj() {
		Form.add(name);
		Form.add(email);
		Form.add(username);
		Form.add(usertype);
		Form.add(password);
		Form.add(tName);
		Form.add(tEmail);
		Form.add(tUsername);
		Form.add(tUsertype);
		Form.add(tPassword);
		Form.add(btn);
		Form.add(btn2);
	}

	private void setForm() {
		Form.setTitle("Student form");
		Form.setBounds(500,500,400,400);
		Form.setDefaultCloseOperation(3);
		Form.getContentPane().setLayout(null);
		Form.setVisible(true);
	}
	
	private void setObj() {
		name.setBounds(50,50,100,30);
		email.setBounds(50,90,100,30);
		username.setBounds(50,130,100,30);
		usertype.setBounds(50,170,100,30);
		password.setBounds(50,210,100,30);
		
		tName.setBounds(160,50,200,30);
		tEmail.setBounds(160,90,200,30);
		tUsername.setBounds(160,130,200,30);
		tUsertype.setBounds(160,170,200,30);
		tPassword.setBounds(160,210,200,30);
		
		btn.setBounds(160,250,100,30);
		btn2.setBounds(270,250,100,30);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn2) {
			tName.setText("");	
			tEmail.setText("");	
			tUsername.setText("");	
			tUsertype.setText("");
			tPassword.setText("");
			}
	}

}
