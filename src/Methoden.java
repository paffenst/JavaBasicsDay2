import java.util.Scanner;
public class Methoden {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wort eingeben: ");
    String wort = scanner.next();
        length(wort);
    }
    public static void length(String word){
        if(word.length() > 20 ){
            System.out.println("Ihr Wort ist länger als 20 Zeichen.");
            include_fency(word);
        } else if (word.length() < 20 ) {
            System.out.println("Ihr Wort ist kürzer als 20 Zeichen.");
            include_fency(word);
        }else {
            System.out.println("Ihr Wort besteht genau aus 20 Zeichen!");
            include_fency(word);
        }
    }
    public static void include_fency(String fency){
        if(fency.contains("fency") ){
            System.out.println("Ihr Wort enthählt das Wort 'fency' ");
        }
    }
}
