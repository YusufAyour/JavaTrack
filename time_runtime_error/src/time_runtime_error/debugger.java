package time_runtime_error;

import java.net.URI;
import java.net.URISyntaxException;

public class debugger {

	public static void main(String[] args) {
	

	try {
		URI url = new URI("https:\\www.oracle.com");
	} catch (URISyntaxException e) {
		
		System.out.println(e.getMessage());

	}

 
 System.out.println("Muhammed Essa");


	}

}
