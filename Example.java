import java.sql.*;
class Example
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
			String sql="insert into student1 values('abc',1)";
			sct.executeUpdate(sql);
			sql="insert into student1 values('bcd',2)";
			sct.executeUpdate(sql);
			sql="insert into student1 values('cde',3)";
			sct.executeUpdate(sql);
			System.out.println("Successful");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}