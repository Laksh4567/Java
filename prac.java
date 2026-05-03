// array
//Reverse an array in-place without using extra space.
/*public class prac {
    public static void reverse(int [] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right) {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
}*/
//2) Find the maximum sum subarray (Kadane’s algorithm).
/*public class prac {
    public static int maximumSubarray(int arr[]){
        int maxsofar=arr[0];
        int maxending=arr[0];
        for(int i=1;i<arr.length;i++){
            maxending=Math.max(arr[i],maxending+arr[i]);
            maxsofar=Math.max(maxsofar,maxending);
        }
        return maxsofar;
    }
    public static void main(String args[]){
        int arr[] = {-2, -3, 4, -1, -2, 5};
        System.out.println("the array is"+maximumSubarray(arr));
    }
}*/
//3) Rotate an array from k position
/*public class prac {
    public static void reverse(int [] arr,int left,int right) {
        while(left<right) {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void rotate(int [] arr,int k) {
        k=k%arr.length;// to handle cases where k>length of array
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        int k=2;
        rotate(arr, k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/


//4) Find duplicate elements in an array without using extra space.
public class prac {
    public static void findDuplicate(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; // avoid printing the same duplicate multiple times
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 3, 4, 5};
        int n = arr.length;
        findDuplicate(arr, n);
    }
}

//Check if a string is a palindrome 
/*public class prac {
    public static boolean isPalindrome(String str,String reverse) {
        int n = str.length();
        for(int i=n-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return str.equals(reverse);
    }
    public static void main(String[] args) {
        String str = "madam";
        String reverse="";
        if(isPalindrome(str, reverse)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is not a palindrome");
        }
    }
}*/

//5) Find the first non-repeating character in a string.