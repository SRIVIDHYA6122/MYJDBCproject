package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTable {

	public static void main(String[] args) {
	String mytable="create table cloudemp(id int(4) primary key,name varchar(20) not null)";
   //connection code
	
	
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/edudb"; //edudb is the database name of mysql
	String un="root";
	String pass="root";
	Connection conn=null;
	Statement st=null;
	ResultSet rs=null;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter id to delete record");

	rs=st.executeQuery(sql);
	try {
		Class.forName(driver);
		Connection conn=DriverManager.getConnection(url,un,pa);
		Statement st=conn.createStatement();
		st.execute(mytable);
		rs=st.executeQuery(sql);
		if(!rs.next())
		{
			System.out.println("Enter name");
			String name=sc.next();
			String ins="insert into login values("+id+",'"+name+"');"
			
			int i= st.executeUpdate(ins);
			if(i>0)
			{
				System.out.println("Record is inserted successfully");
			}
			else
			{
				System.out.println("Id already exists");
			}
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}

}
