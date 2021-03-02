import java.util.Map;
import java.util.TreeMap;

public class DemoTree {

	public static void main(String[] args) {
		Map<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(101,"Arun");
		tm.put(102,"Ajay");
		tm.put(103,"Adi");
		tm.put(104,"Ajay");
		tm.put(105,"Aditi");
		System.out.println(tm);
		for(Map.Entry m: tm.entrySet())
		{
			System.out.println(m.getKey()+" - "+m.getValue());
		}
		System.out.println(tm.get(104));
		tm.remove(102);
		System.out.println(tm);
	}

}
