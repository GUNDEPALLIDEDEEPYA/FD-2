import java.sql.*;
import java.util.*;
class Demo1
{
	public static void main(String args[])
	{
		try
		{	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successful");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC85","IPC85");
			System.out.println("Connection succesful");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your employee id");
			int empno=s.nextInt();
			Statement sct=con.createStatement();
			String sql="select * from emp where rno="+empno;
			ResultSet rs=sct.executeQuery(sql);
			boolean result=false;
			while(rs.next())
			{
				
				System.out.println("You are a valid user");
				System.out.println("Hello "+rs.getString(2));
				result=true;
				break;
				
			}
			if(result==false)
				{
					System.out.println("Invalid User");	
				}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	
			