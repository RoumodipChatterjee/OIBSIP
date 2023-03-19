import java.util.Scanner;

public class ReservationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, trainNumber, classType, dateOfJourney, from, to;

        System.out.println("Please enter your name: ");
        name = input.nextLine();

        System.out.println("Please enter the train number: ");
        trainNumber = input.nextLine();

        // Assume the train name can be retrieved from the train number
        String trainName = retrieveTrainName(trainNumber);
        System.out.println("Train name: " + trainName);

        System.out.println("Please enter the class type: ");
        classType = input.nextLine();

        System.out.println("Please enter the date of journey: ");
        dateOfJourney = input.nextLine();

        System.out.println("Please enter the starting point: ");
        from = input.nextLine();

        System.out.println("Please enter the destination: ");
        to = input.nextLine();

        // Save the reservation data to the central database
        saveReservationData(name, trainNumber, trainName, classType, dateOfJourney, from, to);
    }

    private static String retrieveTrainName(String trainNumber) {
        // Retrieve the train name based on the train number from the database
        // Return a dummy value for demo purpose
        return "Dummy Train Name";
    }

    private static void saveReservationData(String name, String trainNumber, String trainName, String classType,
                                             String dateOfJourney, String from, String to) {
        // Save the reservation data to the central database
        // Implementation details are beyond the scope of this code sample
        System.out.println("Reservation data saved successfully!");
    }
}
