package sqa.lab.service;

/**
 * CP353201 Software Quality Assurance (1/2569)
 * Lab#9 – Test Double
 * Instructor: Asst.Prof. Chitsutha Soomlek
 * 
 */

import java.sql.SQLException;
import java.util.List;

public class SeatReservation {

    private SeatDAO dao;

    public SeatReservation(SeatDAO dao) {
        this.dao = dao;
    }

    public boolean checkSeatAvailability(String seatName) throws SQLException {

        List<String> seatsAvailable = dao.fetchAvailableSeats();
        return seatsAvailable.contains(seatName);
    }

}