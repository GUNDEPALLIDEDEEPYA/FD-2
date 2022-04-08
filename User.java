import java.sql.*;
import java.util.*;
class User
{
	public static void main(String args[])
	{
		try
		{	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successful");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC85","IPC85");
			System.out.println("Established");
			
			//prepared statement
			String sql="insert into emp values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(2,"Ram");
			ps.setInt(1,4);
			ps.setInt(3,20);
			int i=ps.executeUpdate();
			System.out.println(i+"Record Inserted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
