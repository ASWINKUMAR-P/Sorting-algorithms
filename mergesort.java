import java.util.Scanner;

public class mergesort {

    public static void merge(int[] a, int l, int m, int r){
        int l1 = m-l+1;
        int l2 = r-m;
        int[] left = new int[l1];
        int[] right = new int[l2];
        
        for(int i=0; i<l1; i++){
            left[i] = a[l+i];
        }
        for(int i=0; i<l2; i++){
            right[i] = a[m+1+i];
        }

        int i=0,j=0,k=l;
        while(i<l1 && j<l2){
            if(left[i]<right[j]){
                a[k++]=left[i];
                i++;
            }
            else{
                a[k++]=right[j];
                j++;
            }
        }
        while(i<l1){
            a[k++]=left[i];
            i++;
        }
        while(j<l2){
            a[k++]=right[j];
            j++;
        }
        
    }
    public static void mergeSort(int[] a, int l, int r){
        if(l<r){
            int m = (l+r)/2;
            mergeSort(a, l, m);
            mergeSort(a, m+1, r);
            merge(a, l, m, r);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Merge Sortt\n");
        
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, size-1);

        System.out.println("The sorted array is: ");
        for (int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
