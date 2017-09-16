import java.util.Scanner;

public class Losowanie {
    public static void main (String[] args){
        int number = 0;
        int index = 50;

        System.out.printf("Podaj ilość nazwisk:");
        Scanner read = new Scanner(System.in);
        index = read.nextInt();

        Man[] man = new Man[index];
        AddPeople addPeople = new AddPeople();

            for (number = 0; number < man.length; number++)
                man[number] = new Man();

            for (number = 0; number < man.length;number++){
                addPeople.addPeople(man[number]);

            }


            Randomize rand = new Randomize();

           System.out.println(man[rand.randomize(index)].lastName+ " " + man[rand.randomize(index)].name);
    }
}
