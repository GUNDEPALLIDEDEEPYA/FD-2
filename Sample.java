import java.sql.*;
class Sample
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successful");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC85","IPC85");
			System.out.println("Established");
			Statement sct=con.createStatement();
			String sql="create table customer(cus_name varchar(20),cus_id int)";
			sct.executeUpdate(sql);
			System.out.println("Successful");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}