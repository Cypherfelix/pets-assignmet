import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PetWriter {
    public static void writeToFile(ArrayList<Pet> pets, String path){
        try {
            FileWriter fw = new FileWriter(path);

            for (Pet pet : pets){
                fw.write(pet.getType() + "\t" + pet.getName() + "\t" + pet.getAge() + "\t" + pet.getWeight() + "\n");
            }
            System.out.println("The pets were saved to the file.");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void writeToScreen(ArrayList<Pet> pets){
        pets.sort(Pet::compareTo);
        System.out.println("Here is your list of pets:");
        for (Pet pet : pets){
            System.out.println(pet);
        }
    }
}
