import java.util.ArrayList;

public class Array3 {

	public static void main(String[] args) {
	
ArrayList<String> names = new ArrayList<String>();

names.add("Muhameed");
names.add("Essa");
names.add("Ali");
names.add("Hameed");

//System.out.println(names);

names.add("Ahmed");
names.add("Usama");
//System.out.println(names);

names.remove(1);
System.out.println(names);
System.out.println(names.get(2));
//String name = names.get(0);
//System.out.println(name);

System.out.println(names.indexOf("Ahmed"));

	}

}
