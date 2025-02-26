package multiThreadingSer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserializationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ser file is there we need to do input operation
		//working with a file so IO exception , file not found exception
		try {
			FileInputStream file = new FileInputStream("person.ser");
			ObjectInputStream in = new ObjectInputStream(file);
			
			person p = (person) in.readObject();
			file.close();
			in.close();
			System.out.println("Object is deserialized"+p);
		}
		catch (IOException | ClassNotFoundException e) {
			System.out.println("Exception caught: "+e.getMessage());
		}
	}

}
