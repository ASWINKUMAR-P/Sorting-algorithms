import java.util.*;

public class bubblesort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Bubble Sort\n");
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Time Complexity: O(n^2)");
        sc.close();
    }
}