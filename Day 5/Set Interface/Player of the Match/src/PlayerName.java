import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class PlayerName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No of Players: ");
		int n = sc.nextInt();
		
		System.out.println("Enter a string: ");
		String[] str = new String[n];    
		Scanner sc1 = new Scanner(System.in);
		for (int i = 0; i < n; i++)   
		{  
		str[i] = sc1.nextLine();
		
		}  
		
		 Set<String> hs = new TreeSet<String>(); 
		  for (int i = 0; i < n; i++)
		  {
		  hs.add(str[i]);
		  }
		  Set<String> sorted = new TreeSet<String>(hs);
		  System.out.println("Sorted Set: " + sorted);
		 
	sc.close();
	sc1.close();
	}
}
