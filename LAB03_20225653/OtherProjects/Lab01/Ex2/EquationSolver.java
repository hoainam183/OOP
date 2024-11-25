import java.util.Scanner;

public class EquationSolver {
    public static void solveLinearEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First-degree equation (ax + b = 0):");

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("INFINITE solutions.");
            } else {
                System.out.println("NO solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("Solution: x = " + x);
        }
    }

    public static void solveSystemOfLinearEquations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("System of first-degree equations:");
        System.out.println("a11 * x1 + a12 * x2 = b1");
        System.out.println("a21 * x1 + a22 * x2 = b2");

        System.out.print("Enter a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0 && D1 == 0 && D2 == 0) {
            System.out.println("INFINITE solutions.");
        } else {
            System.out.println("NO solution.");
        }
    }

    public static void solveQuadraticEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Second-degree equation (ax^2 + bx + c = 0):");

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation. Solving as a linear equation:");
            solveLinearEquation();
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two real roots: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Double root: x = " + x);
        } else {
            System.out.println("NO real roots.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Solve a first-degree equation with one variable");
            System.out.println("2. Solve a system of first-degree equations with two variables");
            System.out.println("3. Solve a second-degree equation with one variable");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    solveLinearEquation();
                    break;
                case 2:
                    solveSystemOfLinearEquations();
                    break;
                case 3:
                    solveQuadraticEquation();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);
    }
}
