import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Sorts
        BogoSort bogoSort = new BogoSort();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        //Arrays
        int arraySize_10 = 10;
        int arraySize_100 = 100;
        int arraySize_1_000 = 1_000;
        int arraySize_10_000 = 10_000;
        int arraySize_100_000 = 100_000;
        int arraySize_1_000_000 = 1_000_000;
        int arraySize_10_000_000 = 10_000_000;
        int arraySize_100_000_000 = 100_000_000;
        int[] size_10 = new int[arraySize_10];
        int[] size_100 = new int[arraySize_100];
        int[] size_1_000 = new int[arraySize_1_000];
        int[] size_10_000 = new int[arraySize_10_000];
        int[] size_100_000 = new int[arraySize_100_000];
        int[] size_1_000_000 = new int[arraySize_1_000_000];
        int[] size_10_000_000 = new int[arraySize_10_000_000];
        int[] size_100_000_000 = new int[arraySize_100_000_000];

        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long stopTime = 120 * 1000; //2 minutes Timer

//MAIN SORTING AREA---------------------------------------------------
        try{
//ASCENDING ARRAYS
//BOGO
        ascendInts(size_10);
        startTime = System.currentTimeMillis();
        bogoSort.bogo(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bogo Sort", 10, (endTime - startTime) / 1000.0);

        ascendInts(size_100);
        startTime = System.currentTimeMillis();
        bogoSort.bogo(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bogo Sort", 100, (endTime - startTime) / 1000.0);

        ascendInts(size_1_000);
        startTime = System.currentTimeMillis();
        bogoSort.bogo(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bogo Sort", 1000, (endTime - startTime) / 1000.0);

        ascendInts(size_10_000);
        startTime = System.currentTimeMillis();
        bogoSort.bogo(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bogo Sort", 10000, (endTime - startTime) / 1000.0);

        ascendInts(size_100_000);
        startTime = System.currentTimeMillis();
        bogoSort.bogo(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bogo Sort", 100000, (endTime - startTime) / 1000.0);

        ascendInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        bogoSort.bogo(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bogo Sort", 1000000, (endTime - startTime) / 1000.0);

        ascendInts(size_10_000_000);
        startTime = System.currentTimeMillis();
        bogoSort.bogo(size_10_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bogo Sort", 10000000, (endTime - startTime) / 1000.0);

        ascendInts(size_100_000_000);
        startTime = System.currentTimeMillis();
        bogoSort.bogo(size_100_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bogo Sort", 100000000, (endTime - startTime) / 1000.0);

//BUBBLE
        ascendInts(size_10);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bubble Sort", 10, (endTime - startTime) / 1000.0);

        ascendInts(size_100);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascedning", "Bubble Sort", 100, (endTime - startTime) / 1000.0);

        ascendInts(size_1_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bubble Sort", 1000, (endTime - startTime) / 1000.0);

        ascendInts(size_10_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bubble Sort", 10000, (endTime - startTime) / 1000.0);

        ascendInts(size_100_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bubble Sort", 100000, (endTime - startTime) / 1000.0);

        ascendInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bubble Sort", 1000000, (endTime - startTime) / 1000.0);

        ascendInts(size_10_000_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_10_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bubble Sort", 10000000, (endTime - startTime) / 1000.0);

        ascendInts(size_100_000_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_100_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Bubble Sort", 100000000, (endTime - startTime) / 1000.0);

//SELECTION
        ascendInts(size_10);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Selection Sort", 10, (endTime - startTime) / 1000.0);

        ascendInts(size_100);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Selection Sort", 100, (endTime - startTime) / 1000.0);

        ascendInts(size_1_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Selection Sort", 1000, (endTime - startTime) / 1000.0);

        ascendInts(size_10_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Selection Sort", 10000, (endTime - startTime) / 1000.0);

        ascendInts(size_100_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Selection Sort", 100000, (endTime - startTime) / 1000.0);

        ascendInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Selection Sort", 1000000, (endTime - startTime) / 1000.0);

        ascendInts(size_10_000_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_10_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Selection Sort", 10000000, (endTime - startTime) / 1000.0);

//INSERTION
        ascendInts(size_10);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Insertion Sort", 10, (endTime - startTime) / 1000.0);

        ascendInts(size_100);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Insertion Sort", 100, (endTime - startTime) / 1000.0);

        ascendInts(size_1_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Insertion Sort", 1000, (endTime - startTime) / 1000.0);

        ascendInts(size_10_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Insertion Sort", 10000, (endTime - startTime) / 1000.0);

        ascendInts(size_100_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Insertion Sort", 100000, (endTime - startTime) / 1000.0);

        ascendInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Insertion Sort", 1000000, (endTime - startTime) / 1000.0);

        ascendInts(size_10_000_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_10_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Insertion Sort", 10000000, (endTime - startTime) / 1000.0);

        ascendInts(size_100_000_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_100_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Insertion Sort", 100000000, (endTime - startTime) / 1000.0);

//MERGE
        ascendInts(size_10);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Merge Sort", 10, (endTime - startTime) / 1000.0);

        ascendInts(size_100);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Merge Sort", 100, (endTime - startTime) / 1000.0);

        ascendInts(size_1_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Merge Sort", 1000, (endTime - startTime) / 1000.0);

        ascendInts(size_10_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Merge Sort", 10000, (endTime - startTime) / 1000.0);

        ascendInts(size_100_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Merge Sort", 100000, (endTime - startTime) / 1000.0);

        ascendInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Merge Sort", 1000000, (endTime - startTime) / 1000.0);

        ascendInts(size_10_000_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_10_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Merge Sort", 10000000, (endTime - startTime) / 1000.0);

        ascendInts(size_100_000_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_100_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Merge Sort", 100000000, (endTime - startTime) / 1000.0);

//QUICK
        ascendInts(size_10);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Quick Sort", 10, (endTime - startTime) / 1000.0);

        ascendInts(size_100);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Quick Sort", 100, (endTime - startTime) / 1000.0);

        ascendInts(size_1_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Quick Sort", 1000, (endTime - startTime) / 1000.0);

        ascendInts(size_10_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Quick Sort", 10000, (endTime - startTime) / 1000.0);

        ascendInts(size_100_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Quick Sort", 100000, (endTime - startTime) / 1000.0);

        ascendInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Quick Sort", 1000000, (endTime - startTime) / 1000.0);

        ascendInts(size_10_000_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_10_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Quick Sort", 10000000, (endTime - startTime) / 1000.0);

        ascendInts(size_100_000_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_100_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Ascending", "Quick Sort", 100000000, (endTime - startTime) / 1000.0);

//RANDOM ARRAYS
//BOGO
        randomInts(size_10);
        startTime = System.currentTimeMillis();
        bogoSort.bogo(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Bogo Sort", 10, (endTime - startTime) / 1000.0);

        randomInts(size_100);
        startTime = System.currentTimeMillis();
        bogoSort.bogo(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Bogo Sort", 100, (endTime - startTime) / 1000.0);

//BUBBLE
        randomInts(size_10);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Bubble Sort", 10, (endTime - startTime) / 1000.0);

        randomInts(size_100);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Bubble Sort", 100, (endTime - startTime) / 1000.0);

        randomInts(size_1_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Bubble Sort", 1000, (endTime - startTime) / 1000.0);

        randomInts(size_10_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Bubble Sort", 10000, (endTime - startTime) / 1000.0);

        randomInts(size_100_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Bubble Sort", 100000, (endTime - startTime) / 1000.0);

        randomInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Bubble Sort", 1000000, (endTime - startTime) / 1000.0);

//SELECTION
        randomInts(size_10);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Selection Sort", 10, (endTime - startTime) / 1000.0);

        randomInts(size_100);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Selection Sort", 100, (endTime - startTime) / 1000.0);

        randomInts(size_1_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Selection Sort", 1000, (endTime - startTime) / 1000.0);

        randomInts(size_10_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Selection Sort", 10000, (endTime - startTime) / 1000.0);

        randomInts(size_100_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Selection Sort", 100000, (endTime - startTime) / 1000.0);

        randomInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Selection Sort", 1000000, (endTime - startTime) / 1000.0);

        randomInts(size_10_000_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_10_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Selection Sort", 10000000, (endTime - startTime) / 1000.0);

//INSERTION
        randomInts(size_10);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Insertion Sort", 10, (endTime - startTime) / 1000.0);

        randomInts(size_100);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Insertion Sort", 100, (endTime - startTime) / 1000.0);

        randomInts(size_1_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Insertion Sort", 1000, (endTime - startTime) / 1000.0);

        randomInts(size_10_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Insertion Sort", 10000, (endTime - startTime) / 1000.0);

        randomInts(size_100_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Insertion Sort", 100000, (endTime - startTime) / 1000.0);

        randomInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Insertion Sort", 1000000, (endTime - startTime) / 1000.0);

        randomInts(size_10_000_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_10_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Insertion Sort", 10000000, (endTime - startTime) / 1000.0);

//MERGE
        randomInts(size_10);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Merge Sort", 10, (endTime - startTime) / 1000.0);

        randomInts(size_100);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Merge Sort", 100, (endTime - startTime) / 1000.0);

        randomInts(size_1_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Merge Sort", 1000, (endTime - startTime) / 1000.0);

        randomInts(size_10_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Merge Sort", 10000, (endTime - startTime) / 1000.0);

        randomInts(size_100_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Merge Sort", 100000, (endTime - startTime) / 1000.0);

        randomInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Merge Sort", 1000000, (endTime - startTime) / 1000.0);

        randomInts(size_10_000_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_10_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Merge Sort", 10000000, (endTime - startTime) / 1000.0);

        randomInts(size_100_000_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_100_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Merge Sort", 100000000, (endTime - startTime) / 1000.0);

//QUICK
        randomInts(size_10);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Quick Sort", 10, (endTime - startTime) / 1000.0);

        randomInts(size_100);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Quick Sort", 100, (endTime - startTime) / 1000.0);

        randomInts(size_1_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Quick Sort", 1000, (endTime - startTime) / 1000.0);

        randomInts(size_10_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Quick Sort", 10000, (endTime - startTime) / 1000.0);

        randomInts(size_100_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Quick Sort", 100000, (endTime - startTime) / 1000.0);

        randomInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Quick Sort", 1000000, (endTime - startTime) / 1000.0);

        randomInts(size_10_000_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_10_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Quick Sort", 10000000, (endTime - startTime) / 1000.0);

        randomInts(size_100_000_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_100_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Random", "Quick Sort", 100000000, (endTime - startTime) / 1000.0);

//DESCENDING ARRAY
//BOGO
        descendInts(size_10);
        startTime = System.currentTimeMillis();
        bogoSort.bogo(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Bogo Sort", 10, (endTime - startTime) / 1000.0);

        descendInts(size_100);
        startTime = System.currentTimeMillis();
        bogoSort.bogo(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Bogo Sort", 100, (endTime - startTime) / 1000.0);

//BUBBLE
        descendInts(size_10);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Bubble Sort", 10, (endTime - startTime) / 1000.0);

        descendInts(size_100);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Bubble Sort", 100, (endTime - startTime) / 1000.0);

        descendInts(size_1_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Bubble Sort", 1000, (endTime - startTime) / 1000.0);

        descendInts(size_10_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Bubble Sort", 10000, (endTime - startTime) / 1000.0);

        descendInts(size_100_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Bubble Sort", 100000, (endTime - startTime) / 1000.0);

        descendInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        bubbleSort.bubble(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Bubble Sort", 1000000, (endTime - startTime) / 1000.0);

//SELECTION
        descendInts(size_10);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Selection Sort", 10, (endTime - startTime) / 1000.0);

        descendInts(size_100);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Selection Sort", 100, (endTime - startTime) / 1000.0);

        descendInts(size_1_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Selection Sort", 1000, (endTime - startTime) / 1000.0);

        descendInts(size_10_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Selection Sort", 10000, (endTime - startTime) / 1000.0);

        descendInts(size_100_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Selection Sort", 100000, (endTime - startTime) / 1000.0);

        descendInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        selectionSort.selection(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Selection Sort", 1000000, (endTime - startTime) / 1000.0);

//INSERTION
        descendInts(size_10);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Insertion Sort", 10, (endTime - startTime) / 1000.0);

        descendInts(size_100);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Insertion Sort", 100, (endTime - startTime) / 1000.0);

        descendInts(size_1_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Insertion Sort", 1000, (endTime - startTime) / 1000.0);

        descendInts(size_10_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Insertion Sort", 10000, (endTime - startTime) / 1000.0);

        descendInts(size_100_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Insertion Sort", 100000, (endTime - startTime) / 1000.0);

        descendInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        insertionSort.insertion(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Insertion Sort", 1000000, (endTime - startTime) / 1000.0);

//MERGE
        descendInts(size_10);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Merge Sort", 10, (endTime - startTime) / 1000.0);

        descendInts(size_100);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Merge Sort", 100, (endTime - startTime) / 1000.0);

        descendInts(size_1_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Merge Sort", 1000, (endTime - startTime) / 1000.0);

        descendInts(size_10_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Merge Sort", 10000, (endTime - startTime) / 1000.0);

        descendInts(size_100_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Merge Sort", 100000, (endTime - startTime) / 1000.0);

        descendInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Merge Sort", 1000000, (endTime - startTime) / 1000.0);

        descendInts(size_10_000_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_10_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Merge Sort", 10000000, (endTime - startTime) / 1000.0);

        descendInts(size_100_000_000);
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(size_100_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Merge Sort", 100000000, (endTime - startTime) / 1000.0);

//QUICK
        descendInts(size_10);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_10, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Quick Sort", 10, (endTime - startTime) / 1000.0);

        descendInts(size_100);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_100, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Quick Sort", 100, (endTime - startTime) / 1000.0);

        descendInts(size_1_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_1_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Quick Sort", 1000, (endTime - startTime) / 1000.0);

        descendInts(size_10_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_10_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Quick Sort", 10000, (endTime - startTime) / 1000.0);

        descendInts(size_100_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_100_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Quick Sort", 100000, (endTime - startTime) / 1000.0);

        descendInts(size_1_000_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_1_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Quick Sort", 1000000, (endTime - startTime) / 1000.0);

        descendInts(size_10_000_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_10_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Quick Sort", 10000000, (endTime - startTime) / 1000.0);

        descendInts(size_100_000_000);
        startTime = System.currentTimeMillis();
        quickSort.quick(size_100_000_000, startTime, stopTime);
        endTime = System.currentTimeMillis();
        writeResults("Descending", "Quick Sort", 100000000, (endTime - startTime) / 1000.0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

//Main Methods/Functions-------------------------------------------------------------------------
//Prints Array
    public static void printArray(int[] values) { //used for testing
        for (int i : values) {
            System.out.print(i + "| ");
        }
        System.out.println();
    }
//Write Function For CSV File
    private static void writeResults(String arrayType, String algorithm, int arraySize, double time) {
        try (FileWriter writer = new FileWriter("Project1_SortData - RP.CSV", true)) {
            writer.append(String.format("%s,%s,%d,%.2f\n", arrayType, algorithm, arraySize, time));
        }
        catch (IOException e) {
            e.printStackTrace(); //if error occurs
        }
    }
//Ascending Array
    public static void ascendInts(int[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = i + 1;
        }
    }
//Random Array
    public static void randomInts(int[] values) {
        Random rand = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = rand.nextInt(values.length);
        }
    }
//Descending Array
    public static void descendInts(int[] values) {
        int d = values.length;
        for (int i = 0; i < d; i++) {
            values[i] = d - i;
        }
    }
//--Sorting Classes-----------------------------------------------------------------------
//Bogos Sort Class - https://en.wikipedia.org/wiki/Bogosort
public static class BogoSort {
    public void bogo(int[] values, long startTime, long stopTime){ //needs startTime and endTime if using time function
        while (!isSorted(values)) {
            if (time(startTime, stopTime)) { //time limit check
                System.out.println("Time Limit Reached | Bogo");
                break; //breaks if limit reached
            }
            shuffle(values);
        }
    }
    //Fisher Yates Shuffle Method - https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
    public static void shuffle(int[] values) {
        Random rand = new Random();
        for (int i = values.length - 1; i >= 1; i--) {
            int j = rand.nextInt(i + 1);
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
    }
    //Sorted Check For Bogo Sort
    public static boolean isSorted(int[] values) {
        if (values.length <= 1) {
            return true;
        }
        for (int i = 1; i < values.length; i++) {
            if (values[i] < values[i - 1]) {
                return false;
            }
        }
        return true;
    }
    //2 Minute Check | PER ALGORITHM
    public static boolean time(long startTime, long stopTime) {
        long current = System.currentTimeMillis();
        return (current - startTime) >= stopTime;
    }
}

//Bubble Sort Class - https://en.wikipedia.org/wiki/Bubble_sort
public static class BubbleSort {
    public void bubble(int[] values, long startTime, long stopTime) {
        while (!isSorted(values)) {
            if (time(startTime, stopTime)) { //time limit check
                System.out.println("Time Limit Reached | Bubble");
                break; //breaks if limit reached
            }
            bStep(values);
        }
    }
    //Bubble Sort Step Method
    public static void bStep(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) { //swaps values in array
                int temp = values [i];
                values[i] = values[i + 1];
                values[i + 1] = temp;
            }
        }
    }
    //isSorted Method
    public static boolean isSorted(int[] values) {
        for (int i = 0; i < values.length - 1; i++) { //checks if values are not in order
            if (values[i] > values[i + 1]) {
                return false;
            }
        }
        return true;
    }
    //2 Minute Check | PER ALGORITHM
    public static boolean time(long startTime, long stopTime) {
        long current = System.currentTimeMillis();
        return (current - startTime) >= stopTime;
    }
}

//Selection Sort Class - https://en.wikipedia.org/wiki/Selection_sort
public static class SelectionSort {
    public void selection(int[] values, long startTime, long stopTime) {
        for (int i = 0; i < values.length; i++) {
            if (time(startTime, stopTime)) { //time limit check
                System.out.println("Time Limit Reached | Selection");
                break; //breaks if limit reached
            }
            int minIndex = findIndexOfMinFromIndex(values, i);
            swapValuesAtIndexes(values, i, minIndex);
        }
    }
    //minIndex method
    public int findIndexOfMinFromIndex(int[] values, int startIndex) {
        int currentMin = values[startIndex];
        int currentMinIndex = startIndex;

        for (int i = startIndex; i < values.length; i++) {
            if (values[i] < currentMin) {
                currentMin = values[i];
                currentMinIndex = i;
            }
        }
        return currentMinIndex;
    }
    //swapValue method
    public void swapValuesAtIndexes(int[] values, int first, int second) {
        int temp = values[first];
        values[first] = values[second];
        values[second] = temp;
    }
    //2 Minute Check | PER ALGORITHM
    public static boolean time(long startTime, long stopTime) {
        long current = System.currentTimeMillis();
        return (current - startTime) >= stopTime;
    }
}

//Insertion Sort Class - https://en.wikipedia.org/wiki/Insertion_sort
public static class InsertionSort {
    public void insertion(int[] values, long startTime, long stopTime){
        for (int i = 1; i < values.length; i++) {
            if (time(startTime, stopTime)) { //time limit check
                System.out.println("Time Limit Reached | Insertion");
                break; //breaks if limit reached
            }
            int current = values[i];
            int j = i -1;

            while (j >= 0 && values[j] > current)  { //shift values
                values[j + 1] = values[j];
                j--;
            }
            values[j + 1] = current;
        }
    }
    //2 Minute Check | PER ALGORITHM
    public static boolean time(long startTime, long stopTime) {
        long current = System.currentTimeMillis();
        return (current - startTime) >= stopTime;
    }
}

//Merge Sort Class - https://en.wikipedia.org/wiki/Merge_sort
public static class MergeSort {
    public void mergeSort(int[] values, long startTime, long stopTime){
        if (time(startTime, stopTime)) { //Time limit check
            System.out.println("Time Limit Reached | Merge");
            return; //breaks if limit reached
        }

        if (values.length < 2) {
            return;
        }
        else {
            int mid = values.length / 2;

            int[] left = new int[mid];
            int[] right = new int[values.length - mid];
    
            System.arraycopy(values, 0, left, 0, mid);
            System.arraycopy(values, mid, right, 0, values.length - mid);
    
            mergeSort(left, startTime, stopTime);
            mergeSort(right, startTime, stopTime);
            merge(values, left, right);
        }
    }
    //merge Method
    public void merge(int[] values, int[] left, int[] right) {
        int l = 0; //left
        int r = 0; //right
        int m = 0; //merged
        while (l < left.length && r < right.length) { //compares
            if (left[l] <= right[r]) { //left
                values[m] = left[l];
                l++;
            }
            else {
                values[m] = right[r]; //right
                r++;
            }
            m++; //merges in order
        }
        while (l < left.length) { //extra values to the left
            values[m] = left[l];
            l++;
            m++;
        }
        while (r < right.length) { //extra values to the right
            values[m] = right[r];
            r++;
            m++;
        }
    }
    //2 Minute Check | PER ALGORITHM
    public static boolean time(long startTime, long stopTime) {
        long current = System.currentTimeMillis();
        return (current - startTime) >= stopTime;
    }
}

//Quick Sort Class - https://en.wikipedia.org/wiki/Quicksort
public static class QuickSort {
    public void quick(int[] values, long startTime, long stopTime) {
        if (time(startTime, stopTime)) {
            System.out.println("Time Limit Reached | Quick");
            return; //breaks if limit reached
        }
        divide(values, 0, values.length - 1);
    }
    //divide method
    public void divide(int[] values, int low, int high) {
        if (low < high) {
            int pi = partition(values, low, high);
            
            divide(values, low, pi - 1); //left
            divide(values, pi + 1, high); //right
        }
    }
    //partition method
    public int partition(int[] values, int low, int high) {
        Random rand = new Random();

        int pivotRand = rand.nextInt(high - low + 1) + low;
        int pivotPoint = values[pivotRand]; //random pivot point
        swap(values, pivotRand, high); //swaps pivotPoint and High element

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (values[j] <= pivotPoint) {
                i++;
                swap(values, i, j); //swaps smaller element to left side
            }
        }
        swap(values, i + 1, high); //moves pivotPoint
        return i + 1;
    }
    //Swap method
    public void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }
    //2 Minute Check | PER ALGORITHM
    public static boolean time(long startTime, long stopTime) {
        long current = System.currentTimeMillis();
        return (current - startTime) >= stopTime;
    }
}
}