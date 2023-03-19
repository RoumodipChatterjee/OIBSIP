import java.util.Scanner;

public class CancellationForm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your PNR number: ");
        String pnrNumber = input.nextLine();

        // Retrieve the reservation data based on the PNR number
        String[] reservationData = retrieveReservationData(pnrNumber);

        if (reservationData != null) {
            // Display the reservation details
            System.out.println("Reservation details:");
            System.out.println("PNR Number: " + reservationData[0]);
            System.out.println("Name: " + reservationData[1]);
            System.out.println("Train Number: " + reservationData[2]);
            System.out.println("Class Type: " + reservationData[3]);
            System.out.println("Date of Journey: " + reservationData[4]);
            System.out.println("From: " + reservationData[5]);
            System.out.println("To: " + reservationData[6]);

            // Confirm cancellation
            System.out.println("Do you want to cancel this reservation? Press 'Y' for Yes or 'N' for No.");
            String confirmation = input.nextLine();

            if (confirmation.equalsIgnoreCase("Y")) {
                // Cancel the reservation and update the central database
                boolean isCancelled = cancelReservation(pnrNumber);

                if (isCancelled) {
                    System.out.println("Reservation with PNR number " + pnrNumber + " has been cancelled.");
                } else {
                    System.out.println("Unable to cancel reservation at this moment. Please try again later.");
                }
            } else {
                System.out.println("Cancellation not confirmed.");
            }
        } else {
            System.out.println("No reservation found with PNR number " + pnrNumber + ".");
        }
    }

    private static String[] retrieveReservationData(String pnrNumber) {
        // Retrieve the reservation data from the central database
        // Return null if no reservation found with the given PNR number
        String[] reservationData = {"PNR123", "John Doe", "12345", "AC", "2023-04-01", "New York", "Chicago"};
        if (reservationData[0].equals(pnrNumber)) {
            return reservationData;
        } else {
            return null;
        }
    }

    private static boolean cancelReservation(String pnrNumber) {
        // Cancel the reservation and update the central database
        // Return true if the cancellation is successful, false otherwise
        return true;
    }
}
