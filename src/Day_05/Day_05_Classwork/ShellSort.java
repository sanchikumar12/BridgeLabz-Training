package Day_05.Day_05_Classwork;
public class ShellSort{
public static void main(String args[]){
int a[]={12,34,54,2,3};
int n=5;
for(int g=n/2;g>0;g/=2){
for(int i=g;i<n;i+=1){
int t=a[i];
int j;
for(j=i;j>=g&&a[j-g]>t;j-=g){
a[j]=a[j-g];
}
a[j]=t;
}
}
System.out.println("sorted shell");
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
}
