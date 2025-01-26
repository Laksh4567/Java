/*import java.util.*;

public class practice1 {
    public static void findcount(int arr[], int num, int diff) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = Math.abs(arr[i] - num);
            if (a <= diff) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int diff = sc.nextInt();
        findcount(arr, num, diff);
    }
}*/

/*import java.util.Scanner;

public class MaxTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxPar= 5 - k;
        int eligibleStudents = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=maxPar){
                eligibleStudents++;
            }
        }
        int maxTeams = eligibleStudents / 3;
        System.out.println(maxTeams);
    }
}*/
