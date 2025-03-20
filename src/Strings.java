import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Unesi neku rečenicu!");

        String recenica = input.nextLine();

        String[] rijeci = recenica.split("\\s+");

        StringBuilder rezultat = new StringBuilder();

        for (String rijec : rijeci){

            if (rezultat.length() > 0){
                rezultat.insert(0, " ");
            }
            rezultat.insert(0, rijec);
        }

        System.out.println("Obrnuti niz znakova unesenog stringa glasi: " + rezultat);

    }

}
