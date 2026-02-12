package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import db.DB;

public class Program {
	public static void main (String[] args) {
		Connection conn  = null;
		PreparedStatement st = null;
		ResultSet rs= null;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"INSERT INTO department "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, "");
			st.setString(2, "");
            LocalDate date = LocalDate.parse("", fmt);
			st.setDate(3, java.sql.Date.valueOf(date));
			st.setDouble(4, 2000);
			st.setInt(5, 4);
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0 ) {
				rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! id ="+ id);
				}
			}
			else {
				System.out.println("No rows affected!");

			}
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}

}
