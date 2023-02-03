//  Реализовать алгоритм пирамидальной сортировки (HeapSort)

public class Prog_5_3 {
    public static void main(String[] args) {
        int array[] = { 8, 9, 10, 5, 12, 6, 7, 11 };
        int n = array.length;

        Prog_5_3 ob = new Prog_5_3();
        ob.sort(array);

        System.out.println("Размер: " + n);

        System.out.println("Отсортированный массив: ");
        printArray(array);
    }

    public void sort(int array[]) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

            for (int i = n - 1; i >= 0; i--) {
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;
                heapify(array, i, 0);
            }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;
        
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

}
