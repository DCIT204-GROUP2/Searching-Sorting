import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        boolean start = true;

        while(start) {
            System.out.println("Welcome to Group 2's Search-Sort Interface");
            System.out.println("What type of algorithm would you love to work with?" );
            System.out.println("1. A Searching Algorithm\n2. A Sorting Algorithm");

            Scanner in = new Scanner(System.in);
            int agType = in.nextInt();
            if(agType == 1){
                System.out.println("What type of search do you want to perform?\n1. Linear Search\n2. Binary Search");
                Scanner type = new Scanner(System.in);
                int shType = type.nextInt();

                if(shType == 1) {
                    System.out.println("\nImplementing Linear Search\n");

                    Scanner scanner= new Scanner(System.in);
                    System.out.println(" Enter the number of elements:");
                    int n = scanner.nextInt();

                    int[] arr = new int[n];
                    System.out.println("Enter the elements:");
                    for (int i = 0; i< n; i++){
                        arr[i] = scanner.nextInt();
                    }
                    Scanner num =new Scanner(System.in);
                    System.out.println(Arrays.toString(arr));
                    System.out.println("Enter a number you would like to find from the array: ");
                    int x = num.nextInt();

                    //Start Timer
                    long startTime = System.nanoTime();
                    //Function call
                    LinearSearch obj = new LinearSearch();
                    int result = obj.linearSearch(arr, x);
                    if (result == -1)
                        System.out.println(
                                "Element is not present in array");
                    else
                        System.out.println("Element is present at index "
                                + result);

                    //End Timer
                    long endTime = System.nanoTime();

                    System.out.println("Time taken to complete search: " + (endTime-startTime) + " nanoseconds");

                }else if(shType == 2) {
                    System.out.println("\nImplementing Binary Search\n");

                    BinarySearch ob2 = new BinarySearch();
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter size of the array:");
                    int size = scanner.nextInt();

                    int[] array = new int[size];


                    System.out.println("Enter the elements in the array:");
                    for (int i = 0; i < size; i++) {
                        array[i] = scanner.nextInt();
                    }

                    Scanner num = new Scanner(System.in);
                    System.out.println(Arrays.toString(array));
                    System.out.println("Enter a number you would like to find from the array");
                    //Start Timer
                    long startTime = System.nanoTime();

                    int x = num.nextInt();
                    int result = ob2.binarySearch(array, 0,  size- 1, x);
                    if (result == -1)
                        System.out.println("Element not present");
                    else
                        System.out.println("Element found at index "
                                + result);

                    //End Timer
                    long endTime = System.nanoTime();

                    System.out.println("Time taken to complete search: " + (endTime-startTime) + " nanoseconds");
                }
            }else if(agType == 2) {
                System.out.println("What type of search do you want to perform?\n1. Bubble Sort\n2. Insertion Sort\n3. Selection Sort\n4. Merge Sort\n5. Quick Sort\n6. Radix Sort");
                Scanner sort_type = new Scanner(System.in);
                int sortType = sort_type.nextInt();

                if(sortType == 1) {
                    System.out.println("\nImplementing Bubble Sort!\n");

                    BubbleSort ob3 = new BubbleSort();
                    int arr[] = new int[5];

                    Scanner sort = new Scanner(System.in);
                    System.out.println("Enter size of the array:");
                    int size = sort.nextInt();

                    int [] array = new int[size];


                    System.out.println("Enter the elements of the array.");
                    for(int i=0;i<size;i++){
                        array[i]= sort.nextInt();
                    }
                    System.out.println("Unsorted array: ");
                    System.out.println(Arrays.toString(array));

                    //Start Timer
                    long startTime = System.nanoTime();
                    System.out.println("Sorted array: ");
                    ob3.bubbleSort(array);

                    //End Timer
                    long endTime = System.nanoTime();

                    System.out.println(Arrays.toString(array));

                    System.out.println("Time taken to complete sort: " + (endTime-startTime) + " nanoseconds");


                }else if(sortType == 2) {

                    System.out.println("\nImplementing Insertion Sort!\n");

                    int arr[] = new int[5];
                    Scanner num1 = new Scanner(System.in);
                    System.out.println("Enter the first number: ");
                    arr[0] = num1.nextInt();
                    Scanner num2 = new Scanner(System.in);
                    System.out.println("Enter the second number: ");
                    arr[1] = num2.nextInt();
                    Scanner num3 = new Scanner(System.in);
                    System.out.println("Enter a third number: ");
                    arr[2] = num3.nextInt();
                    Scanner num4 = new Scanner(System.in);
                    System.out.println("Enter the fourth number: ");
                    arr[3] = num4.nextInt();
                    Scanner num5 = new Scanner(System.in);
                    System.out.println("Enter the fifth number: ");
                    arr[4] = num5.nextInt();
                    System.out.println(Arrays.toString(arr));

                    //Start Timer
                    long startTime = System.nanoTime();
                    InsertionSort ob = new InsertionSort();
                    ob.sort(arr);

                    //End Timer
                    long endTime = System.nanoTime();

                    System.out.println();
                    System.out.println("Here are your sorted numbers");

                    ob.printArray(arr);

                    System.out.println("Time taken to complete sort: " + (endTime-startTime) + " nanoseconds");


                }else if(sortType == 3) {
                    System.out.println("\nImplementing Selection Sort!\n");

                    SelectionSort ob5 = new SelectionSort();
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter size of the array:");
                    int size = sc.nextInt();

                    int arr[] = new int[size];


                    System.out.println("Enter the elements of the array.");
                    for(int i=0;i<size;i++){
                        arr[i]= sc.nextInt();
                    }

                    System.out.println(Arrays.toString(arr));

                    //Start Timer
                    long startTime = System.nanoTime();
                    ob5.sort(arr);

                    //End Timer
                    long endTime = System.nanoTime();

                    System.out.println("Sorted array: ");
                    ob5.printArray(arr);

                    System.out.println("Time taken to complete sort: " + (endTime-startTime) + " nanoseconds");


                }else if(sortType == 4) {

                    System.out.println("\nImplementing Merge Sort!\n");

                    MergeSort ob6 = new MergeSort();
                    int arr[] = new int[5];
                    Scanner num1 = new Scanner(System.in);
                    System.out.println("Enter the first number: ");
                    arr[0] = num1.nextInt();
                    Scanner num2 = new Scanner(System.in);
                    System.out.println("Enter the second number: ");
                    arr[1] = num2.nextInt();
                    Scanner num3 = new Scanner(System.in);
                    System.out.println("Enter a third number: ");
                    arr[2] = num3.nextInt();
                    Scanner num4 = new Scanner(System.in);
                    System.out.println("Enter the fourth number: ");
                    arr[3] = num4.nextInt();
                    Scanner num5 = new Scanner(System.in);
                    System.out.println("Enter the fifth number: ");
                    arr[4] = num5.nextInt();
                    System.out.println(Arrays.toString(arr));

                    System.out.println("Given Array: ");
                    ob6.printArray(arr);

                    //Start timer
                    long startTime = System.nanoTime();

                    ob6.sort(arr, 0, arr.length - 1);

                    //End Timer
                    long endTime = System.nanoTime();
                    System.out.println("\nSorted array: ");
                    ob6.printArray(arr);

                    System.out.println("Time taken to complete sort: " + (endTime-startTime) + " nanoseconds");


                }else if(sortType == 5) {

                    System.out.println("\nImplementing Quick Sort!\n");


                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter size of array:");
                    int n = input.nextInt();
                    int arr[] = new int[n];


                    System.out.println("Enter the elements of the array:");
                    for(int i=0;i<n;i++){
                        arr[i]= input.nextInt();
                    }
                    System.out.println("Unsorted array: ");
                    System.out.println(Arrays.toString(arr));

                    //Start timer
                    long startTime = System.nanoTime();
                    QuickSort ob7 = new QuickSort();
                    ob7.quickSort(arr, 0, n - 1);

                    //End Timer
                    long endTime = System.nanoTime();

                    System.out.println("Sorted array: ");
                    ob7.printArray(arr, n);

                    System.out.println("Time taken to complete sort: " + (endTime-startTime) + " nanoseconds");


                }else if (sortType == 6) {
                    System.out.println("\nImplementing Radix Sort!\n");

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the size of array:");
                    int n = scanner.nextInt();

                    int arr[] = new int[n];


                    System.out.println("Enter the elements of the array:");
                    for(int i=0;i<n;i++){
                        arr[i]= scanner.nextInt();
                    }
                    System.out.println("\nUnsorted array: ");
                    System.out.println(Arrays.toString(arr));

                    //Start timer
                    long startTime = System.nanoTime();
                    RadixSort ob7 = new RadixSort();
                    ob7.radixSort(arr);

                    //End Timer
                    long endTime = System.nanoTime();
                    System.out.println("\nSorted array: ");
                    System.out.println(Arrays.toString(arr));


                    System.out.println("Time taken to complete sort: " + (endTime-startTime) + " nanoseconds");

                }

            }

            System.out.println("Do you want to try another algorithm? \n1. Yes \n2. No");
            Scanner inp = new Scanner(System.in);
            int rsvp = inp.nextInt();
            if(rsvp == 1) {
                start = true;
            }else {
                System.out.println("Thank you for using our interface!");
                start = false;

            }
        }
    }
}

