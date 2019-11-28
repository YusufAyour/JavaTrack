import java.util.HashMap;

public class HashM {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("Muhammed", "Essa");
		hm.put("Ali", "Hussein");
		hm.put("Hayder", "Usama");
		
		System.out.println(hm);
		hm.put("Omer", "Yusuf");
		hm.put("Muhsin", "Mustafa");
		System.out.println(hm);
		
		System.out.println(hm.get("Omer"));
		hm.remove("Muhsin");
		System.out.println(hm);
	}

}
