package Moonlander;

import java.util.Scanner;

public class FuelBurn implements ILanderControls{
    @Override
    public int getSecondsOfFuelBurn(int altitude, int velocity) {
        int result = altitude / velocity;
        return result;
    }
}
