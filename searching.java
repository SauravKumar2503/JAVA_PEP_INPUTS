//WAP to Find first and last position of an element in a sorted array.Given a sorted array.Find the first and last occurence of a number.Input: arr = [2,4,4,4,6,8], target = 4 Output: [1,3]

import java.util.*;

public class searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int[] ans = searchRange(arr, target);
        System.out.println("[" + ans[0] + "," + ans[1] + "]");
        sc.close();
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        // finding the first occurrence of the target element
        ans[0] = search(nums, target, true);
        // finding the last occurrence of the target element
        ans[1] = search(nums, target, false);
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}