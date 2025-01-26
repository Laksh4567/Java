/*import java.util.Arrays;
public class Arraylist {

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;

            // If target is found
            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left side is sorted
            if (nums[start] <= nums[mid]) {
                // Target is in the left sorted portion
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Right side is sorted
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        Arraylist obj = new Arraylist();
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(obj.search(nums, target)); // Should return 4
    }
}*/


/*import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Number of primes less than " + n + ": " + countPrimes(n));
    }

    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;  
        }
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false; 
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}*/


// Rotate array. leetcode 189
/*public class Arraylist {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1); // reverse the full array
        reverse(arr, 0, k - 1);// reverse the array till kth element
        reverse(arr, k, n - 1);// reverse the n-kth element
    }
    private static void reverse(int[] arr, int start, int end) { // reversing the array
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        rotate(arr, k);
        System.out.println("\nArray after rotating by " + k + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}*/

// Edward cake
/*import java.util.*;
public class Arraylist{
    public static long maximumcut(int n){
        long a=1000000007;
        if(n==1){
            return 2;
        }
        else if(n==0){
            return 0;
        }else{
            return (n+maximumcut(n-1))%a;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(maximumcut(n));
    }

}*/

// region on a plane
/*import java.util.*;
public class Arraylist{
    public static int planeoftheregion(int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return 2;
        }else{
            return (n*(n+1)/2)+1;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(planeoftheregion(n));
    }
}*/