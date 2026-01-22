package eduresults;



public class EduResult {
    //method that merge two sorted portions 
    private static void mergeSortedSections(
            int[] studentScores,
            int leftIndex,
            int middleIndex,
            int rightIndex) {

        int leftArraySize = middleIndex - leftIndex + 1;
        int rightArraySize = rightIndex - middleIndex;
        int[] leftScores = new int[leftArraySize];
        int[] rightScores = new int[rightArraySize];

        for (int i = 0; i < leftArraySize; i++) {
            leftScores[i] = studentScores[leftIndex + i];
        }

        for (int j = 0; j < rightArraySize; j++) {
            rightScores[j] = studentScores[middleIndex + 1 + j];
        }

        int leftPointer = 0;
        int rightPointer = 0;
        int mergedPointer = leftIndex;
        while (leftPointer < leftArraySize && rightPointer < rightArraySize) {
            if (leftScores[leftPointer] <= rightScores[rightPointer]) {
                studentScores[mergedPointer++] = leftScores[leftPointer++];
            } else {
                studentScores[mergedPointer++] = rightScores[rightPointer++];
            }
        }
        while (leftPointer < leftArraySize) {
            studentScores[mergedPointer++] = leftScores[leftPointer++];
        }

        while (rightPointer < rightArraySize) {
            studentScores[mergedPointer++] = rightScores[rightPointer++];
        }
    }
    //merge Sort algorithm
    private static void mergeSortStudentScores(
            int[] studentScores,
            int startIndex,
            int endIndex) {

        if (startIndex < endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            mergeSortStudentScores(studentScores, startIndex, middleIndex);
            mergeSortStudentScores(studentScores, middleIndex + 1, endIndex);

            mergeSortedSections(studentScores, startIndex, middleIndex, endIndex);
        }
    }

    public static void main(String[] args) {

        int[] districtWiseStudentScores = {45, 55, 65, 70,40, 50, 60, 75};

        mergeSortStudentScores(
                districtWiseStudentScores,
                0,
                districtWiseStudentScores.length - 1
        );

        System.out.println("Final state-wise Rank list:");
        for (int score : districtWiseStudentScores) {
            System.out.print(score + " ");
        }
    }
}
