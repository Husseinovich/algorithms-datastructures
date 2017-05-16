package com.datastructures.sortingalgorithms;

import java.util.Arrays;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class HeapSort {
    public static void main(String[] args) {

        int[] data = {1, 50, 40, 2, 10, 30, 42, 100, 34, 56, 34, 6, 23, 26, 13, 45, 75};
        System.out.println("Array before");
        System.out.println(Arrays.toString(data));
        int low = 0;
        int high = data.length - 1;
        System.out.println("Array after");
        heapSort(data);
        System.out.println(Arrays.toString(data));


    }

    public static void heapSort(int arr[])
    {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    /**
     *Since a Binary Heap is a Complete Binary Tree, it can be easily represented as array and array based
     * representation is space efficient.
     * If the parent node is stored at index I, the left child can be calculated by 2 * I + 1 and right
     * child by 2 * I + 2 (assuming the indexing starts at 0).

     Heap Sort Algorithm for sorting in increasing order:
     1. Build a max heap from the input data.
     2. At this point, the largest item is stored at the root of the heap. Replace it with the last item of
     the heap followed by reducing the size of heap by 1.Finally, heapify the root of tree.
     3. Repeat above steps while size of heap is greater than 1.

     Time complexity of heapify is O(Logn).
     Time complexity of createAndBuildHeap() is O(n).
     Overall time complexity of Heap Sort is O(nLogn).

     */
    public static void heapify(int arr[], int n, int i) {
        int largest = i;  // Initialize largest as root
        int l = 2 * i + 1;  // left = 2*i + 1
        int r = 2 * i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}