import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year (e.g., 1990): ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int birthDay = scanner.nextInt();

        LocalDate currentDate = LocalDate.now();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        Period period = Period.between(birthDate, currentDate);

        System.out.println("You are " + period.getYears() + " years, " +
                           period.getMonths() + " months, and " +
                           period.getDays() + " days old.");

        scanner.close();
    }
}

