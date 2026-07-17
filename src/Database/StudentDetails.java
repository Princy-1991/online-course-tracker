package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDetails {
	public static void main(String[] args) throws SQLException {

		String url = "jdbc:postgresql://localhost:5432/StudentDetails";
		String username = "postgres";
		String password = "harley";
		try {
			Class.forName("org.postgresql.Driver");

			Connection c = DriverManager.getConnection(url, username, password);
			Statement s = c.createStatement();
			//String query = "CREATE TABLE StudentDetails(id INT,name VARCHAR(50),mail VARCHAR(50),mobilenumber int)";
			//s.executeUpdate(query);
			String sql = "INSERT INTO StudentDetails VALUES " + "(101, 'Princy','princy123@gmail.com',9874561230)," + "(102, 'Harley','harley000@gmail.com',9632587410)," + "(103, 'George','george555mail.com,8745962135)";
			s.executeUpdate(sql); 
			System.out.println("Connected ");

			s.close();
			c.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}