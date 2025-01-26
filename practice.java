//Chocolate Distribution
/*import java.util.Arrays;

public class prctice {

    public static int ChocolateDis(int[] arr, int n) {
        // Sort the array
        Arrays.sort(arr);

        // Initialize the minimum difference as a large number
        int minDiff = Integer.MAX_VALUE;

        // Traverse the sorted array with a sliding window of size `n`
        for (int i = 0; i <= arr.length - n; i++) {
            int diff = arr[i + n - 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {10,4,12,3,1};
        int n = 3;  // Number of people

        int result = ChocolateDis(arr, n);
        System.out.println("Minimum difference: " + result);
    }
}*/
//Peak OP Question Accenture offcampus[2024 batch].
/*public class practice{
    public static int Peakelement(int n,int arr[]){
    if(n==0){     //base case
        return 0;
    }
    if(n==1){
        return arr[0];   //base case
    }
    if(arr[0]>arr[1]){     //descending array
        return arr[0];
    }
    if(arr[n-1]>arr[n-2]){    //ascending array
        return arr[n-1];
    }
    for(int i=1;i<n-1;i++){
        if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
            return arr[i];
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        int n = arr.length;  // Number of people

        int result = Peakelement(n,arr);
        System.out.println("Peak Element: " + result);
    }
}*/
//Selection of MPCS
//Display the most fit trainee and the highest average oxygen level
/*import java.util.Scanner;
public class practice{
    public static void fittestTrainee(int r1[],int r2[],int r3[]){
        int fittest[]=new int[3];
        for(int i=0;i<3;i++){
            if(r1[i]<1||r1[i]>101||r2[i]<1||r2[i]>101||r3[i]<1||r3[i]>101){
                System.out.println("Invalid");
                break;
            }else{
                fittest[i]=(r1[i]+r2[i]+r3[i])/3;
            }           
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            if(max<fittest[i]){
                max=fittest[i];
            }
        }
        for(int i=0;i<3;i++){
            if(max==fittest[i]){
                System.out.println("Trainee number"+(i+1));
            }
            if(fittest[i]<70){
                System.out.println("Trainee"+(i+1)+"is unfit");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1[]=new int[3];
        int r2[]=new int[3];
        int r3[]=new int[3];
        for(int i=0;i<3;i++){
            r1[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            r2[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            r3[i]=sc.nextInt();
        }
        fittestTrainee(r1, r2, r3);
    }
}*/
