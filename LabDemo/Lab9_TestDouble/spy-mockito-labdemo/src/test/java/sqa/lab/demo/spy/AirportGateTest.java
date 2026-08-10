package sqa.lab.demo.spy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import sqa.lab.demo.service.AirportGate;
import sqa.lab.demo.service.EmailService;

import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

class AirportGateTest {

	@Mock
    EmailService emailServiceMock;
    final int PASSENGER_ID = 3;

    @Test
    public void passengerEntry(){

        //given - setup for test
    	AirportGate gateBarriers = new AirportGate(emailServiceMock);
    	AirportGate gateBarriersSpy = spy(gateBarriers);
        when(gateBarriersSpy.passengerIsEligible(PASSENGER_ID)).thenReturn(true);

        //when - method invocation
        gateBarriersSpy.passengerEntry(PASSENGER_ID);

        //then - what we expect
        verify(emailServiceMock).notifyPassenger(PASSENGER_ID);
        assertTrue(gateBarriersSpy.getPassengersOnBoard().contains(PASSENGER_ID));
    }

    @Test
    public void passengerEntryReturn(){

        //given - setup for test
    	AirportGate gateBarriers = new AirportGate(emailServiceMock);
    	AirportGate gateBarriersSpy = spy(gateBarriers);
        given(gateBarriersSpy.passengerIsEligible(PASSENGER_ID))
                .willReturn(true);

        //when - method invocation
        gateBarriersSpy.passengerEntry(PASSENGER_ID);

        //then - what we expect
        then(emailServiceMock)
                .should(never())
                .notifyPassenger(PASSENGER_ID);

        assertTrue(gateBarriersSpy.getPassengersOnBoard().contains(PASSENGER_ID));
    }

}
