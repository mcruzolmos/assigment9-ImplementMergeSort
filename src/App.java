//import java.io.*;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Random;

public class App {

    // Start of merge sort
    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length);
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (end - start <= 1)
            return;
        int middle = (start + end) / 2;
        mergeSort(arr, start, middle);
        mergeSort(arr, middle, end);
        merge(arr, start, middle, end);
    }

    public static void merge(int[] arr, int start, int middle, int end) {
        int i = start, j = middle, k = 0;
        int[] tempArr = new int[end - start];

        while (i < middle && j < end) {
            if (arr[i] <= arr[j]) {
                tempArr[k] = arr[i];
                i++;
            } else {
                tempArr[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < middle) {
            tempArr[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            tempArr[k] = arr[j];
            j++;
            k++;
        }

        for (i = start; i < end; i++) {
            arr[i] = tempArr[i - start];
        }
    }

    public static void main(String[] args) {
        int size = 10;
        int[] ranNum = new int[size];
        Random random = new Random();

        // Generate random numbers
        for (int i = 0; i < size; i++) {
            ranNum[i] = random.nextInt(30);
        }

        System.out.println("Random numbers: ");
        for (int num : ranNum) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array
        mergeSort(ranNum);

        // Print sorted numbers
        System.out.println("Sorted numbers: ");
        for (int num : ranNum) {
            System.out.print(num + " ");
        }
    }
}

    //Start of bubble sort assignment

    /*public static int[] createRandomArray(int arrayLength) {
        Random random = new Random();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = random.nextInt(101); // Random number between 0 and 100
        }
        return arr;
    }
    // Write the array to a file, one integer per line
    public static void writeArrayToFile(int[] array, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int num : array) {
                writer.write(String.valueOf(num));
                writer.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Read integers from a file into an array
    public static int[] readFileToArray(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = null;
            List<Integer> list = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
            int[] arr = new int[list.size()]; 
            for (int i = 0; i < arr.length; i++) {
             arr[i] = list.get(i);
            }
            return arr;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Sort the array using bubble sort
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for(int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            //if no elements swapped
            if(!swapped) {
                break;
            }
        }
    }

    // Main function to handle user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1: Generate an array of random integers and store it in a file");
        System.out.println("2: Read an existing file, sort the integers, and store the sorted array in another file");
        
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the length of the array: ");
                int length = scanner.nextInt();
                int[] randomArray = createRandomArray(length);
                bubbleSort(randomArray);
                writeArrayToFile(randomArray, "input.txt");
                break;

            case 2:
                System.out.print("Enter the filename to read the array from: ");
                String inputFilename = scanner.next();
                int[] readArray = readFileToArray(inputFilename);
                bubbleSort(readArray);
                writeArrayToFile(readArray, "fileArray.txt");
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}
*/
