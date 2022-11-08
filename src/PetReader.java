import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PetReader {
    public static ArrayList<Pet> readFile(String path){
        ArrayList<Pet> pets = new ArrayList<Pet>();
        try {
            Scanner sc = new Scanner(new File(path));
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                if (line.isEmpty()) continue;
                String[] parts = line.split("\t");
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                double weight = Double.parseDouble(parts[3]);
                Pet pet;
                if (parts[0].equalsIgnoreCase("cat")){
                    pet = new Cat(name, age, weight);
                }else if (parts[0].equalsIgnoreCase("dog")){
                    pet = new Dog(name, age, weight);
                }else {
                    pet = new Fish(name, age, weight);
                }
                pets.add(pet);
            }
            System.out.println("The pets were read from the file.");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


        return pets;
    }
}
