package multiThreadingSer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person objP = new person("ruchika", 1234);
		
		try {
			FileOutputStream file = new FileOutputStream("person.ser");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(objP);
			out.close();
			file.close();
			System.out.println("Object is serialized");
		}
		catch (IOException e) {
			System.out.println("Exception caught: "+e.getMessage());
		}
	}

}
