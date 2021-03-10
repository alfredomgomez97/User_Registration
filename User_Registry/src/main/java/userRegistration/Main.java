package userRegistration;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@20.58.25.15:1521:xe","system","hr");
			
			DatabaseMetaData dbmd = conn.getMetaData();

			System.out.println("Driver version: " + dbmd.getDriverVersion());        
			
			Statement stmt = conn.createStatement();
			String addConsultant = "INSERT INTO consultants (bookID , title,  Auhtor) VALUES (1,'moby dick', 'german mellville')";
			//stmt.executeUpdate(addBook);
			
			String query = "SELECT title FROM Books WHERE title LIKE 'moby dick'";
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getString("title"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
