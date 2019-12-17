package operators.equality.strings;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name_1 = "Imzoughene";
		String name_2 = "Imzoughene";
		String name_3 = new String("Imzoughene");
		String name_4 = new String("Imzoughene");
		if(name_1 == name_2) {
			System.out.println("They match !");
		}else {
			System.out.println("Not match");
		}
		
		System.out.println("-----------------");
		if(name_1 == name_3) {
			System.out.println("They match");
		}else {
			System.out.println("Not match");
		}
		
		System.out.println("-----------------");
		if(name_3.equals(name_4)) {
			System.out.println("They match");
		}else {
			System.out.println("Not match");
		}
	}

}
