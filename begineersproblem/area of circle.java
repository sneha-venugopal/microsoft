import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius of the circle :");
    float r=sc.nextInt();
    float area=(r*r*3.14f);
    System.out.print("The area of circle is : "+area);
  }
}
