import java.util.Scanner;

public class AlarmSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie eine Farbe (rot, gelb, grün) ein?");
        String colorAlarm = scanner.next();
        switchAlarm(colorAlarm);

    }
    public static void switchAlarm(String colorAlarm){
        switch (colorAlarm){
            case "rot" -> System.out.println("keine Personen erlaubt");
            case "gelb" -> System.out.println("max 30 Personen erlaubt");
            case "grün" -> System.out.println("max 60 Personen erlaubt");
            default -> System.out.println("falsche Eingabe");
        }
    }
}
