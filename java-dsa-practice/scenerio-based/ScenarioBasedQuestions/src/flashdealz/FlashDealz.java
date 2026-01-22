package flashdealz;


//Create a FlashDealz that done 
public class FlashDealz {

    //method that partition the array and return pivot index
    private static int partitionByDiscount(int[] productDiscounts,int startIndex,int endIndex) {

        int pivotDiscount = productDiscounts[endIndex];
        int smallerElementIndex = startIndex - 1;
        for (int currentIndex = startIndex; currentIndex < endIndex; currentIndex++) {
            if (productDiscounts[currentIndex] <= pivotDiscount) {
                smallerElementIndex++;
                swap(productDiscounts, smallerElementIndex, currentIndex);
            }
        }

        swap(productDiscounts, smallerElementIndex + 1, endIndex);
        return smallerElementIndex + 1;
    }

    // Quick Sort function
    private static void quickSortByDiscount(
            int[] productDiscounts,
            int startIndex,
            int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partitionByDiscount(
                    productDiscounts,
                    startIndex,
                    endIndex
            );

            quickSortByDiscount(productDiscounts, startIndex, pivotIndex - 1);
            quickSortByDiscount(productDiscounts, pivotIndex + 1, endIndex);
        }
    }
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tempValue;
    }
    public static void main(String[] args) {

        int[] productDiscounts = {30, 10, 50, 20, 40, 60};

        quickSortByDiscount(productDiscounts,0,productDiscounts.length - 1);

        System.out.println("products sorted by discount:");
        for (int discount : productDiscounts) {
            System.out.print(discount + "% ");
        }
    }
}
