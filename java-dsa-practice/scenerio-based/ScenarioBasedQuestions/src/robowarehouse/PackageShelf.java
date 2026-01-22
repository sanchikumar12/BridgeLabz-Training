package robowarehouse;

class PackageShelf {
    private int[] shelf;
    private int size;

    public PackageShelf(int capacity) {
        shelf = new int[capacity];
        size = 0;
    }

    // Insert package using insertion sort logic
    public void insertPackage(int weight) {
        int i = size - 1;

        // Shift heavier packages to the right
        while (i >= 0 && shelf[i] > weight) {
            shelf[i + 1] = shelf[i];
            i--;
        }

        shelf[i + 1] = weight;
        size++;

        System.out.println("Package inserted: " + weight);
    }

    // Display shelf
    public void displayShelf() {
        System.out.print("Shelf : ");
        for (int i = 0; i < size; i++) {
            System.out.print(shelf[i] + " ");
        }
        System.out.println();
    }
}
