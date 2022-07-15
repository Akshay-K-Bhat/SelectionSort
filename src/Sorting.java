class Sorting{
    static class SelectionSort{
/*
Time Complexities:

Worst Case Complexity: O(n2)
If we want to sort in ascending order and the array is in descending order then, the worst case occurs.
Best Case Complexity: O(n2)
It occurs when the array is already sorted
Average Case Complexity: O(n2)
It occurs when the elements of the array are in jumbled order (neither ascending nor descending).
*/
        void selectionSort(int[] arr){

            for (int i=0;i<arr.length-1;i++){
                int min = i;
                for (int j=i+1;j<arr.length;j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                    int temp =arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;
                }
            for (int j : arr) {
                System.out.println(j);
            }
            }
        }
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        SelectionSort s1 = new SelectionSort();
        s1.selectionSort(arr);
    }
}