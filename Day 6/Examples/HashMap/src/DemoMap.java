import java.util.HashMap;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101,"Arun");
		hm.put(102,"Ajay");
		hm.put(103,"Adi");
		hm.put(104,"Ajay");
		hm.put(105,"Aditi");
		System.out.println(hm);
	}
}