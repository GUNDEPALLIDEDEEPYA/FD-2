import java.sql.*;
class Example2
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
			String sql="delete from student1 where RollNo=3";
			sct.executeUpdate(sql);
			sql="insert into student1 values('Maha',3)";
			sct.executeUpdate(sql);
			sql="insert into student1 values('Reshma',4)";
			sct.executeUpdate(sql);
			sql="insert into student1 values('Tanmayi',5)";
			sct.executeUpdate(sql);
			ResultSet rs=sct.executeQuery("select * from student1");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				System.out.println(rs.getInt(2));
				
			}

			System.out.println("Successful");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}