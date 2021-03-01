import java.util.HashSet;

import javax.print.event.PrintJobListener;

public class hash {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("Virat");
        hs.add("Dhoni");
        hs.add("Rohit");
        hs.add("Virat");
        System.out.println(hs);
    }
}
