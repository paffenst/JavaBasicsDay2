import java.util.Scanner;

public class fakultaetWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben: ");
        int eins = Integer.parseInt(scanner.next());
        berechneWhile(eins);
    }

    static void berechneWhile(long zahl) {
        long fak = 1;
        if (zahl >= 0) {
            while (zahl > 1) {
                fak = fak * zahl;
                zahl = zahl - 1;
            }
            System.out.println("Die Fakultät von ist: " + fak);
        }
    }
}