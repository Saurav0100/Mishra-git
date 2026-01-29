package Array;

import java.util.Scanner;

class ArrayUtility {
    private static final Scanner sc = new Scanner(System.in);
    public static int[] inputArray() {
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        return nums;
    }
}