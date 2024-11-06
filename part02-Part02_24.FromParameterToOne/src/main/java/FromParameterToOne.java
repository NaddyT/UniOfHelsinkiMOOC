public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(2);
    }

    public static void printFromNumberToOne(int number) {
        int count = 1;
        int counter = number;
            
        while (count <= number) {
            System.out.println(counter);
            count += 1;
            counter -=1;
        }
    }
}
