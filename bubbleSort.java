import java.util.*;

public class Solution {

    // The user is asked to input a list of numbers separated by spaces
    // Using BubbleSort I am counting the number of swaps to sort the array
    
    static void countSwaps(int[] listNumbers) {
        boolean isSorted = false;
        int counter = 0;
        while(!isSorted){
            isSorted = true;
            for(int i=0; i<listNumbers.length-1; i++){
                int temp;
                if(listNumbers[i+1]<listNumbers[i]) {
                    temp = listNumbers[i];
                    listNumbers[i] = listNumbers[i + 1];
                    listNumbers[i + 1] = temp;
                    counter++;
                    isSorted = false;
                }
            }
        }
        System.out.println("Array is sorted in " + counter + " swaps.");
        System.out.println("First Element: " + listNumbers[0]);
        System.out.println("Last Element: " + listNumbers[listNumbers.length-1]);
        for (int el:listNumbers
             ) {
            System.out.print(el + " ");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] list = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] listNumbers = new int[list.length];

        for (int i=0; i<list.length; i++) {
            listNumbers[i] = Integer.parseInt(list[i]);
        }

        countSwaps(listNumbers);

        scanner.close();
    }
}
