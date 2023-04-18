import java.util.Scanner;
public class fakultaetFor {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben: ");
        int eins = Integer.parseInt(scanner.next());
        berechneFak(eins);
    }
    static void berechneFak(long zahl) {
        long fak = 1;
        for (int i = 1; i <= zahl; ++i) {
            fak = fak * i;
        }
        System.out.println("Die Fakultät von " + zahl + " ist: " + fak);
    }
}
