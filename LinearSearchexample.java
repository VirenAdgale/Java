public class LinearSearchexample {
    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        int min = arr[0]; // Declare min outside the loop
        
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (arr[i] < min) {
                min = arr[i]; // Update min only if a smaller value is found
            }

            if (element == target) {
                return i;
            }

          
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 22, 45, 78, 38, 29};
        int target = 78;
        int result = LinearSearch(arr, target);
        System.out.println("Target found at index: " + result);
    
    }
}
