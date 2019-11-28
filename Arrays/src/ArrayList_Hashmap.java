import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class ArrayList_Hashmap {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		//System.out.println(list);
		ListIterator<Integer>listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			Integer value = listIterator.next();
			System.out.println(value);
			
		}
		
		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("Samir", "Hassan");
		hm.put("Muhammed", "Hussein");
		hm.put("Hayder", "Usama");
		
		System.out.println(hm);
		
		Set<String> keys =hm.keySet();
		Iterator<String>Iterator2 = keys.iterator();
		while (Iterator2.hasNext()) {
			String s = Iterator2.next();
			System.out.println(s+  "  "  + hm.get(s));
			
		}
		
		}
        }
		
        



