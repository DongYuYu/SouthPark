package assignment1;

public class SortSearch {



















    int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;




        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] > target) {


                right = mid;
            } else if (array[mid] < target){
                left = mid;
            } else {
                return mid;
            }
        }
        if (array[left] == target) {
            return left;
        }



        if (array[right] == target) {
            return right;
        }
        return -1;
    }


    void selectSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for(int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {

                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }













    void bubbleSort(int[] array) {
        for (int i = array.length - 1; i >=0; i--) {


            for (int j = 0; j < i ; j++ ) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int newN = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > newN) {
                array[j + 1] = array[j];



                j--;
            }
            array[j + 1] = newN;
        }
    }




    public static void main(String[] args) {
        SortSearch s = new SortSearch();
        int[] array = new int[] {1,3,5,4,2};



        s.insertionSort(array);

        for (int i: array) {
            System.out.println(i);
        }




        System.out.println(s.binarySearch(array, 3));
    }
}
