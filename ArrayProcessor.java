import java.util.Arrays;

public class ArrayProcessor {
    public static void main(String[] args) {
        char[] inputs = {'j', 'a', 'v', 'a', 'e', 'z'};

        System.out.println("Original Array: " + Arrays.toString(inputs));

        // 1. Find and print vowels
        System.out.print("Vowels found: ");
        for (char c : inputs) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                System.out.print(c + " ");
            }
        }
        System.out.println();

        // 2. Reverse the array
        reverseArray(inputs);
        System.out.println("Reversed Array: " + Arrays.toString(inputs));
    }

    public static void reverseArray(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
