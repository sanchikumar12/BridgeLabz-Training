package Day_04.Day_04_Classwork;
public class SelectionSort{
public static void main(String[] args) {
int[] arr = {64,25,12,22,11};
int len = 5;
for(int i=0; i<len-1; i++) {
int min = i;
for(int j=i+1; j<len; j++) {
if(arr[j] < arr[min]) {
min = j;
}
}
int temp = arr[min];
arr[min] = arr[i];
arr[i] = temp;
}
System.out.println("after sort");
for(int i=0;i<len;i++)
System.out.println(arr[i]);
}
}
