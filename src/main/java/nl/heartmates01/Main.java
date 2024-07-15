package nl.heartmates01;

// Maak een simpel programma waar mee je personen kunt beheren. Een persoon heeft een naam en leeftijd.

// Wanneer het programma start worden er drie opties getoond:

// 1 om een persoon toe te voegen
// 2 om een persoon te verwijderen
// 3 om alle personen te tonen

// Wanneer je een persoon toevoegt, vraag je om de naam en leeftijd van de persoon.
// Wanneer je een persoon verwijderd, vraag je om de naam van de persoon.
// Wanneer je alle personen toont, toon je alle personen in de HashMap.

// Gebruik een while loop om het programma draaiende te houden.
// Gebruik een switch statement om de keuze van de gebruiker af te handelen.
// Gebruik een Scanner of de methode uit het boek om input van de gebruiker te lezen.

// Je kunt een for-loop gebruiken om door de hashmap te itereren en de personen te tonen.
// Zie: https://sentry.io/answers/iterate-hashmap-java/

// Voor het opslaan van personen kun je gebruik maken van een HashMap<String, Int>
// waar de key de naam van de persoon is en de value de leeftijd.


import java.util.HashMap;
import java.util.Scanner;

class Students {

  public static class Main {

    public static void main(String[] args) {
      HashMap<String, Integer> Students = new HashMap<>();
      Students.put("Robbie", 16);
      Students.put("Mavis", 17);
      Students.put("Camille", 16);
      Students.put("Jonah", 18);
      // dankje "random name generator" voor de namen

      Scanner Choice = new Scanner(System.in);

      loop:
      while (true) {
        System.out.println(
            "What would you like to do?\n1 = Add a student\n2 = Remove a student\n3 = Show all students\n4 = Stop the program");
        // zorgt ervoor dat het blijft doorgaan

        int userChoice = Choice.nextInt();

        switch (userChoice) {

          default:
            System.out.println("Choose a number from the list.");
            break;

          case 4:
            System.out.println("Bye Bye!");
            break loop;
          // 4 staat bovenaan de lijst omdat het niet onder 3 werkt(??)

          case 1:
            Scanner addStudent = new Scanner(System.in);
            System.out.println("Type the name of the student you are adding.");
            String addName = addStudent.nextLine();
            System.out.println("Type the age of the student you are adding.");
            int addAge = addStudent.nextInt();
            Students.put(addName, addAge);
            break;

          case 2:
            Scanner removeStudent = new Scanner(System.in);
            System.out.println("Give the name of the student you are removing.");
            String removeName = removeStudent.nextLine();
            System.out.println("Give the age of the student you are removing.");
            int removeAge = removeStudent.nextInt();
            Students.remove(removeName, removeAge);
            break;

          case 3:
            System.out.println("These are all the listed students.");
            for (String i : Students.keySet()) {
              System.out.println("Name: " + i + "\nAge: " + Students.get(i));

              // met break laat het alleen 1 naam/leeftijd zien??
            }
        }
      }
    }
  }
}

