package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = input.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        boolean timeValid; // Call validation methods
        timeValid = areHoursValid(hours) && areMinutesValid(minutes);

        System.out.println("Time valid: " + timeValid);
    }


    public static boolean areHoursValid(int hours) {

        boolean flag = true;

        if (hours < 0 || hours > 23) {
            flag = false;
        }

        return flag;
    }


    public static boolean areMinutesValid(int minutes) {

        boolean flag = true;

        if (minutes < 0 || minutes > 59) {
            flag = false;
        }

        return flag;
    }
}
