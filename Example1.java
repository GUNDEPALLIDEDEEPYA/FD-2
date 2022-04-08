import java.sql.*;
class Example1
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
			String sql="update student1 set Name='Swathi' where RollNo=2";
			sct.executeUpdate(sql);
			System.out.println("Successful");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}