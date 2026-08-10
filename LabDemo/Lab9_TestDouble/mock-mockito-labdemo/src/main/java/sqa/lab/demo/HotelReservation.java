package sqa.lab.demo;

import java.sql.SQLException;
import java.util.List;


public class HotelReservation {
	
	private HotelDAO dao;

    public HotelReservation(HotelDAO dao) {
        this.dao = dao;
    }

    public boolean checkRoomAvailability(String roomName) throws SQLException {

        List<String> roomsAvailable = dao.fetchAvailableRooms();
        return roomsAvailable.contains(roomName);
    }
}
