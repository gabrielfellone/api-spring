package br.com.gotask.apprender.api.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Component;

@Component
public class ConnectionFactory{
	public Connection getConnection() throws Exception{
		// Para banco MySql
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/apprender?useTimezone=true&serverTimezone=UTC&createDatabaseIfNotExist=true","root","");
		
		// Para banco Oracle - usar este return e apagar o Class.name...
		// return DriverManager.getConnection("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL");
	}

}
