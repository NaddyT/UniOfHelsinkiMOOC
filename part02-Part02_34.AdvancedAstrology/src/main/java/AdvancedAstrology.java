
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int count = 1;
        while (count <= number) {
            System.out.print("*");
            count ++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int count = 1;
        while (count <= number) {
            System.out.print(" ");
            count ++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int count = 1;
        int spaces = size - 1;
        while (count <= size) {
            printSpaces(spaces);
            printStars(count);
            count ++;
            spaces --;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int count = 1;
        int stars = 1;
        int spaces = height -1;
        
        while (count <= height) {
            printSpaces(spaces);
            printStars(stars);
            count += 1;
            stars = stars +2;
            spaces --;
        }
        
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
