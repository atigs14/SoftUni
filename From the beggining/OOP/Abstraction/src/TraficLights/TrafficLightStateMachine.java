package TraficLights;

import java.util.Scanner;

public class TrafficLightStateMachine {
    public enum TrafficSignal {
        RED,
        GREEN,
        YELLOW
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read traffic light signals from the first line
        String[] signalsInput = scanner.nextLine().split("\\s+");
        TrafficSignal[] trafficLights = new TrafficSignal[signalsInput.length];
        for (int i = 0; i < signalsInput.length; i++) {
            trafficLights[i] = TrafficSignal.valueOf(signalsInput[i]);
        }

        // Read the number of times to change signals
        int numberOfChanges = scanner.nextInt();

        // Update and print traffic light signals
        for (int i = 0; i < numberOfChanges; i++) {
            for (int j = 0; j < trafficLights.length; j++) {
                trafficLights[j] = getNextSignal(trafficLights[j]);
                System.out.print(trafficLights[j] + " ");
            }
            System.out.println();
        }

    }

    // Method to get the next traffic signal in the cycle
    private static TrafficSignal getNextSignal(TrafficSignal currentSignal) {
        TrafficSignal[] values = TrafficSignal.values();
        int nextIndex = (currentSignal.ordinal() + 1) % values.length;
        return values[nextIndex];
    }
}

