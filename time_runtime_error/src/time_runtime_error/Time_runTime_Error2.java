package time_runtime_error;

public class Time_runTime_Error2 {

	public static void main(String[] args) {
	
		try {
			int [] num2 = {1,2,3};
			System.out.println(num2[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
		
			// e.printStackTrace();
			System.out.println("there is an error in array");
		}
    
		System.out.println("Muhammed Essa Hameed");

	}

}
