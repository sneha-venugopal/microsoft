/*Pascals triangle
      1    
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
  */  
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number if rows :");
    int N=sc.nextInt();
    int arr[][]=new int[100][100];
    for(int i=0;i<N;i++)
      {
        arr[i][i]=1;
        arr[i][0]=1;
      }
    for(int i=0;i<N;i++)
      {
        for(int j=1;j<i;j++)
          {
            arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
          }
      }
    int sp=N-1;
    for(int i=0;i<N;i++)
       {
           for(int j=0;j<sp;j++) // loop for printing the spaces
           {
               System.out.print(" ");
           }
           for(int j=0;j<=i;j++)
           {
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
           sp--;
       }
  }
}
