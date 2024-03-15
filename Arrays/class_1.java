// import java.util.*;
import java.util.Arrays;

// package Arrays;

public class class_1 {
    public static void main(String[] args) {
        
        // int arr[];  // declaring array 
        // arr = new int[5];  // allocating memory to array 
        // int arr[] = new int [5];  // combining both statemnts in one
         int arr[] = new int[6];
        arr[0]=12;
        arr[1]=13;
        arr[2]=1;
        arr[3]=5;
        arr[4]=12;
        arr[5]=43;

        int arrs[] = {1,5,12,12,13,43};
        float flt[] ={2,4,6,3,6.7f};
        String str[] = {"Name ","Lokendra", "Mathur"};
        char ch[] = {'L','o','k','e','n','d','r','a'};
        



        for(int element: arr){
            System.out.println(element);
        }
        for(float element: flt){
            System.out.println(element);
        }
        for(String element: str){
            System.out.println(element);
        }for(char element: ch){
            System.out.println(element);
        }

    //    System.out.println( Arrays.toString(arr));
    //    System.out.println(arr[2]);
        
        // System.out.println(Arrays.compare(arr, arrs));
         
        // Arrays.sort(arr);
        // System.out.println("intdex = "+ 
        // Arrays.binarySearch(arr, 12));
        // for(int i=arr.length-1;  i>=0; i--){
        //     System.out.println(arrs[i]);
        // }
        


        
    }
}
