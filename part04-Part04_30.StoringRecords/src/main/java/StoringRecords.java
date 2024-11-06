
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        try (Scanner scan = new Scanner(Paths.get(file))) {
             while (scan.hasNextLine()){
                 String line = scan.nextLine();
                 int count = 0;
                 String[] parts = line.split(",");
                 String name = parts[0];
                 String age = parts[1];
                 
                 persons.add(new Person(name, Integer.valueOf(age)));
            }
        } catch (Exception e) {
             
             System.out.println("error");
         }
        // and printing the read records
        return persons;

    }
}
