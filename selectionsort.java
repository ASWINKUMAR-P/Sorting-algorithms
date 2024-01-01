import java.util.*;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selection Sort\n");
        
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i=0; i<size-1; i++) {
            int min = i;
            for (int j=i; j<size; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println("The sorted array is: ");
        for (int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
