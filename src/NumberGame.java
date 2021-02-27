import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        System.out.println("Wybrałem jedną liczbę z zakresu 1-100. Masz 10 prób aby ją zgadnąć, potem zostaniesz zlikwidowany :)");
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("Wybrana liczba to: " + randomNumber);

        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            System.out.println("Wybierz liczbę. Pozostało Ci: " + i + " prób");
            int guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("Za dużo, wybierz mniej");
            } else if (guess < randomNumber) {
                System.out.println("Za mało, wybierz więcej");
            } else {
                hasWon = true;
                break;
            }
        }
        if (hasWon) {
            System.out.println("Brawo! Wygrywasz!");
        } else {
            System.out.println("Przegrywasz!");
            System.out.println("Wybranym numerem było: " + randomNumber);
        }
    }
}

