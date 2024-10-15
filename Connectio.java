package jdbc;

import java.sql.DriverManager;

public class Connectio {
	
	public static  java.sql.Connection getConnect() throws Exception{

		String url="jdbc:mySql://localhost:3306/busreservation";
		String uname="root";
		String pw="kiruthi314";
		return DriverManager.getConnection(url, uname, pw);
		

	}
	

}
