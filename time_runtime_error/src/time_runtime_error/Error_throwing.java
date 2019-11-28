package time_runtime_error;

public class Error_throwing {

	public static void main(String[] args) {
		try {
			myArray();
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("there is an error the item"
					+ " was out of bounds");

		}

	}

	private static void myArray() 
			throws ArrayIndexOutOfBoundsException{
		int [] num2 = {1,2,3};
		System.out.println(num2[3]);
	}

}
