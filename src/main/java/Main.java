import java.util.Scanner;

public class Main {
    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void line() {
        System.out.println("\u001b[33m" + "===============================================" + "\u001b[0m");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        while (run) {
            clean();
            line();
            System.out.println("\u001b[1mBody Mass Index Calculator\u001b[0m");
            line();
            System.out.println("Enter your weight (kg): ");
            double weight = scanner.nextDouble();
            System.out.println("Enter your height (cm): ");
            double height = scanner.nextDouble();


            double bodyMassIndex = weight / (height*height*0.0001);
            System.out.printf("Your BMI: %.1f\n", bodyMassIndex);
            if (bodyMassIndex < 16.5) {
                System.out.println("Severe thinness");
            } else if (bodyMassIndex >= 16.5 && bodyMassIndex < 18.5) {
                System.out.println("Underweight");
            } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
                System.out.println("Normal range");
            } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
                System.out.println("Overweight");
            } else if (bodyMassIndex >= 30 && bodyMassIndex < 35) {
                System.out.println("Obesity class I");
            } else if (bodyMassIndex >= 35 && bodyMassIndex < 40) {
                System.out.println("Obesity class II");
            } else {
                System.out.println("Obesity class III");
            }

            System.out.println("Enter for continue");
            scanner.nextLine();
        }
    }
}
