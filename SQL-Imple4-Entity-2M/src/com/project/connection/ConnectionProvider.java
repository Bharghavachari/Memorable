package com.project.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
private static Connection connection = null;
	
	static {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldeveloper","root","Mysql@345");
			System.out.println("Connection is Sucessfull");
			System.out.println("Connection is Singleton");
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){              //get connection  by method
		if(connection!= null) {
			return connection;
		}
		else {
			System.out.println("Connection is not closed");
			return connection;
		}
	}

	public static void closeConnection () {                     //close connection
		try {
			if(connection!= null) {
				connection.close();
			}
			else {
				System.out.println("Connection is not closed");
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}