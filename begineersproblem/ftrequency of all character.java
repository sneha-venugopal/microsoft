import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string :");
    String s=sc.nextLine();
    int arr[]=new int[26];
    for(int i=0;i<s.length();i++)
      {
        arr[s.charAt(i)-'a']++;
      }
    for(int i=0;i<26;i++)
      {
        if(arr[i]>0)
        {
          System.out.println((char)(i+'a')+" "+arr[i]);
        }
      }
  }
}
