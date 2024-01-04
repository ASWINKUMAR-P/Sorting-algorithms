import java.util.*;

public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insertion Sort\n");
        
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<size; i++){
            int val = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
        
        System.out.println("The sorted array is: ");
        for (int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
