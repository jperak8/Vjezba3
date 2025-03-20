import java.util.Scanner;

public class Chars {

    public static void main(String[] args) {

        int brojSlova = 0;
        int brojBrojeva = 0;
        int brojOstalihZnakova = 0;

        Scanner unos = new Scanner(System.in);

        System.out.print("Unesi niz znakova: ");

        String nizZnakova = unos.nextLine();

        for (int i = 0; i < nizZnakova.length(); i++) {
            char znak = nizZnakova.charAt(i);
            if (Character.isAlphabetic(znak)){
                brojSlova++;
            } else if (Character.isDigit(znak)){
                brojBrojeva++;
            } else {
                brojOstalihZnakova++;
            }
        }

        System.out.println("Slova: " + brojSlova);
        System.out.println("Brojevi: " + brojBrojeva);
        System.out.println("Ostali znakovi: " + brojOstalihZnakova);

    }

}
