package Day_04.Day_04_Classwork;
public class InsertionSort{
public static void main(String args[]){
int x[]={10,3,2,5,8,4,3,1};
int n=8;
for(int i=1;i<n;i++){
int k=x[i];
int j=i-1;
while(j>=0&&x[j]>k){
x[j+1]=x[j];
j=j-1;
}
x[j+1]=k;
}
for(int i=0;i<n;i++)
System.out.print(x[i]+" ");
}
}
