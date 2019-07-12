package dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class JdbcExample {

	public static void main(String[] args) {
		String connUrl = "jdbc:mysql://localhost:3306/mydatabase";
		String idAsString = JOptionPane.showInputDialog("Enter id: ");
		int idInput = Integer.parseInt(idAsString);
		String sql = "SELECT id, name, age FROM employees WHERE id=?";
		String username = "root"; String password = "secret"; 
		try (
				Connection conn = DriverManager.getConnection(connUrl, username, password);
				PreparedStatement stmt = conn.prepareStatement(sql);) {

			Class.forName("com.mysql.jdbc.Driver");
			stmt.setInt(1, idInput);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(id + "\t" + name + "\t" + age);
			}

		} catch (Exception e) {
			System.out.println("Db error!");
		}

	}

}
