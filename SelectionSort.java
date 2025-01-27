public class SelectionSort implements Sorter {

    // Selection Sort Implementation
    private void selectionSort(int[] input) {
        int n = input.length;
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position holds the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (input[j] < input[min_idx]) {
                    // Update min_idx if a smaller element is found
                    min_idx = j;
                }
            }

            // Move the minimum element to its correct position
            int temp = input[i];
            input[i] = input[min_idx];
            input[min_idx] = temp;
        }
    }

    // Override the sort method from the Sorter interface
    @Override
    public void sort(int[] input) {
        selectionSort(input);
    }
}
