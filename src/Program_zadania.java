import java.util.Scanner;

public class Program_zadania {
    public static void main(String[] args) { // shortcut: psvm
        System.out.println("test123");
        int sideA = 14;
        int sideB = 12;

        int perimeter = 2 * (sideA + sideB);

        System.out.println("Obwód prostokata: " + perimeter);

        // zad 2
        int area = sideA * sideB;

        System.out.println("Pole prostokąta: " + area);

        int iterator = 0;
        System.out.println(iterator++);
        System.out.println(--iterator);
        iterator = 0;
        System.out.println(iterator);
        System.out.println("Wynik zadania:");
        int iteratorExercise = 0;

        // zad 3
        if (sideA > sideB) {
            System.out.println("Dluzsza linia ma wartosc: " + sideA );
        } else {
            System.out.println("Dluzsza linia ma wartosc: " + sideB);
        }

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe...");
        int number = scanner.nextInt();

        if (number%2==0) {
            System.out.println("twoja liczba jest parzysta");
        } else {
            System.out.println("twoja liczna jest nieparzysta");
        }*/


        // zad 4
        /*switch (number) {
            case 1:
                System.out.println("jeden");
                break;
            case 2:
                System.out.println("dwa");
                break;
            default:
                System.out.println("twoja liczba to " + number);
                break;
        }*/

        // zad 5
        int num1 = 0;
        while(num1<10){
            System.out.println(num1);
            num1++;
        }

        for(int num2=1; num2 <= 10; num2++){
            if(num2 % 2 == 0){
                System.out.println(num2);
            }
        }

        String[] tags = {"news", "sport", "weather forecast"};
        System.out.println(tags[0]);
        System.out.println(tags[tags.length -1]);

        //składnia dla for each: for(typ element : kolekcja)
        for(String tag : tags) {
            System.out.println(tag);
        }
        //w przypadku pętli for wyglądało by to tak:
        /*
        for (int i = 0; i < tags.length; i++) {
            System.out.println(tags[i]);
        }
         skrót dla komentarzy: ctrl + / ( ⌘ /) oraz ctrl + shift + / (⌥ ⌘ /)
        */

        // wyrażenie_boolean ? wartość_gdy_prawda : wartość_gdy_fałsz

        for (int i = tags.length - 1; i >= 0; i--) {
            System.out.print(tags[i]);
            System.out.print(i > 0 ? ", " : "");
        }

    }
}
