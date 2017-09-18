import java.util.Scanner;

public class AddPeople {

    void addPeople(Man man) {
        Scanner odczyt = new Scanner(System.in);
        System.out.printf("Podaj imię: ");
        String name = odczyt.nextLine();
        man.setName(name);
        System.out.printf("Podaj nazwisko: ");
        String lastName = odczyt.nextLine();
        man.setLastName(lastName);
    }
    static void wyswietl(Man man){
        System.out.println("static" + man.getName());
    }

}
