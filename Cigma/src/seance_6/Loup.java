package seance_6;

public class Loup { //final
	static final int NombrePieds = 4;
	
	//final int Validator(int age) {
	int Validator(int age) {
		if(age == 0 | ++age == 0) {
			return age;
		}
		return 10;
	}
	
}
