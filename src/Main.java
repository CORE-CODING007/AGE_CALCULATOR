import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;
 class AgeCalculator {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        while (true) {
            System.out.println("Welcome to the Age Calculator!");
            System.out.print("Please enter your date of birth (YYYY-MM-DD): ");
            String dobInput = scanner.nextLine();
            LocalDate currentDate = LocalDate.now();
            LocalDate dob = LocalDate.parse(dobInput);
            if (dob.isAfter(currentDate)) {
                System.out.println("Invalid date of birth. Please enter a valid date.");
                continue;
            }
            Period age = Period.between(dob, currentDate);
            int years = age.getYears();
            int months = age.getMonths();
            int days = age.getDays();
            System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");
            history.add("Date of Birth: " + dob + ", Age: " + years + " years, " + months + " months, " + days + " days");
            System.out.print("Do you want to calculate again? (yes/no): ");
            String calculateAgain = scanner.nextLine().toLowerCase();
            if (!calculateAgain.equals("yes")) {
                break;
            }
        }
            System.out.println("Do you want to see history? (Y/N)");
            char a = scanner.next().charAt(0);
            if(a=='Y' || a=='y'){
        System.out.println("\nCalculation History:");
        for (String entry : history) {
            System.out.println(entry);
        }
    }
    }
}