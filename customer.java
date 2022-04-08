import java.sql.*;
class Customer
{
	public static void main(String args[])
	{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successful");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC85","IPC85");
			System.out.println("Connection succesful");
			Scanner s=new Scanner(System.in);
			
			
			