package sqa.lab.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class HotelReservationTest {

	 	private HotelDAO hotelDAOMock;
	    private HotelReservation booking;

	    @BeforeEach
	    public void setup() throws SQLException {

	        hotelDAOMock = mock(HotelDAO.class);
	        booking = new HotelReservation(hotelDAOMock);

	        List<String> availableRooms = Arrays.asList("A1");
	        when(hotelDAOMock.fetchAvailableRooms()).thenReturn(availableRooms);

	    }

	    @Test
	    public void checkAvailableRoomsTrue() throws SQLException {
	        assertTrue(booking.checkRoomAvailability("A1"));
	    }

	    @Test
	    public void checkAvailableRoomsFalse() throws SQLException {
	        assertFalse(booking.checkRoomAvailability("B1"));
	    }
}
