package test;

public class FindLargest {
    public static void main(String[] args) {
        int[] arr = { 10, 25, 15, 5, 20 };
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Lagest number : " + max);
    }
}
