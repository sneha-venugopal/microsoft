import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number :");
    int N=sc.nextInt();
    System.out.println("The digits in the number are :");
    while(N>0)
      {
        System.out.println(N%10+" ");
        N/=10;
      }
  }
}
