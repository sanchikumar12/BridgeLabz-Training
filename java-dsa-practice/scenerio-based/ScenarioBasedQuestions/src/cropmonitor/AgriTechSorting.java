package CropMonitor;

import java.util.Scanner;

public class AgriTechSorting {

    public static int partition(SensorData[] arr, int low, int high) {
        long pivot = arr[high].timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].timestamp <= pivot) {
                i++;
                SensorData temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        SensorData temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort(SensorData[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        SensorData[] data = new SensorData[n];

        for (int i = 0; i < n; i++) {
            long time = sc.nextLong();
            double temp = sc.nextDouble();
            data[i] = new SensorData(time, temp);
        }

        quickSort(data, 0, n - 1);

        for (SensorData d : data) {
            System.out.println(d.timestamp + " " + d.temperature);
        }

        sc.close();
    }
}