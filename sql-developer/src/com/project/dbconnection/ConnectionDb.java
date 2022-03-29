package com.project.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
	public static void main(String [] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/database2";
		String userName = "root"; 
		String password = "Mysql@345";
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url, userName, password);
		System.out.println("Connection Established" +url);
		}
		catch(SQLException|ClassNotFoundException exception ) {
			System.out.println("Connecton is failed:"+exception.getMessage());
			//System.out.println("Connecton is failed:"+url());
		}
			finally {
				connection.close();
				System.out.println("Connecton is Closed");
			}
		}
	}

