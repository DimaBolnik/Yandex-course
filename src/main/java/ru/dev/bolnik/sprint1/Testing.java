package ru.dev.bolnik.sprint1;

public class Testing {
    public static byte findMax(byte a, byte b) {
        return (byte) Integer.max(a, b);
    }

    public static int findNumber(int[] arr, int n) {
        int min = 0;
        int max = arr.length -1;

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] > n) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }
}
