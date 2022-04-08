//Java to DataBase connectivity

import java.sql.*;
class DBDemo
{


	public static void main(String args[]) throws SQLException
	{
	//2.Loaad Driver :- Thin Driver - Type - 4
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//3.Make the Connection 
	//Create object for Connection
	 Connection con=DriverManger.getConnection("oracle service id,port_number","IPC85","IPC85");
	//4.Create Object for Statement(Interface)
	Statement sct=con.createStatement();	
	String sql="insert into student Values(1,'abc')";
	//5.To Execute Queries - by statement object
	sct.executeUpdate(sql);
	System.out.println("Success");	
		
	}
}