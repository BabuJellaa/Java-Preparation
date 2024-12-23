package com.tech.multithreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class UserProfile implements Serializable{

	private String username;
	private transient String password;

	public UserProfile(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Username: " + username + ", Password: " + password;
	}
}
public class TransientKeyWord {
	public static void main(String[] args) {
		UserProfile profile= new UserProfile("Babu Jella", "Babu@4949");
		try {
			FileOutputStream fileOutputStream= new FileOutputStream("C:\\Babu\\TransientExample\\myfile.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(profile);
			System.out.println("Changes saved in a file..!!");
			objectOutputStream.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		 // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Babu\\TransientExample\\myfile.txt"))) {
            UserProfile deserializedUser = (UserProfile) ois.readObject();
            System.out.println("Deserialized User: " + deserializedUser);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

	}
}
