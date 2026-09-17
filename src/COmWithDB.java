import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class COmWithDB {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
			Connection connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/seca22026", "root", "root");
			System.out.println("Connection successfull");
			
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery("select * from student");
			List<StudentAll> list=new ArrayList<StudentAll>();
			while(set.next())
			{
				StudentAll all=new StudentAll(set.getInt(1), set.getString(2), set.getFloat(3));
				list.add(all);
			}
			
			System.out.println(list);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
