import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args){
        System.out.println("Enter the elements to sort: ");
        Scanner req = new Scanner(System.in);
        int n = req.nextInt();
        int[] numList = new int[n];
        for(int i = 0; i < n; i++){
            numList[i] = req.nextInt();
        }

        System.out.println("Input to sort: " + Arrays.toString(numList));
        Sort sortMtd = new Sort();
        sortMtd.selectionSort(numList);
        System.out.println("Sorted List" + Arrays.toString(numList));

       sortMtd.quickSort(numList, 0, numList.length -1);
        System.out.println("Quick Sorted List" + Arrays.toString(numList));
    }
}

/*
public int[] quickSort(int[] nums, int low, int high){
        if(low < high) {
            int pi = partition(nums, low, high);
            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }
        return nums;
    }

    public static int partition(int[] array, int low, int high){
        int pivot = array[high]; // select right most as pivot

        int i = (low - 1); // pointer for greater element

        for(int j = low; j < high; j++){
            if(array[j] <= pivot){
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return (i+1); // return position where partition is done
    }
 */