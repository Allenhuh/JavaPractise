public class Sort {
    public int[] selectionSort(int[] nums){
        int size = nums.length;
        int minIndex;

        for(int i = 0; i < size; i++){
            minIndex = i;
            for(int j = i+1; j < size; j++){
                if(nums[j] > nums[minIndex]){
                    minIndex = j;
                }
            }

            //To swap
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }


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
}


