import java.sql.SQLException;
import java.util.Scanner;

public class Losowanie {
    public static void main (String[] args)throws SQLException {
        int number = 0;
        int index = 0;

        System.out.printf("Podaj ilość nazwisk:");
        Scanner read = new Scanner(System.in);
        index = read.nextInt();

        Man[] man = new Man[index];
        AddPeople addPeople = new AddPeople();

            for (number = 0; number < man.length; number++){
                man[number] = new Man();
                addPeople.addPeople(man[number]);
            }

            Randomize rand = new Randomize();

            System.out.println(man[rand.randomize(index)].getName() + " " + man[rand.randomize(index)].getLastName());
            AddPeople.wyswietl(man[0x1]);// static method

        for (number = 0; number < man.length; number++){
            WriteToBase.writeToBase(man[number]);
        }

    }
}
