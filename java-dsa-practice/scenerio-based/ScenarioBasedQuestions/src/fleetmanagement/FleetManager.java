package fleetmanagement;

import java.util.*;
public class FleetManager {

    public static void mergeSort(Vehicle[] vehicles, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(vehicles, left, mid);
            mergeSort(vehicles, mid + 1, right);

            merge(vehicles, left, mid, right);
        }
    }

    private static void merge(Vehicle[] vehicles, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Vehicle[] leftArr = new Vehicle[n1];
        Vehicle[] rightArr = new Vehicle[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = vehicles[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = vehicles[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i].mileage <= rightArr[j].mileage) {
                vehicles[k++] = leftArr[i++];
            } else {
                vehicles[k++] = rightArr[j++];
            }
        }

        while (i < n1) vehicles[k++] = leftArr[i++];
        while (j < n2) vehicles[k++] = rightArr[j++];
    }

    public static void main(String[] args) {

        Vehicle[] masterSchedule = {
            new Vehicle("V-101", 12000),
            new Vehicle("V-102", 8000),
            new Vehicle("V-103", 15000),
            new Vehicle("V-104", 6000),
            new Vehicle("V-105", 10000)
        };

        mergeSort(masterSchedule, 0, masterSchedule.length - 1);

        for (Vehicle v : masterSchedule) {
            System.out.println(v);
        }
    }
}
