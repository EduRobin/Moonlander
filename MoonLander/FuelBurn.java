package MoonLander;

import java.util.Scanner;

public class FuelBurn implements ILanderControls{
    Scanner sc = new Scanner(System.in);

    @Override
    public int getSecondsOfFuelBurn(int altitude, int velocity) {
        System.out.println(altitude + " a " + velocity);
        return sc.nextInt();
    }
}
