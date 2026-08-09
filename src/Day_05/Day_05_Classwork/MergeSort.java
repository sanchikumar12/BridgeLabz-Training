package Day_05.Day_05_Classwork;
public class MergeSort{
static void m(int a[],int l,int m1,int r){
int n1=m1-l+1;
int n2=r-m1;
int L[]=new int[n1];
int R[]=new int[n2];
for(int i=0;i<n1;++i)
L[i]=a[l+i];
for(int j=0;j<n2;++j)
R[j]=a[m1+1+j];
int i=0,j=0;
int k=l;
while(i<n1&&j<n2){
if(L[i]<=R[j]){
a[k]=L[i];
i++;
}else{
a[k]=R[j];
j++;
}
k++;
}
while(i<n1){
a[k]=L[i];
i++;
k++;
}
while(j<n2){
a[k]=R[j];
j++;
k++;
}
}
static void s(int a[],int l,int r){
if(l<r){
int m=(l+r)/2;
s(a,l,m);
s(a,m+1,r);
m(a,l,m,r);
}
}
public static void main(String args[]){
int arr[]={38,27,43,3,9,82,10};
s(arr,0,6);
System.out.println("merge sorted");
for(int i=0;i<7;i++){
System.out.print(arr[i]+" ");
}
}
}
