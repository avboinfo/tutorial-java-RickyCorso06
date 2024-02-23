import java.util.ArrayList;

public class ProveArrayList {
    public static void main(String[] args) {

        System.out.println(x:"Questo codice funziona!");

        ArrayList<String> a = new ArrayList<>();
        a.add(e:"uno");
        a.add(e:"Babina");
        a.add(e:"tre");  
        a.add(e:"quattro");
        a.add(e:"cinque");

        a.remove(o:"Babina");
        a.add(index:1,element:"due");
        System.out.println(a);                            
    }
} 