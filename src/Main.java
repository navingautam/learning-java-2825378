import java.util.Scanner;

public class Main {

    public static double calculateGrossSalary(double hoursPerWeek, double ratePerHour, double vacationDays){
        if(hoursPerWeek < 0 || ratePerHour < 0 || vacationDays < 0){
            return -1;
        }

        double weeklyPayCheck = hoursPerWeek * ratePerHour;
        double unpaidTime = vacationDays * 8;

        return weeklyPayCheck * 52 - unpaidTime * ratePerHour;

    }

    public static void main(String[] args) {
        System.out.println("Enter the number of hours per week ");
        Scanner scanner = new Scanner(System.in);
        double hoursPerWeek = scanner.nextDouble();

        System.out.println("Enter the rate per hour ");
        double ratePerHour = scanner.nextDouble();

        System.out.println("Enter vacation days ");
        double vacationDays = scanner.nextDouble();

        double grossYearlySalary = calculateGrossSalary(hoursPerWeek, ratePerHour, vacationDays);
        System.out.println(grossYearlySalary);

    }

}
