package edu.iis.mto.multithread;

public class BetterRadar {

	private PatriotBattery battery;
	private RocketStarterMechanism rocketStarterMechanism;
	private int amountOfRockets;

	public BetterRadar(PatriotBattery battery, int amountOfRockets,RocketStarterMechanism rocketStarterMechanism) {
		this.battery = battery;
		this.amountOfRockets = amountOfRockets;
		this.rocketStarterMechanism = rocketStarterMechanism;
	}

	public void notice(Scud enemyMissle) {
		launchPatriot(enemyMissle);
	}

	private void launchPatriot(Scud enemyMissle) {
		battery.launchPatriot(enemyMissle, amountOfRockets,rocketStarterMechanism);
	}
}
