package zipzipmart;

import java.util.Arrays;

public class ZipZipMart {

    static class Sale {
        String date;
        int amount;

        Sale(String date, int amount) {
            this.date = date;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return date + " - " + amount;
        }
    }

    public static void mergeSort(Sale[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(Sale[] arr, int left, int mid, int right) {
        Sale[] temp = new Sale[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i].date.compareTo(arr[j].date) < 0 ||
               (arr[i].date.compareTo(arr[j].date) == 0 && arr[i].amount <= arr[j].amount)) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {
        Sale[] sales = {
            new Sale("2025-01-02", 500),
            new Sale("2025-01-01", 300),
            new Sale("2025-01-02", 200),
            new Sale("2025-01-01", 300),
            new Sale("2025-01-03", 1000)
        };

        mergeSort(sales, 0, sales.length - 1);
        System.out.println(Arrays.toString(sales));
    }
}
