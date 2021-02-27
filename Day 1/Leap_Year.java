import java.util.*;
import java.io.*;
public class Leap {
  public static void main(String[] args)
  {
  	Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    if (n>0)
    {
    if (n%4==0)
    {
    	System.out.println("Yes");
    }
    else
    {
    	System.out.println("No");
    }
}
    else{
    System.out.println("Invaild Input");
  }
    sc.close();
}
}
