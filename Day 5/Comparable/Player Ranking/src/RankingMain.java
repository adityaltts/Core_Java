import java.util.*;
public class RankingMain {
		public static void main(String args[]){  
			ArrayList<Players> al=new ArrayList<Players>();  
			Scanner sc =new Scanner(System.in);
			int number;
			int Score,count=0;
			String name;
			System.out.println("Enter number of players");
		number=sc.nextInt();
		System.out.println("Enter the name and score respectively");
		
		for(int i=0;i<number;i++) {
			Scanner in =new Scanner(System.in);
			name=in.nextLine();
			Score=in.nextInt();
			al.add(new Players(Score,name));
			in.close();
		}			
			Collections.sort(al);  
			for(Players st:al){  
				count++;
			System.out.println(count+" "+st.Score+" "+st.name+" ");  
		}
			sc.close();
	}
}