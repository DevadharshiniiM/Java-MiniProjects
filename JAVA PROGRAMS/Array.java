import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+"numbers:");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("the elements are:");
        for(int i =0; i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
