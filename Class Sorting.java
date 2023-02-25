class Sorting 
{
public static void main(string args[])
{
int a[]-new int[5];
try {
for (int i=0;i<5;i++)

a[i]=integer.parseInt(args[i]);
System.out.println("\n before sorting \n");
for(int i=0;i<5;i++)
System.out.print("" +a[i]);


bubble sort (a,5);
System.out.println("\n\n after sorting \n");
System.out.println("Ascending order \n");
for(int i=0;i<5;i++)
System.out.println(""+a[i]);
Sytem.out.println("\n\n Descending order \n");

for(int i=4;i>=0;i--)
system.out.print(" "+a[i]);
}
catch (numberFormatException e) {
System.out.prinln("enter only integers");
}
catch (Arrayindexoutofboundsexception e) {
system.out.println("enter only 5 integers ");
}
}



private static void bubblesSort (int[] arr,int length) {
int temp,i,j;
for(i=0;i<length-1;i++) {
for(j=0;j<length-1-i;j++) {
if(arr[j]>arr[j+1] {
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
}
}


