  public class ReverseArray {

    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        
        System.out.println();
        System.out.println("Array in Reverse Order:");
        
        for (int i = originalArray.length - 1; i >= 0; i--) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println(); 
    }
}