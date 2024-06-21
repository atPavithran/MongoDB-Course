import java.sql.*;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VIT", "root", "root");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from studnet");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}

			con.close();
		}
catch (Exception e) {
			System.out.println("Connection Issue and check once properly");
		}
	}