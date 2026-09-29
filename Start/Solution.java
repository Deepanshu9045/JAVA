import java.util.*;

class Solution {
    public int binarysearch(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == k) {
                result = mid; // Store the index
                right = mid - 1; // Move left to find the smallest index
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        System.out.println("Index of " + k + ": " + solution.binarysearch(arr, k));
    }
}
