package SerializeandDeserize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fileName = "employee.ser";
		serializeObject(fileName);
		//deserializeObject(fileName);
		

	}

	private static void serializeObject(String fileName) {
		// TODO Auto-generated method stub
		Address address = new Address(1211, "address 1", "address 2", "Fremont", 94567);
		Employee employee = new Employee(345, "satinder", 35, "satinder@ok.com", "123", address);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))){
			oos.writeObject(employee);
			System.out.println("Object is serialized....");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	
	private static void deserializeObject(String fileName) {
		// TODO Auto-generated method stub
//		Address address = new Address(1211, "address 1", "address 2", "Fremont", 94567);
//		Employee employee = new Employee(345, "satinder", 35, "satinder@ok.com", "123", address);

		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName)))){
			Object object = ois.readObject();
			Employee employee = (Employee) object;
			System.out.println(employee);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
