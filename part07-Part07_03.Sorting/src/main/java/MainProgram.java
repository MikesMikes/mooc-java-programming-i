
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = MainProgram.smallest(array);
        int index = 0;

        for (int i : array) {
            if (i == smallest) {
                break;
            }
            index++;
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int startingIndex = startIndex;
        int smallest = table[startIndex];
        int index = 0;

        for (int i : table) {
            if (index >= startingIndex) {
                if (i < smallest) {
                    smallest = i;
                }
            }
            index++;

        }

        int indexOfSmallest = 0;
        for (int i : table) {
            if (indexOfSmallest >= startingIndex) {
                if (i == smallest) {
                    break;
                }
            }
            indexOfSmallest++;
        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int numAtIndex1 = array[index1];
        int numAtIndex2 = array[index2];

        array[index1] = numAtIndex2;
        array[index2] = numAtIndex1;
    }

    public static void sort(int[] array) {
        int index = 0;

        for (int i : array) {
            int smallest = MainProgram.indexOfSmallestFrom(array, index);
            MainProgram.swap(array, index, smallest);
            index++;
            System.out.println(Arrays.toString(array));
        }
        
    }
}
