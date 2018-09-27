import java.util.Scanner;

public class Method_TH_ChuyenDoiNhietDo {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("MENU");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter Fahrenheit = ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println(+fahrenheit + "fahrenheit = " + fahrenheitToCelsius(fahrenheit) + "celsius");
                    break;
                }
                case 2: {
                    System.out.println("Enter Celsius = ");
                    celsius = scanner.nextDouble();
                    System.out.println(+celsius + "celsius = " + celsiusToFahrenheit(celsius) + "fahrenheit");
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}
