package edu.iis.mto.multithread;

public class Radar {

    private PatriotBattery battery;

    private int defaultAmountOfRockets = 5;

    private RocketStarterMechanism rocketStarterMechanism;

    public Radar(PatriotBattery battery,RocketStarterMechanism rocketStarterMechanism) {
        this.battery = battery;
        this.rocketStarterMechanism = rocketStarterMechanism;
    }

    public void notice(Scud enemyMissle) {
        launchPatriot(enemyMissle);
    }

    private void launchPatriot(Scud enemyMissle) {
        Runnable launchPatriotTask = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    battery.launchPatriot(enemyMissle, defaultAmountOfRockets,rocketStarterMechanism);
                }
            }
        };

        Thread launchingThread = new Thread(launchPatriotTask);
        launchingThread.start();
    }
}
