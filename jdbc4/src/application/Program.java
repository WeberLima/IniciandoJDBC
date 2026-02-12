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
       
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"UPDATE seller "
					+ "SET Name = ?"
					+ "WHERE "
					+ "(Id = ?)");
			
			st.setString(1, "Stephen Hawking");
			st.setInt(2, 7);
			
			
			int rowsAffected =  st.executeUpdate();
			System.out.println("Done! rowsAffected ="+ rowsAffected);

			
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}

}
