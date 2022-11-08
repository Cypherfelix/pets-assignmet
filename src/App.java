import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();

        System.out.println("************************************************************\n" +
                "\n" +
                "Menagerie V1.0: The Pet Simulator\n" +
                "\n" +
                "************************************************************");

        while (true){
            menu();
            int choice = getIntegerChoice(1,7);
            if (choice == 1){
                addNewPet(pets);
            }else if (choice == 2){
                PetWriter.writeToScreen(pets);
            }else if (choice == 3){
                System.out.print("Enter name of file to save: ");
                String fileName = new Scanner(System.in).nextLine();
                PetWriter.writeToFile(pets,fileName);
            }else if (choice == 4){
                System.out.print("Enter name of file to load: ");
                String fileName = new Scanner(System.in).nextLine();
                pets = PetReader.readFile(fileName);
            }else if (choice == 5){
                simulatePetsAction(pets);
            }else if (choice == 6){
                pets = new ArrayList<>();
            }else {
                break;
            }
        }

        System.out.println("Thank you for using Menagerie. We hope you had fun.");


    }

    private static void simulatePetsAction(ArrayList<Pet> pets) {
        for (int i = 0; i < 24; i++) {
            System.out.println("\nHOUR " + (i+1));
            System.out.println("-------");
            for (Pet pet : pets){
                pet.initializeActions();
                String act = pet.act();
                if (act.length() != 0){
                    System.out.print(act);
                }
            }
            System.out.println();
        }

    }

    private static void addNewPet(ArrayList<Pet> pets) {
        Pet newPet;
        System.out.print("Enter d for dog, c for cat, or f for fish: ");
        String choice = new Scanner(System.in).next();
        if (choice.equalsIgnoreCase("d")){
            System.out.print("Enter name, age and weight: ");
            String[] p = new Scanner(System.in).nextLine().split(" ");
            String name = p[0];
            int age = Integer.parseInt(p[1]);
            double weight = Double.parseDouble(p[2]);
            newPet = new Dog(name, age, weight);
        }else if (choice.equalsIgnoreCase("c")){
            System.out.print("Enter name, age and weight: ");
            String[] p = new Scanner(System.in).nextLine().split(" ");
            String name = p[0];
            int age = Integer.parseInt(p[1]);
            double weight = Double.parseDouble(p[2]);
            newPet = new Cat(name, age, weight);
        }else if (choice.equalsIgnoreCase("f")){
            System.out.print("Enter name, age and weight: ");
            String[] p = new Scanner(System.in).nextLine().split(" ");
            String name = p[0];
            int age = Integer.parseInt(p[1]);
            double weight = Double.parseDouble(p[2]);
            newPet = new Fish(name, age, weight);
        }else{
            System.out.println("Inavalid choice");
            addNewPet(pets);
            return;
        }
        pets.add(newPet);
    }

    private static int getIntegerChoice(int min, int max) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter your number of choice: ");
            try {
                int choice = sc.nextInt();
                if (choice < min || choice > max){
                    System.out.println("Invalid choice number must be between " + min + " and " + max);
                }
                return choice;
            }catch (Exception e) {
                System.out.println("Invalid choice must be an integer");
            }
        }
    }

    public static void menu(){
        System.out.println("\nWhat would you like to do?\n" +
                "\n" +
                "1. Add a new pet.\n" +
                "\n" +
                "2. Print list of pets.\n" +
                "\n" +
                "3. Save pets to a file.\n" +
                "\n" +
                "4. Load pets from a file.\n" +
                "\n" +
                "5. Simulate a day in the life of your pets.\n" +
                "\n" +
                "6. Clear your list of pets.\n" +
                "\n" +
                "7. Exit\n");
    }
}
