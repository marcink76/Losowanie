import java.util.Scanner;

public class AddPeople {

    void addPeople(Man man) {
        Scanner odczyt = new Scanner(System.in);
        System.out.printf("Podaj imię: ");
        String name = odczyt.nextLine();
        man.name = name;
        System.out.printf("Podaj nazwisko: ");
        String lastName = odczyt.nextLine();
        man.lastName = lastName;;
    }


}
