package com.digitpeer.t;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class TestDriver {

	@Test
	public void testDriver() {
		IVehicle vehicle = mock(IVehicle.class);
		
		Driver driver = new Driver(vehicle);
		driver.pickup();
		//driver.pickup();
		
		verify(vehicle, times(1)).start();
		verify(vehicle, times(1)).stop();
	}

}
