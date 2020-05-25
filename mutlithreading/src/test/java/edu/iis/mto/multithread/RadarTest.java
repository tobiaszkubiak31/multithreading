package edu.iis.mto.multithread;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RadarTest {

	@RepeatedTest(5)
	public void launchPatriotOnceWhenNoticesAScudMissle() {
		int expectedLaunchedRockets = 5;
		PatriotBattery batteryMock = mock(PatriotBattery.class);
		RocketStarterMechanism rocketStarterMechanism = mock(RocketStarterMechanism.class);
		BetterRadar radar = new BetterRadar(batteryMock, expectedLaunchedRockets,
			rocketStarterMechanism);
		Scud enemyMissle = new Scud();
		radar.notice(enemyMissle);
		verify(batteryMock)
			.launchPatriot(enemyMissle, expectedLaunchedRockets, rocketStarterMechanism);
	}



}
