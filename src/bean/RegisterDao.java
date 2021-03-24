package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDao {
	public static int register(Employee u){  
		int status=0;  
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");  
       
		PreparedStatement ps=con.prepareStatement("insert into empcrud values(?,?,?)");  
		ps.setInt(1,u.getEno());  
		ps.setString(2,u.getEname());  
		ps.setDouble(3,u.getSalary());  
		              
		status=ps.executeUpdate();  
		}catch(Exception e){}  
		      
		return status;  
		}  
}
