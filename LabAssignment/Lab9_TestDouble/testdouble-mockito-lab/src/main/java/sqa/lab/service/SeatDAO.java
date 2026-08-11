package sqa.lab.service;

/**
 * CP353201 Software Quality Assurance (1/2569)
 * Lab#9 – Test Double
 * Instructor: Asst.Prof. Chitsutha Soomlek
 * 
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SeatDAO {
	
	public List<String> fetchAvailableSeats() throws SQLException {
        List<String> availableSeats = new ArrayList<String>();
        Connection conn = DriverManager.getConnection("DATABASE_URL");
        Statement statement = conn.createStatement();
        ResultSet rs;
        rs = statement.executeQuery("SELECT * FROM ROOMS WHERE AVAILABLE like '1'");
        while(rs.next()){
            availableSeats.add(rs.getString("Seat name"));
        }
        return availableSeats;
    }
}
