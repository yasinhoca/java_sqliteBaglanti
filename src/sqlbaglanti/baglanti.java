package sqlbaglanti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class baglanti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:sqlite:C://sqlitedb/deneme.db";
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("Veritabanýna baðlandýnýz!");
			
			String sql = "select * from ogr";
			
			try (
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)){
				
				while(rs.next()) {
					System.out.println(rs.getInt("no") + "   " +
							rs.getString("ad") + "   " +		
							rs.getString("soyad") + "   " 
							);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
