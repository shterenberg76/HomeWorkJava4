import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.print("Click: espresso, americano, cappuccino, tee: ");
        Scanner scanner = new Scanner(System.in);
        String drink = scanner.next();
        scanner.close();

        switch (drink) {


            case "espresso":
                System.out.println();
                break;
            case "espresso + water":
                System.out.println("americano");
                break;
            case "espresso + frothed milk":
                System.out.println("cappuccino");
                break;

            case "tee + water":
                System.out.println("tee");
                break;


            default:
                break;
        }
        ;



    }
}









