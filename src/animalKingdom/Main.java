package animalKingdom;

import java.util.ArrayList;

public class Main {
    public static void printAnimals(ArrayList<animalKingdom.Animals> animals, animalKingdom.CheckAnimal tester)
    {
        for (animalKingdom.Animals a : animals)
        {
            if (tester.test(a))
            {
                System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getyearNamed());
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<animalKingdom.Animals> animalsArrayList = new ArrayList<animalKingdom.Animals>();

        animalsArrayList.add(new animalKingdom.Mammals("Panda", 1869));
        animalsArrayList.add(new animalKingdom.Mammals("Zebra", 1778));
        animalsArrayList.add(new animalKingdom.Mammals("Koala", 1816));
        animalsArrayList.add(new animalKingdom.Mammals("Sloth", 1804));
        animalsArrayList.add(new animalKingdom.Mammals("Armadillo", 1758));
        animalsArrayList.add(new animalKingdom.Mammals("Raccoon", 1758));
        animalsArrayList.add(new animalKingdom.Mammals("Bigfoot",2021));


        animalsArrayList.add(new animalKingdom.Birds("Pigeon",1837));
        animalsArrayList.add(new animalKingdom.Birds("Peacock", 1821));
        animalsArrayList.add(new animalKingdom.Birds("Toucan", 1758));
        animalsArrayList.add(new animalKingdom.Birds("Parrot", 1824));
        animalsArrayList.add(new animalKingdom.Birds("Swan", 1758));

        animalsArrayList.add(new animalKingdom.Fish("Salmon", 1758));
        animalsArrayList.add(new animalKingdom.Fish("Catfish",1817));
        animalsArrayList.add(new animalKingdom.Fish("Perch", 1758));

        System.out.println("List of all animals as entered");
        System.out.println(animalsArrayList.toString());;

        System.out.println();
        System.out.println("ordered by year");
        animalsArrayList.sort((a1, a2) -> a2.getyearNamed() - a1.getyearNamed());
        System.out.println(animalsArrayList.toString());;

        System.out.println();
        System.out.println("ordered by name");
        animalsArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animalsArrayList.toString());;

        System.out.println();
        System.out.println("ordered by move");
        animalsArrayList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(animalsArrayList.toString());

        System.out.println();
        System.out.println("Animals with lungs");
        printAnimals(animalsArrayList, a -> a.breath() == "lungs");

        System.out.println();
        System.out.println("only those animals that breath with lungs and were named in 1758");
        printAnimals(animalsArrayList, a -> (a.breath() == "lungs" && a.getyearNamed() == 1758));

        System.out.println();
        System.out.println("only those animals that lay eggs and breath with lungs");
        printAnimals(animalsArrayList, a-> (a.reproduce() == "eggs" && a.breath() == "lungs"));

        System.out.println();
        System.out.println("alphabetically only those animals that were named in 1758");
        animalsArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animalsArrayList, a -> (a.getyearNamed() == 1758));

        System.out.println();
        System.out.println("Stretch Goal\n");
        System.out.println("alphabetically only those that are Mammals");
        animalsArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animalsArrayList, a -> (a instanceof animalKingdom.Mammals));
    }
}
