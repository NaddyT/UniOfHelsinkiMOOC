import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        
        for (int value : array) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }
    
    public static int smallest(int[] array, int startIndex) {

    int minValue = Integer.MAX_VALUE;
    for (int i = startIndex; i < array.length; i++) {
        if (array[i] <= minValue) {
            minValue = array[i];
        }
    }

    return minValue;
        
    }

    
    public static int indexOfSmallest(int[] array ){
        int smallest = smallest(array);
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            
            if (smallest == array[i]){
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    
        int index = 0;
        int min = smallest(table, startIndex);
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] == min) {
                index = i;
            }
        }
        
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int hold = array[index1];
        array[index1] = array[index2];
        array[index2] = hold;
    }
    
    public static void sort(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            int index = indexOfSmallestFrom(array, i);
            swap(array, i, index);
            System.out.println(Arrays.toString(array));
        }
        
    }

}
