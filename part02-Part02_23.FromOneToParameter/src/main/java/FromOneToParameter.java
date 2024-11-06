

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        int count = 1;
        int counter = number;
            
        while (count <= number) {
            System.out.println(counter);
            count += 1;
            counter -=1;
        }
    }
}
