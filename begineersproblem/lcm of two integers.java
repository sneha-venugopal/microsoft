import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the First number :");
    int a=sc.nextInt();
    System.out.println("Enter the Second number :");
    int b=sc.nextInt();
    int max=0;
    if(a>b)
    {
      max=a;
    }
    else
    {
      max=b;
    }
    int gcd=0,lcm=0;
    for(int i=max;i>=1;i--)
      {
        if(a%i==0 && b%i==0)
        {
          gcd=i;
          break;
        }
      }
    lcm=(a*b)/gcd;
    System.out.println("The LCM of two numbers is "+lcm);
    
  }
}
