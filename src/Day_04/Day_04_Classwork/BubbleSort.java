package Day_04.Day_04_Classwork;
public class BubbleSort{
public static void main(String args[]){
int a[]={5,4,3,2,1,9,8,7,6};
for(int i=0;i<9;i++){
for(int j=0;j<9-i-1;j++){
if(a[j]>a[j+1]){
int t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println("sorted");
for(int i=0;i<9;i++){
System.out.print(a[i]+" ");
}
}
}
