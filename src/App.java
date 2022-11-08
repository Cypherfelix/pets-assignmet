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
                System.out.println("Enter name of file to save: ");
                String fileName = new Scanner(System.in).nextLine();
                PetWriter.writeToFile(pets,fileName);
            }else if (choice == 4){
                System.out.println("Enter name of file to load: ");
                String fileName = new Scanner(System.in).nextLine();
                pets = PetReader.readFile(fileName);
            }
        }




    }

    private static void addNewPet(ArrayList<Pet> pets) {
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
            }catch (NumberFormatException e) {
                System.out.println("Invalid choice must be an integer");
            }
        }
    }

    public static void menu(){
        System.out.println("What would you like to do?\n" +
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
                "7. Exit");
    }
}
