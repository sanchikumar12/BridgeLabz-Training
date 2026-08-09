package Day_05.Day_05_Classwork;
public class QuickSort{
static int p(int a[],int l,int h){
int p1=a[h];
int i=(l-1);
for(int j=l;j<h;j++){
if(a[j]<p1){
i++;
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
int t=a[i+1];
a[i+1]=a[h];
a[h]=t;
return i+1;
}
static void q(int a[],int l,int h){
if(l<h){
int pi=p(a,l,h);
q(a,l,pi-1);
q(a,pi+1,h);
}
}
public static void main(String[] args){
int a[]={10,7,8,9,1,5};
int n=6;
q(a,0,n-1);
System.out.println("q sorted");
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
}
