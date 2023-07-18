
import java.util.Arrays;

    public class RadixSort {
        public void radixSort(int[] arr) {
            // Find the maximum number to determine the number of digits
            int max = getMax(arr);

            // Perform counting sort for every digit
            for (int exp = 1; max / exp > 0; exp *= 10) {
                countingSort(arr, exp);
            }
        }

        private int getMax(int[] arr) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        private void countingSort(int[] arr, int exp) {
            int n = arr.length;
            int[] output = new int[n];
            int[] count = new int[10];
            Arrays.fill(count, 0);

            // Store the count of each digit in count[]
            for (int i = 0; i < n; i++) {
                count[(arr[i] / exp) % 10]++;
            }

            // Change count[i] so that count[i] contains the actual
            // position of this digit in output[]
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // Build the output array
            for (int i = n - 1; i >= 0; i--) {
                output[count[(arr[i] / exp) % 10] - 1] = arr[i];
                count[(arr[i] / exp) % 10]--;
            }

            // Copy the output array to arr[] so that arr[] contains
            // the sorted numbers according to the current digit
            System.arraycopy(output, 0, arr, 0, n);
        }
    }

