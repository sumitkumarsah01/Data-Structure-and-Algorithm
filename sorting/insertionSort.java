public class insertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int prev = i - 1;

            
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

           
            arr[prev + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};

        insertionSort(arr);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

